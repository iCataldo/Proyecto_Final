abstract class Silla {
    protected int precio;
    private int x;
    private int y;
    public Silla(int x, int y){
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
    public SillaNormal(int x, int y) {
        super(x,y);
        precio=100;
    }
}
class SillaCama extends Silla{
    public SillaCama(int x, int y) {
        super(x,y);
        precio=200;
    }
}
class SillaPreferencial extends Silla{
    public SillaPreferencial(int x, int y) {
        super(x,y);
        precio=140;
    }
}
