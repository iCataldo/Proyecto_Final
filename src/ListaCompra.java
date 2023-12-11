
import java.awt.*;
import java.util.ArrayList;
public class ListaCompra extends ArrayList<ButtonSilla>{
    //este metodo agrega una calcula el precio de los coponentes de la lista
    public int getPrecioTotal(){
        int preciototal=0;
        int size = this.size();
        if (this.size()>0){
            int i=0;
            while (i<size){
                preciototal = preciototal + this.get(i).getPrecio();
                i=i+1;
            }
        }
        return preciototal;
    }
    //elimina todos los elementos de la lista
    public void borrar(){
        while (this.size()!=0){
            this.get(0).setBackground(Color.red);
            this.get(0).setEnabled(false);
            this.remove(0);
        }
    }

}