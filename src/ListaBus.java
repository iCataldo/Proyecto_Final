import java.util.ArrayList;

public class ListaBus extends ArrayList<Buses> {
    public void addBus(Buses bus){

        this.add(bus);
    }

    @Override
    public Buses get(int index) {
        return super.get(index);
    }
}
