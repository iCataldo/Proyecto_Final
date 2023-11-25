import java.util.ArrayList;

public class ListaSilla {
    private ArrayList<Silla> ver;
    private Silla[][] tabla;
    private int CordenadaX=0;
    private int CordenadaY=0;
    public ListaSilla(int n){
        tabla= new Silla[4][n/4+1];
    }
    public void addSilla(Silla silla){

        tabla[CordenadaX][CordenadaY]=silla;
        CordenadaX++;
        if (CordenadaX==4){
            CordenadaX=0;
            CordenadaY++;
        }
    }
    public void printf(){
        for (int i=0;i<=CordenadaY;i++){
            for (int j=0;j<4;j++){
                if (tabla[j][i]!=null) {
                    System.out.println(i + "," + j + ": " + tabla[j][i].precio);
                }
            }

        }
    }
}
