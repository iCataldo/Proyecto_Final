import javax.swing.*;
import java.awt.event.ActionListener;

public class Buses extends JButton {
    private ListaSilla list;
    private int capacidad;
    //text es el nombre estandar del boton
    private String text="Bus";
    /*esta Clase se crea con una direcion y tres numeros que representan las
    cantidad de silas cada tipo
     */
    //la direcion es una clase que consulta con una tabla la distancia y tiempo
    //en el contructor crean las sillas que se almacenas en ListaSilla
    //la capacidad es la suma de la cantidad de los tres tipo de silla
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
        ImageIcon icon = new ImageIcon("SiluetaVehiculo-01.png");

        this.setIcon(icon);
    }
    //este metodo cambia el nombre estandar del boton
    public void settext(String s){
        text = s;
        this.setText(text);
    }
    //este metodo entrega la lista que se usa en esta clase
    public ListaSilla getList(){
        return list;
    }
    //este metodo agrega una accion al presionar el boton
    public void addAccion(ActionListener ae) {
        this.addActionListener(ae);
    }

}
