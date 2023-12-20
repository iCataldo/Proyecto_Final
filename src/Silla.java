import javax.swing.*;

abstract class Silla  {
    protected String imagen;
    protected String infoSilla;
    protected int precio;
    protected int x;
    protected int y;
    public Silla(int x,int y){
        this.x=x; this.y=y;
    }
    //guarda las posicion de la silla

    //este metodo entrega la inicial del tipo de silla
    public String getImagen() {
        return imagen;
    }
    //este metodo entrega el precio del tipo de silla
    public int getPrecio() {
        return precio;
    }

    public String getInfoSilla() {
        return infoSilla;
    }
}
class SillaNormal extends Silla{
    // se registra el precio y la inicial
    public SillaNormal(int x,int y) {
        super(x, y);
        precio=100;
        imagen="<html>N "+x+"-"+y+"<html>";
        infoSilla="<html>El Asiento "+x+"-"+y+" es la tipica silla alcochada de bus no cuena con audifo ni ninguna " +
                "peculiaridad<html>";
    }
}
class SillaCama extends Silla{
    // se registra el precio y la inicial
    public SillaCama(int x,int y) {
        super(x, y);
        precio=200;
        imagen="<html>C "+x+"-"+y+"<html>";
        infoSilla="<html>El Asiento "+x+"-"+y+" es una Silla Cama donde el asiene se puede inclinar 160 grado" +
                " ademas de tener panalla y audifonas para escuhar musica o ver peliculas piraas<html>";
    }
}
class SillaPreferencial extends Silla{
    // se registra el precio y la inicial
    public SillaPreferencial(int x,int y) {
        super(x, y);
        precio=140;
        imagen="<html>P "+x+"-"+y+"<html>";
        infoSilla="<html>El Asiento "+x+"-"+y+" es una Silla Preferencial con la caracteristica de ser el mas" +
                " ancha cerca de la entrada tracera con una rampa para subir sillas de rueda<html>";
    }
}