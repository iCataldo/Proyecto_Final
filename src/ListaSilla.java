import javax.swing.*;
import java.util.ArrayList;

public class ListaSilla extends ArrayList<Silla>{
    private Silla[][] tabla;
    private int capacidad;
    private int CordenadaX = 0;
    private int CordenadaY = 0;
    public ListaSilla(int n){
        capacidad=n;
    }

    public void addSilla(Silla silla){
        this.add(silla);
        silla.setXY(CordenadaX,CordenadaY);
        ordenar();
    }
    public void ordenar(){
        CordenadaX++;
        if (CordenadaX==4){
            CordenadaX=0;
            CordenadaY++;
        }
    }
    public Silla getSilla(int n){
        if (n<capacidad){
            Silla s=this.get(n);
            return s;
        }
        return null;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public void reset(){
        int CordenadaX=0;
        int CordenadaY=0;
    }
    public void printf(){
        for (int i=0;i<=CordenadaY;i++){
            for (int j=0;j<4;j++){
                if (tabla[i]!=null) {
                    System.out.println((i+1)+ "," + (j+1)+ ": " + tabla[i]);
                }
            }

        }
    }
}
