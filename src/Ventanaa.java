import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanaa extends JFrame {
    private PanelPrincipal p1 = new PanelPrincipal();
    private Direccion jueves =new Direccion(1,0);
    private JPanel p2=new JPanel();
    private PanelBus p3 = new PanelBus(new FabricaBus(jueves).getbus("chico"));
    public Ventanaa(){
        this.setLayout(null);
        this.add(p1);
        this.setSize(1100, 800);
        this.setVisible(true);
        this.setTitle("Proyecto");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public ActionListener accionCortina = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Cortina();
        }
    };

    public ActionListener cambio = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            NuevaPantalla();
        }
    };
    public void NuevaPantalla() {
        this.remove(p2);
        this.add(p3);
        p3.setBounds(250,0,850,800);
    }
    public void Cortina(){
        p2.setBackground(Color.BLUE);
        this.add(p2);
        p2.setBounds(250,0,850,800);
    }
}
