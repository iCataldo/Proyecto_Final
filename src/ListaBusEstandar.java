import java.util.ArrayList;

class ListaBusEstandar extends ListaBus {
    public ListaBusEstandar(Tiempo tiempo){
        this.addBus(new BusChico(tiempo));
        this.addBus(new BusGrande(tiempo));
        this.addBus(new BusDoble(tiempo));
    }

    //este metodo entrega el PanelBus en de una posicion i de lo lista
    @Override
    public PanelBus get(int index) {
        return super.get(index);
    }
}
