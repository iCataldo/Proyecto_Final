abstract class Silla {
    protected int precio;
    public Silla(){
    }
    public Silla getSerie(){
        return this;
    }
    public int getPrecio() {
        return precio;
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