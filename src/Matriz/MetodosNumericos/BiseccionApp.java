package MetodosNumericos;

import java.util.Scanner;



public class BiseccionApp{
    
    public static void main(String[] args) {
    	Scanner nc=new Scanner(System.in);
    	System.out.println("Para la ecuacion ax-bcos(cx)+d"+"\nIntroduzca: ");
    	System.out.println("a=");
    	double a=nc.nextDouble();
    	System.out.println("b=");
    	double b=nc.nextDouble();
    	System.out.println("c=");
    	double c=nc.nextDouble();
    	System.out.println("d=");
    	double d=nc.nextDouble();
    	System.out.println("En el intervalo x1 a x2");
    	System.out.println("Intervalo x1");
    	double x1=nc.nextDouble();
    	System.out.println("Intervalo x2");
    	double x2=nc.nextDouble();
    	System.out.println("Con un error de ");
     	double err=nc.nextDouble();
     	System.out.println("Con un total de intentos de :");
     	int calc=nc.nextInt();
     	
    	System.out.println();
        Biseccion bi=new Biseccion(x1,x2,err,calc,a,b,c,d);
        double raiz=bi.calcularRaiz();
        System.out.println("La raíz es: "+raiz);
        System.out.println("\n\n Matriz: \n");
        for(double[] array : bi.getMatriz()){
            for(double numero:array)
                System.out.print(numero+"\t\t");
            System.out.println();
        } 

    }

}