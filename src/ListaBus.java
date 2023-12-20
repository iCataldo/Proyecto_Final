import javax.swing.*;
import java.util.ArrayList;

public class ListaBus extends ArrayList<PanelBus> {
    //este metodo crea PanelBus con una clase bus y lo agrega a la lista
    public void addBus(Buses bus){
        this.add(new PanelBus(bus));
    }

    //este metodo entrega el PanelBus en de una posicion i de lo lista
    @Override
    public PanelBus get(int index) {
        return super.get(index);
    }

}
