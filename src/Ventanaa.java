import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanaa extends JFrame {
    private PanelPrincipal p1 = new PanelPrincipal();
    //ventana muestra el panel principal
    public Ventanaa(){
        this.setLayout(null);
        this.add(p1);
        this.setSize(1100, 800);
        this.setVisible(true);
        this.setTitle("Proyecto");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
