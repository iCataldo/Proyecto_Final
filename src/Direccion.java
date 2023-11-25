public class Direccion {
    private int direcion;
    private int tiempo;
    public Direccion(int x,int y){
        TablaDirecion tabla =new TablaDirecion();
        direcion=tabla.getTabla(x, y);
        tiempo=tabla.getTabla(x, y)/2;
    }
    public int getDirecion() {
        return direcion;
    }

    public int getTiempo() {
        return tiempo;
    }
}
