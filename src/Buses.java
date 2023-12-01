import javax.swing.*;
import java.awt.event.ActionListener;

public class Buses extends JButton {
    private ListaSilla list;
    private int capacidad;
    public Buses(Direccion direc,int Spref,int Snorm,int Scama){
        capacidad=Snorm + Spref + Scama;
        list = new ListaSilla(capacidad);
        for (int i=0;i<Spref;i++){
            list.addSilla(new SillaPreferencial());
        }
        for (int i=0;i<Snorm;i++){
            list.addSilla(new SillaNormal());
        }
        for (int i=0;i<Scama;i++){
            list.addSilla(new SillaCama());
        }
    }
    public void addAccion(ActionListener ae) {
        this.addActionListener(ae);
    }

    public void print() {
        list.printf();
    }
}
