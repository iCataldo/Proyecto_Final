import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JPanel {
    private int comboxX=0;
    private int comboxY=0;
    private int posicionY=20;
    private InicioDesino combox = new InicioDesino();
    private FabricaBus fabrica=new FabricaBus();
    private JPanel panel2 =new JPanel();
    private JPanel panel3 =new JPanel();

    public PanelPrincipal(){
        combox.addAccion(accionCombox);
        this.setLayout(null);
        this.add(combox.ParametroComboBox());
        panel2.setBackground(new Color(10,10,120));
        panel2.setBounds(250,0,850,800);
        combox.ParametroComboBox().setBounds(15,10,220,150);
        this.setBounds(0,0,1100,800);
        this.setBackground(new Color(34, 34, 45));
        this.add(panel2);
        panel3.setLayout(null);
        panel3.setBounds(0,180,250,600);
        panel3.setBackground(new Color(128,128,128));
        this.add(panel3);
    }

    public void RemoverBoton(){
        this.remove(panel3);
        panel3=new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(0,180,250,600);
        panel3.setBackground(new Color(128,128,128));
        this.add(panel3);
    }

    public void addButton(JButton butt){
        panel3.add(butt);
    }
    public ActionListener accionCombox= new ActionListener() {
        @Override

        public void actionPerformed(ActionEvent e) {

            RemoverBoton();
            for (int i=0;i<fabrica.listaBuz(combox.getlista(),combox.getlista2()).size();i++){
                definiBus(fabrica.listaBuz(combox.getlista(),combox.getlista2()).get(i));
            }

            posicionY=20;
            JPanel p = new JPanel();
            p.setBackground(new Color(10,10,120));
            panelinfo(p);
        }
    };
    public void definiBus(PanelBus buz){
        if (combox.getlista()!=-1&&combox.getlista2()!=-1&&combox.getlista()!= combox.getlista2()){
            buz.DesBlockeo();
            addButton(buz.getBuses());
            buz.getBuses().setBounds(10,posicionY,220,110);
            posicionY+=130;
            ActionListener addAccionBus=new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panelinfo(buz);
                }
            };
            buz.getBuses().addAccion(addAccionBus);
        }
        else {
            RemoverBoton();
        }
    }
    public void renovar(){
        for (int i=0;i<fabrica.listaBuz(combox.getlista(),combox.getlista2()).size();i++){

            this.remove(fabrica.listaBuz(combox.getlista(),combox.getlista2()).get(i));
            fabrica.listaBuz(combox.getlista(),combox.getlista2()).get(i).setBounds(0,0,0,0);
        }
        this.remove(panel2);
        panel2.setBounds(0,0,0,0);
    }

    public void panelinfo(JPanel panelBus) {
        renovar();
        panel2 = panelBus;
        this.add(panel2);
        this.setBounds(0,0,1100,800);
        panelBus.setBounds(250,0,850,800);
    }
}
