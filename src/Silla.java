import javax.swing.*;

abstract class Silla  {
    protected String imagen;
    protected int precio;
    private int x;
    private int y;
    public Silla(){
    }
    //guarda las posicion de la silla
    public void setXY(int x,int y) {
        this.x=x; this.y=y;

    }

    //este metodo entrega la inicial del tipo de silla
    public String getImagen() {
        return imagen;
    }
    //este metodo entrega el precio del tipo de silla
    public int getPrecio() {
        return precio;
    }
}
class SillaNormal extends Silla{
    // se registra el precio y la inicial
    public SillaNormal() {
        super();
        precio=100;
        imagen="N";
    }
}
class SillaCama extends Silla{
    // se registra el precio y la inicial
    public SillaCama() {
        super();
        precio=200;
        imagen="S";
    }
}
class SillaPreferencial extends Silla{
    // se registra el precio y la inicial
    public SillaPreferencial() {
        super();
        precio=140;
        imagen="P";
    }
}