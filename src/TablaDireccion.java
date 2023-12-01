import java.util.ArrayList;

public class TablaDireccion {
    private int[][] tabla=new int[5][5];
    public TablaDireccion(){
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                tabla[i][j]=(i+j)*20;
                if (i==j){
                    tabla[i][j]=0;
                }
            }
        }
    }
    public int getTabla(int x,int y) {
        if (x<0&&y<0){
            x=0;
            y=0;
        }
        return tabla[x][y];
    }
}
