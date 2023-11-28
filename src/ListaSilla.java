import java.util.ArrayList;

public class ListaSilla {
    private Silla[][] tabla;
    private int CordenadaX=0;
    private int CordenadaY=0;
    public ListaSilla(int n){
        tabla= new Silla[n/4+1][4];
    }
    public void addSilla(Silla silla){

        tabla[CordenadaY][CordenadaX]=silla;
        silla.setXY(CordenadaX,CordenadaY);
        CordenadaX++;
        if (CordenadaX==4){
            CordenadaX=0;
            CordenadaY++;
        }
    }
    public void printf(){
        for (int i=0;i<=CordenadaY;i++){
            for (int j=0;j<4;j++){
                if (tabla[i][j]!=null) {
                    System.out.println((i+1)+ "," + (j+1)+ ": " + tabla[i][j]);
                }
            }

        }
    }
}
