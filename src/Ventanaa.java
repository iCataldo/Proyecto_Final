import javax.swing.*;

public class Ventanaa extends JFrame {
    PanelPrincipal p1 = new PanelPrincipal();
    public Ventanaa(){
        this.setLayout(null);
        this.add(p1);
        this.add(p1.infoBus());
        this.setSize(1100, 800);
        this.setVisible(true);
        this.setTitle("Proyecto");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
