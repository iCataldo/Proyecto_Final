import javax.swing.*;
import java.awt.event.ActionListener;

public class Buses extends JButton {
    private ListaSilla list;
    private int capacidad;
    private String text="Bus";
    public Buses(Direccion direc,int SiLLaPref,int SillaNorm,int Sillacama){
        this.setText(text);
        capacidad=SillaNorm + SiLLaPref + Sillacama;
        list = new ListaSilla(capacidad);
        for (int i=0;i<SiLLaPref;i++){
            list.addSilla(new SillaPreferencial());
        }
        for (int i=0;i<SillaNorm;i++){
            list.addSilla(new SillaNormal());
        }
        for (int i=0;i<Sillacama;i++){
            list.addSilla(new SillaCama());
        }
        list.reset();
    }
    public void settext(String s){
        text = s;
        this.setText(text);
    }
    public ListaSilla getList(){
        return list;
    }

    public void addAccion(ActionListener ae) {
        this.addActionListener(ae);
    }

    public void print() {
        list.printf();
    }
}
