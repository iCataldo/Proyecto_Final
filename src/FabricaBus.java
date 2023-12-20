import java.util.ArrayList;

public class FabricaBus {

    private ArrayList<ListaBus> arrayLista = new ArrayList<>();

    public FabricaBus(){
        arrayLista.add(new ListaBusEstandar(new Tiempo(0,1)));
        arrayLista.add(new ListaBusEstandar(new Tiempo(0,2)));
        arrayLista.add(new ListaBusEstandar(new Tiempo(0,3)));
        arrayLista.add(new ListaBusEstandar(new Tiempo(1,2)));
        arrayLista.add(new ListaBusEstandar(new Tiempo(1,3)));
        arrayLista.add(new ListaBusEstandar(new Tiempo(2,3)));
    }
    //patron fabrica que construlle unos buses con una cantidad de silla estandar
    public ListaBus listaBuz(int x,int y){
        if ((x==1&&y==2)||(x==2&&y==1)){
            if (arrayLista.get(0)==null){
                arrayLista.add(new ListaBusEstandar(new Tiempo(x-1,y-1)));
            }
            return arrayLista.get(0);
        }
        if ((x==2&&y==3)||(x==3&&y==2)){
            return arrayLista.get(1);
        }
        if ((x==3&&y==1)||(x==1&&y==3)){
            return arrayLista.get(2);
        }
        if ((x==4&&y==1)||(x==1&&y==4)){
            return arrayLista.get(3);
        }
        if ((x==4&&y==2)||(x==2&&y==4)){
            return arrayLista.get(4);
        }
        if ((x==4&&y==3)||(x==3&&y==4)){
            return arrayLista.get(5);
        }
        return new ListaBus();
    }
}
