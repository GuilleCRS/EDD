package Matriz;

public class MatrizMetodo {

    private int[][] mat;
    int mat2[][];
    public void leer() {
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=Leer.datoInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=Leer.datoInt();
        mat=new int[filas][columnas];
        mat2=new int[filas][columnas];
        for(int f=1;f<=filas;f++) {
            for(int c=1;c<=columnas;c++) {
            	int m=f*c;
                mat[f-1][c-1]=m;
                
            }
        }
    }
    /*public void multiplicar()
    {
    int m=0;
    	for (int c=0;c<mat.length;c++)
    		for (int f=0;f<mat.length;f++)
    		{
    			m=mat[f][c]*mat[c][f];
    			mat2[f][c]=m;
    		}
    }*/
    
    public void imprimir() {
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print(mat[f][c]+" ");
                  
            }
            System.out.println();
        }
    }
    
  
  
    
}   
