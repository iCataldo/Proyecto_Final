public class Direccion {
    private int distancia;
    private int tiempo;
    public static final int Chile = 0;
    public static final int Argentina = 1;
    public static final int Peru = 2;
    public static final int Mordor = 3;

    //el contructor almacena los valares de la tabla sin guardar la tabla
    /*queria usar el patron singleton pero no tuve el tiempo de aprovechar
    esta clase queria calcular precio en base del tiempo y te salga la distancia
    en pantalla
     */
    public Direccion(int x,int y){
        distancia=new TablaDirecion().getTabla(x, y);
        tiempo=distancia/2;
    }
    //este metodo entrega la distancia de la direcion
    public int getDirecion() {
        return distancia;
    }
    //este metodo entrega la distancia de la Tiempo
    public int getTiempo() {
        return tiempo;
    }
}
