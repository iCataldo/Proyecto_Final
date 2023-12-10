public class FabricaBus {
    private Direccion direccion;
    public FabricaBus(Direccion dir){
        direccion=dir;
    }
    public Buses getbus(String s){
        if (s=="chico"){
            Buses bus = new Buses(direccion,4,18,6);
            bus.settext("Bus "+s);
            return bus;
        }
        if (s=="grande"){
            Buses bus = new Buses(direccion,8,20,8);
            bus.settext("Bus "+s);
            return bus;
        }
        if (s=="doble"){
            Buses bus = new Buses(direccion,14,30,20);
            bus.settext("Bus "+s);
            return bus;
        }
        return new Buses(direccion,0,0,0);
    }
}
