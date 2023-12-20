import javax.swing.*;
import java.awt.event.ActionListener;

abstract class Buses extends JButton {

    //CordenadaX y CordenadaY de la tabla
    protected int CordenadaX = 0;
    protected int CordenadaY = 0;
    protected Tiempo tiempo;
    protected ListaSilla list;
    protected int capacidad;
    //text es el nombre estandar del boton
    private String text="Bus";
    /*esta Clase se crea con una direcion y tres numeros que representan las
    cantidad de silas cada tipo
     */
    //la direcion es una clase que consulta con una tabla la distancia y tiempo
    //en el contructor crean las sillas que se almacenas en ListaSilla
    //la capacidad es la suma de la cantidad de los tres tipo de silla
    public Buses(Tiempo t){
        tiempo=t;
        this.setText(text);
        ImageIcon icon = new ImageIcon("SiluetaVehiculo-01.png");

        this.setIcon(icon);
    }
    //este metodo cambia el nombre estandar del boton
    public void settext(String s){
        text = s;
        this.setText(text);
    }
    public void posicion(){
        CordenadaX++;
        if (CordenadaX == 4) {
            CordenadaX = 0;
            CordenadaY++;
        }
    }
    public Tiempo getiempo(){
        return tiempo;
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
class BusGrande extends Buses {
    public BusGrande(Tiempo t) {
        super( t);
        this.setText("Bus Grande");
        capacidad = 36;
        list = new ListaSilla(capacidad);
        for (int i = 0; i < 8; i++) {
            list.add(new SillaPreferencial(CordenadaX,CordenadaY));
            posicion();
        }
        for (int i = 0; i < 20; i++) {
            list.add(new SillaNormal(CordenadaX,CordenadaY));
            posicion();
        }
        for (int i = 0; i < 8; i++) {
            list.add(new SillaCama(CordenadaX,CordenadaY));
            posicion();
        }
        list.reset();
        ImageIcon icon = new ImageIcon("SiluetaVehiculo-01.png");

        this.setIcon(icon);
    }
}
class BusChico extends Buses {
    public BusChico(Tiempo t) {
        super(t);
        this.setText("Bus Chico");
        capacidad = 28;
        list = new ListaSilla(capacidad);
        for (int i = 0; i < 4; i++) {
            list.add(new SillaPreferencial(CordenadaX,CordenadaY));
            posicion();
        }
        for (int i = 0; i < 18; i++) {
            list.add(new SillaNormal(CordenadaX,CordenadaY));
            posicion();
        }
        for (int i = 0; i < 6; i++) {
            list.add(new SillaCama(CordenadaX,CordenadaY));
            posicion();
        }
        list.reset();
        ImageIcon icon = new ImageIcon("SiluetaVehiculo-02.png");

        this.setIcon(icon);
    }
}

class BusDoble extends Buses {
    public BusDoble(Tiempo t) {
        super(t);
        this.setText("Bus Doble");
        capacidad = 64;
        list = new ListaSilla(capacidad);
        for (int i = 0; i < 14; i++) {
            list.add(new SillaPreferencial(CordenadaX,CordenadaY));
            posicion();
        }
        for (int i = 0; i < 30; i++) {
            list.add(new SillaNormal(CordenadaX,CordenadaY));
            posicion();
        }
        for (int i = 0; i < 20; i++) {
            list.add(new SillaCama(CordenadaX,CordenadaY));
            posicion();
        }
        list.reset();
        ImageIcon icon = new ImageIcon("SiluetaVehiculo-03.png");
        this.setIcon(icon);
    }
}

