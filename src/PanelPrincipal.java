import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JPanel {
    private JPanel panel2 =new JPanel();
    private InicioDesino combox = new InicioDesino();
    private Buses bus = new Buses(new Direccion(combox.getlista(),combox.getlista2()),8,9,5);
    public PanelPrincipal(){
        combox.addAccion(accionBus);
        bus.addAccion(accionInfo);
        this.setLayout(null);
        this.add(combox.ParametroComboBox());
        combox.ParametroComboBox().setBounds(20,10,220,150);
        this.setBounds(0,0,250,800);
        this.setBackground(Color.cyan);
        this.add(panel2);
    }
    public JPanel infoBus(){
        panel2.setBounds(250,0,1100,800);
        panel2.setBackground(Color.red);
        return panel2;
    }
    public void addButton(JButton butt){
        this.add(butt);
    }
    public ActionListener accionBus = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (combox.getlista()!=-1&&combox.getlista2()!=-1&&combox.getlista()!= combox.getlista2()){
                bus.setEnabled(true);
                System.out.println(combox.getlista()+","+combox.getlista2());
                addButton(bus);
                bus.setBounds(10,220,220,110);
            }
            else {
                bus.setEnabled(false);
            }
        }
    };
    public ActionListener accionInfo = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            panel2.setBackground(Color.green);
        }
    };
}
