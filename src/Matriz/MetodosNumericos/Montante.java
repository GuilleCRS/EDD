package MetodosNumericos;
import java.util.Scanner;

/**
 * Created by GuilleCRS on 26/03/2017.
 */
public class Montante {
    public static void main(String args[]) {
        Montante mont = new Montante();
        Scanner leer = new Scanner(System.in);
        int var = 0;
        float pivant = 1;
        float pivact;
        float matriz[][];//Se declara la matriz
        float matriz2[][];//Se declara la copia de la matriz
        float factor;
        System.out.println("\n¿Cuantas variables tiene tu sistema?");//Se pide la cantidad de variables
        var = leer.nextInt();
        int var2 = var + 1;
        matriz = new float[var][var2];
        matriz2 = new float[var][var2];
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {
                //Se ingresan las constantes de cada variable
                System.out.println("Ingresa la constante de la posicion: A[" + (x + 1) + "][" + (y + 1) + "]");
                matriz[x][y] = leer.nextFloat();
            }

        }
        matriz2 = matriz;//La matriz Original se le asigna a la copia
        System.out.println("Matriz ingresada");//Se imprime la matriz Ingresada
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < (var + 1); y++) {

                System.out.print(matriz[x][y] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriz Montante");//Inicia el proceso de montante
        for (int k=0;k<matriz2.length;k++){
            pivact=matriz2[k][k];
            for(int f=0;f<matriz2.length;f++){
                for(int c=0;c<matriz2.length+1;c++){
                    if(c!=k && f!=k){
                        //Se le asigna el resultado de la operacion a la posicion correspondiente de la matriz

                        matriz2[f][c]=(((pivact*matriz2[f][c])-(matriz2[f][k]*matriz2[k][c]))/pivant);
                    }
                }
            }
            for(int f=0;f<matriz2.length;f++){
                if(f!=k){
                    //Se le asigna 0 a los valores transformados
                    matriz2[f][k]=0;
                }
            }
            pivant=pivact;//El pivote actual se convierte en el anterior
        }
        for (int x = 0; x < var; x++) {//Se imprime la matriz despues del proceso de Montante
            for (int y = 0; y < (var + 1); y++) {

                System.out.print(matriz[x][y] + "  ");
            }
            System.out.println();
        }
        mont.MatrizU(matriz2);//Se manda la matriz a un metodo para transformarla en unitaria


    }
    public void MatrizU(float matriz2[][]){//Metodo de la matriz Unitaria
        for (int c = 0; c < matriz2.length; c++) {//Proceso de convertir a Matriz Unitaria
            matriz2[c][matriz2.length] = matriz2[c][matriz2.length] / matriz2[c][c];
            matriz2[c][c] = 1;
        }
        System.out.println();
        System.out.println("Matriz Unitaria");//Se imprime la matriz Unitaria
        for (int x = 0; x < matriz2.length; x++) {
            for (int y = 0; y < (matriz2.length + 1); y++) {

                System.out.print(matriz2[x][y] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("RESULTADOS");//Se dan los resultados de cada variable

        for (int i=0;i<matriz2.length;i++){
            System.out.println("x1: "+matriz2[i][matriz2.length]);
        }




    }

}

