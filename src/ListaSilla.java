import javax.swing.*;
import java.util.ArrayList;

public class ListaSilla extends ArrayList<Silla>{
    private Silla[][] tabla;
    private int capacidad;
    //CordenadaX y CordenadaY de la tabla
    private int CordenadaX = 0;
    private int CordenadaY = 0;
    public ListaSilla(int n){
        capacidad=n;
    }
    /* este metodo agrega una silla en un matris que reprenta la divicion de asientos
    de un bus
     */
    public void addSilla(Silla silla) {
        this.add(silla);
        silla.setXY(CordenadaX, CordenadaY);
        CordenadaX++;
        if (CordenadaX == 4) {
            CordenadaX = 0;
            CordenadaY++;
        }
    }
    //este metodo entrega la silla en en la posicion i
    public Silla getSilla(int n){
            Silla s=this.get(n);
            return s;
    }
    //este metodo entrega este meto entrega la capacidad
    //la capacidad ese el numero de sillas almacenadas
    public int getCapacidad(){
        return capacidad;
    }
    //restablese los valores de cordenas
    public void reset(){
        int CordenadaX=0;
        int CordenadaY=0;
    }
}
