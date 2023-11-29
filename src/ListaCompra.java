
import java.util.ArrayList;
public class ListaCompra extends ArrayList<Silla>{
    ListaCompra lista;
    public ListaCompra(){
        ListaCompra lista = new ListaCompra();
    }
    public void addCompra(Silla silla){
        lista.add(silla);
    }
    public int getPrecioTotal(){
        int preciototal=0;
        int size = lista.size();
        if (lista.size()>0){
            int i=0;
            while (i<size){
                preciototal = preciototal + lista.get(i).getPrecio();
                i=i+1;
            }
        }
        return preciototal;
    }
}
