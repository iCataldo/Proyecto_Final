import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonSilla extends JButton {
    Silla silla;
    public ButtonSilla(Silla silla){
        this.setBackground(Color.GRAY);
        this.silla=silla;
        this.setText(silla.getImagen());
    }

    public int getPrecio() {
        return silla.getPrecio();
    }
}
