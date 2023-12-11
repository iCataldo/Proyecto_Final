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

    public PanelPrincipal(){
        listaBuz.addBus(fabric.getbus("chico"));
        listaBuz.addBus(fabric.getbus("doble"));
        listaBuz.addBus(fabric.getbus("grande"));
        combox.addAccion(accionCombox);
        this.setLayout(null);
        this.add(combox.ParametroComboBox());
        panel2.setBackground(Color.BLUE);
        panel2.setBounds(250,0,850,800);
        combox.ParametroComboBox().setBounds(20,10,220,150);
        this.setBounds(0,0,1100,800);
        this.setBackground(Color.cyan);
        this.add(panel2);

    }

    public void addButton(JButton butt){
        this.add(butt);
    }
    public ActionListener accionCombox= new ActionListener() {
        @Override

        public void actionPerformed(ActionEvent e) {
            JPanel p = new JPanel();
            p.setBackground(Color.BLUE);
            panelinfo(p);
            for (int i=0;i<3;i++){
                definiBus(listaBuz.get(i));
            }
            posicionY=220;
        }
    };
    public void definiBus(PanelBus bus){
        Buses buz=bus.getBuses();
        if (combox.getlista()!=-1&&combox.getlista2()!=-1&&combox.getlista()!= combox.getlista2()){
            buz.setEnabled(true);
            addButton(buz);
            buz.setBounds(10,posicionY,220,110);
            posicionY+=130;
            ActionListener addAccionBus=new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panelinfo(bus);
                }
            };
            buz.addAccion(addAccionBus);
        }
        else {
            buz.setEnabled(false);

        }
    }
    public void renovar(){
        for (int i=0;i<3;i++){
            this.remove(listaBuz.get(i));
            listaBuz.get(i).setBounds(0,0,0,0);
        }
        this.remove(panel2);
        panel2.setBounds(0,0,0,0);
    }

    public void panelinfo(JPanel panelBus) {
        renovar();
        this.add(panelBus);
        this.setBounds(0,0,1100,800);
        panelBus.setBounds(250,0,850,800);
    }
}
