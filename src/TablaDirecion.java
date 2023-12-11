import java.util.ArrayList;

public class TablaDirecion {

    private int[][] tabla=new int[5][5];
    /*aqui se marcarian las distancia por lo que es una matris simetrica de
    una posicion x a la posicion y es la misma distande  una posicion y a la posicion x
    pero no le definimos valores realista
     */
    public TablaDirecion(){
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                tabla[i][j]=(i+j)*20;
                //de una posicion x a la posicion x la distacia es 0
                if (i==j){
                    tabla[i][j]=0;
                }
            }
        }
    }
    //este metodo entrega la distawncia de la matris;
    //x marca la posicion de incio e y la de destino
    public int getTabla(int x,int y) {
        if (x<0&&y<0){
            x=0;
            y=0;
        }
        return tabla[x][y];
    }
}
