abstract class Silla {
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
    }
}
class SillaCama extends Silla{
    public SillaCama() {
        super();
        precio=200;
    }
}
class SillaPreferencial extends Silla{
    public SillaPreferencial() {
        super();
        precio=140;
    }
}
