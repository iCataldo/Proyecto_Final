import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonSilla extends JButton {
    private Silla silla;
    /* Este boton guarda la informacion de la silla que entrega
    este botone es gris
    silla.getImagen() es la inicial del tipo de silla
     */
    public ButtonSilla(Silla silla){
        this.setBackground(Color.GRAY);
        this.silla=silla;
        this.setText(silla.getImagen());
    }
    //este metodo entrega el precio de la silla guardada
    public int getPrecio() {
        return silla.getPrecio();
    }
}
