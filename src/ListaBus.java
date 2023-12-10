import javax.swing.*;
import java.util.ArrayList;

public class ListaBus extends ArrayList<PanelBus> {
    public void addBus(Buses bus){
        this.add(new PanelBus(bus));
    }
    public Buses getBus(int i){
        return get(i).getBuses();
    }

    @Override
    public PanelBus get(int index) {
        return super.get(index);
    }
}
