package MetodosNumericos;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by guillecrs on 15/05/17.
 */
public class Trapecios {
    static DecimalFormat df = new DecimalFormat("#.000000");
    public static void main(String []Args) {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("                    INSTITUTO TECNOLOGICO DE CULIACAN");
        System.out.println();
        System.out.println("                  INGENIERIA EN SISTEMAS COMPUTACIONALES");
        System.out.println();
        System.out.println("Alumno: Cruz Salazar Guillermo Armando");
        System.out.println("Materia: Metodos Numericos");
        System.out.println("Tema: Integracion numerica: Metodo de Trapecios");
        System.out.println("Horario: 9:00 a 10:00 horas");
        System.out.println("---------------------------------------------------------------------------------");
        Scanner leer = new Scanner(System.in);
        int nc=0;
        double areat=0;
        System.out.println("Se utilizara la siguiente funcion");
        System.out.println("∫(3+(x^3/x)");
        System.out.println("Introduzca los limites");
        System.out.println("Limite a: ");
        double a=leer.nextDouble();
        System.out.println("Limite b: ");
        double b=leer.nextDouble();
        System.out.println("Introduzca el numero de trapecios");
        double n=leer.nextDouble();
        System.out.println("Datos del proceso");
        System.out.println("Valor real");
        double vr=leer.nextDouble();
        System.out.println(" Error");
        double error=leer.nextDouble();
        System.out.println("Total de calculos");
        int tc=leer.nextInt();
        double ah;
        double fa;
        double fah;
        double errorc=0;

       while(nc<tc) {

                       System.out.println("---------------------------------------------------------------------------------");
                       System.out.println("                    INSTITUTO TECNOLOGICO DE CULIACAN");
                       System.out.println();
                       System.out.println("                  INGENIERIA EN SISTEMAS COMPUTACIONALES");
                       System.out.println();
                       System.out.println("Alumno: Cruz Salazar Guillermo Armando");
                       System.out.println("Materia: Metodos Numericos");
                       System.out.println("Tema: Integracion numerica: Metodo de Trapecios");
                       System.out.println("Horario: 9:00 a 10:00 horas");
                       System.out.println("---------------------------------------------------------------------------------");
                       nc++;
                       areat = 0;
                       double Area=0;
                       double h = (b - a) / n;
                       System.out.println("---------------------------------------------------------------------------------");
                       System.out.print("No.        ");
                       System.out.print("a          ");
                       System.out.print("ah        ");
                       System.out.print("F(a)        ");
                       System.out.print("F(ah)        ");
                       System.out.print("Area        ");
                       System.out.println("Area Total        ");
                       for (int t = 0; t < tc; t++) {
                           ah = a + h;
                           fa = ((2*a) + Math.pow(a, 2) +1);
                           fah = ((2*ah) + Math.pow(ah, 2 )+1);
                           Area = (h / 2) * (fa + fah);
                           areat = areat + Area;
                           System.out.print((t + 1) + "      ");
                           System.out.print(df.format(a) + "  ");
                           System.out.print(df.format(ah) + "    ");
                           System.out.print(df.format(fa) + "    ");
                           System.out.print(df.format(fah) + "    ");
                           System.out.print(df.format(Area) + "    ");
                           System.out.println(df.format(areat) + "  ");
                           a = ah;


                       }
           System.out.println("---------------------------------------------------------------------------------");
                       errorc=Math.abs(vr-areat);
                       if(errorc<=error){
                           System.out.println("Resultados");
                           System.out.println("Area: "+Area);
                           System.out.println("Area Total: "+areat);
                           break;
                       }else{
                           n=n*2;}
       }


    }
}


