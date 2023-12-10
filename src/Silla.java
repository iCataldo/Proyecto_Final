import javax.swing.*;

abstract class Silla  {
    protected String imagen;
    protected int precio;
    private int x;
    private int y;
    public Silla(){
    }

    public void setXY(int x,int y) {
        this.x=x; this.y=y;

    }
    public Silla getSerie(){
        return this;
    }

    public String getImagen() {
        return imagen;
    }

    public int getPrecio() {
        return precio;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
class SillaNormal extends Silla{
    public SillaNormal() {
        super();
        precio=100;
        imagen="N";
    }
}
class SillaCama extends Silla{
    public SillaCama() {
        super();
        precio=200;
        imagen="S";
    }
}
class SillaPreferencial extends Silla{
    public SillaPreferencial() {
        super();
        precio=140;
        imagen="P";
    }
}