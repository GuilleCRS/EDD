//Alumno: Cruz Salazar Guillermo Armando
//Metodo de Gauss-Seidel
//Programa ejecutado en la aplicacion Eclipse
package MetodosNumericos;
import java.text.DecimalFormat;
import java.util.Scanner;

public class GaussSeidel {
    static DecimalFormat df = new DecimalFormat("#.000000");
    public static void main(String []Args){
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                    INSTITUTO TECNOLOGICO DE CULIACAN");
        System.out.println();
        System.out.println("                  INGENIERIA EN SISTEMAS COMPUTACIONALES");
        System.out.println();
        System.out.println("Alumno: Cruz Salazar Guillermo Armando");
        System.out.println("Materia: Metodos Numericos");
        System.out.println("Tema: Sistemas de ecuaciones por el metodo de Gauss-Seidel");
        System.out.println("Horario: 9:00 a 10:00 horas");
        System.out.println("---------------------------------------------------------------------------------");
        Scanner leer = new Scanner(System.in);
        int var = 0;
        float suma;
        String Conceptos[];
        float vact[];
        float vant[];
        float matriz[][];
        float matriz2[][];
        float error;
        int tc;
        int calculo;
        float errortotal;
        float coef;
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
        vant=new float[var];
        vact=new float[var];
        Conceptos=new String[var];
        for(int i=0;i<var;i++){
            System.out.println("Concepto de la incognita: x"+(i+1));
            leer.nextLine();
            Conceptos[i]=leer.nextLine();
            System.out.println("Valor inicial para: x"+(i+1));
            vant[i]=leer.nextFloat();
            vact[i]=0;
        }
        System.out.println();
        System.out.println("Datos para el proceso de aproximacion");
        System.out.println("Error de tolerancia");
        error=leer.nextFloat();
        System.out.println("Total de calculos a relizar");
        tc=leer.nextInt();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                    INSTITUTO TECNOLOGICO DE CULIACAN");
        System.out.println();
        System.out.println("                  INGENIERIA EN SISTEMAS COMPUTACIONALES");
        System.out.println();
        System.out.println("Alumno: Cruz Salazar Guillermo Armando");
        System.out.println("Materia: Metodos Numericos");
        System.out.println("Tema: Sistemas de ecuaciones por el metodo de Gauss-Seidel");
        System.out.println("Horario: 9:00 a 10:00 horas");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("No.		");
        for(int k=0;k<var;k++){
            System.out.print("X"+(k+1)+"		");
        }
        System.out.println("Error total");
        System.out.println("---------------------------------------------------------------------------------");
        calculo=0; errortotal=0;
        System.out.print(calculo+"	  ");
        for(int k=0;k<var;k++){
            System.out.print(df.format(vant[k])+"	  ");
        }
        System.out.println(df.format(errortotal));
        do{
            for (int k=0;k<var;k++)
            {
                suma=0;
                coef=matriz2[k][k];
                suma=suma+matriz2[k][var];
                for(int i=0;i<var;i++){
                    if(k==i)
                    {
                        //no procede
                    }
                    else{
                        if(i<k){
                            suma=suma+((matriz2[k][i]*(-1))*vact[i]);
                        }else{
                            suma=suma+((matriz2[k][i]*(-1))*vant[i]);
                        }
                    }
                }
                suma=suma/coef;
                vact[k]=suma;

            }





            errortotal=0;
            for(int j=0;j<var;j++){
                errortotal=errortotal+(Math.abs(Math.abs(vact[j]-Math.abs(vant[j]))));
            }
            calculo=calculo+1;
            System.out.print(calculo+"	  ");
            for (int j=0;j<var;j++){
                System.out.print(df.format(vact[j])+"	  ");
                vant[j]=vact[j];
            }
            System.out.println(df.format(errortotal));
        }while((errortotal>error)&&(calculo<=tc));
        System.out.println("Resultado de las operaciones: " );
        if(errortotal<=error){
            System.out.println("Valor de las incognitas");
            for(int i=0;i<var;i++){
                System.out.println(Conceptos[i]+": "+df.format(vact[i]));
            }
        }
        if(calculo>tc){
            System.out.println("No se encontro un resultado en el numero de calculos");
        }
    }



}