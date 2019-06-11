package MetodosNumericos;
import java.util.Scanner;
/**
 * Created by GuilleCRS on 20/03/2017.
 */
public class GaussJordan2 {
    public static void main(String args[]) {
        GaussJordan2 gj=new GaussJordan2();
        Scanner leer = new Scanner(System.in);
        int var = 0;
        float piv = 0;
        float matriz[][];
        float matriz2[][];
        float factor;
        System.out.println("\n¿Cuantas variables tiene tu sistema?");
        var = leer.nextInt();
        int var2=var+1;
        matriz = new float[var][var2];
        matriz2 = new float[var][var2];
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {
                System.out.println("Ingresa la constante de la posicion: A[" + (x + 1) + "][" + (y + 1) + "]");
                matriz[x][y] = leer.nextFloat();
            }

        }
        matriz2=matriz;
        System.out.println("Matriz ingresada");
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {

                System.out.print(matriz[x][y]+"  ");
            }
            System.out.println();
        }
        System.out.println();

        for(int k=0;k<matriz.length-1;k++)
        {
            piv=matriz[k][k];
            for(int f=k+1;f<var;f++){
                float mult=matriz[f][k];
                if (mult != 0) {
                    if(mult!=piv){
                        for(int c=k;c<matriz.length+1;c++){
                            matriz2[f][c]=((piv*matriz2[f][c])-(mult*matriz2[k][c]));
                        }}
                }

            }
        }
        System.out.println("Matriz Gauss");
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {

                System.out.print(matriz2[x][y]+"     ");
            }
            System.out.println();

        }
        gj.GaussJ(matriz2,var);

    }
    public void GaussJ(float matriz2[][], int var){
        GaussJordan2 gj=new GaussJordan2();
        float piv;
        float factor;
        for (int k=var-1;k>0;k--)
        {
            piv=matriz2[k][k];
            for(int f=0;f<k;f++){
                factor=matriz2[f][k]/piv;
                for (int c=k;c<var+1;c++){
                    matriz2[f][c]=matriz2[f][c]-(factor*matriz2[k][c]);
                }
            }
        }
        System.out.println("");
        System.out.println("Matriz Gauss Jordan");
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {

                System.out.print(matriz2[x][y]+"     ");
            }
            System.out.println();

        }
        for (int c = 0; c < var; c++) {
            matriz2[c][var] = matriz2[c][var] / matriz2[c][c];
            matriz2[c][c] = 1;
        }
        System.out.println("");
        System.out.println("Matriz unitaria");
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {

                System.out.print(matriz2[x][y] + "     ");
            }
            System.out.println();
        }
        System.out.println(" RESULTADOS ");
        for(int i=0;i<var;i++){
            System.out.println("x"+(i+1)+":"+matriz2[i][var]);
        }

    }


}