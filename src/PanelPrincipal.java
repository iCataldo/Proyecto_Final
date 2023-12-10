import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JPanel {
    private int posicionY=220;
    private InicioDesino combox = new InicioDesino();
    private Direccion direccion= new Direccion(combox.getlista(),combox.getlista2());
    private ListaBus listaBuz = new ListaBus();
    private JPanel panel2 =new JPanel();
    private FabricaBus fabric=new FabricaBus(direccion);
    private ActionListener accionCom;
    public PanelPrincipal(){
        listaBuz.add(fabric.getbus("chico"));
        listaBuz.add(fabric.getbus("doble"));
        listaBuz.add(fabric.getbus("chico"));
        combox.addAccion(accionCombox);
        this.setLayout(null);
        this.add(combox.ParametroComboBox());
        //bus.addActionListener(accionbus);
        panel2.setBackground(Color.pink);
        panel2.setBounds(250,0,850,800);
        combox.ParametroComboBox().setBounds(20,10,220,150);
        this.setBounds(0,0,1100,800);
        this.setBackground(Color.cyan);
        this.add(panel2);

    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void addButton(JButton butt){
        this.add(butt);
    }
    public ActionListener accionCombox= new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i=0;i<3;i++){
                definiBus(listaBuz.get(i));
            }
        }
    };
    public void definiBus(Buses buz){
        if (combox.getlista()!=-1&&combox.getlista2()!=-1&&combox.getlista()!= combox.getlista2()){
            buz.setEnabled(true);
            System.out.println(combox.getlista()+","+combox.getlista2());
            addButton(buz);
            buz.setBounds(10,posicionY,220,110);
            posicionY+=130;
            ActionListener addAccionBus=new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panelinfo(new PanelBus(buz));
                }
            };

            buz.addAccion(addAccionBus);
        }
        else {
            buz.setEnabled(false);
        }
    }
    public void panelinfo(PanelBus panelBus) {
        this.remove(panel2);
        panel2=panelBus;
        this.add(panel2);
        panel2.setBounds(250,0,850,800);
    }
}
