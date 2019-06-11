package MetodosNumericos;


import java.util.Scanner;

public class Secante {

	double matriz[][];
    double Xo, X1;
    int iteraciones;
    double tolerancia,funcion, error;
    
    public Secante(){}
    public Secante(Scanner s) {
        leerTolerancia(s);
        leerIteraciones(s);
        leerXo(s);
        leerX1(s);
        double Yo = evaluarFuncion(Xo);
        this.matriz=new double[iteraciones][7];
      
        if(Yo==0) System.out.println("Xo "+Xo+" es una raiz");
        else {
            
            double Y1 = evaluarFuncion(X1);
            double denominador = Y1-Yo;
            error = tolerancia+1;
            int contador = 0; 
            while((contador<iteraciones)&&(error>tolerancia)&&(Y1!=0)&&(denominador!=0)){
            	 
            	matriz[contador][0]=contador+1;
                matriz[contador][1]=redondea(Xo);
                matriz[contador][2]=redondea(denominador);
                matriz[contador][3]=redondea(X1);
                matriz[contador][4]=redondea(Yo);
                matriz[contador][5]=redondea(error);
                matriz[contador][6]=redondea(Y1);
                double X2 = X1 - (Y1*(X1-Xo)/denominador);
                Xo = X1;
                Yo = Y1;
                X1 = X2;
                Y1 = evaluarFuncion(X2);
                denominador = Y1-Yo;
                error = Math.abs(X1-Xo);
                
                
                contador++;
            }
            if(denominador==0) System.out.println("Excepcion en el denominador, division por cero");
            else{
                if(Y1 == 0) System.out.println("X1 "+X1+" es una raiz");
                else if (error<=tolerancia) 
                {
                	System.out.println("X1 "+X1+" es una raiz "+"\nEncontrado en el calculo numero "+contador);
                	System.out.println("\n\n Matriz: \n");
                	for (int x=0; x < matriz.length; x++) {
                		  System.out.print("|");
                		  for (int y=0; y < matriz[x].length; y++) {
                		    System.out.print (matriz[x][y]);
                		    if (y!=matriz[x].length-1) System.out.print("\t\t");
                		  }
                		  System.out.println("|");
                		}	
                	
                }
                else System.out.println("Fallo la ejecucion del metodo");
            }
        }
    }
    
    public double evaluarFuncion(double x){
        funcion =x-5*Math.cos(2*x)+5;
        return funcion;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Secante MS = new Secante(s);
    }
    
    public void leerTolerancia(Scanner s){
        System.out.println("Inserte Valor tolerancia:");
        try {
            tolerancia = Float.parseFloat(s.next());
        } catch (NumberFormatException e) {
            System.out.println("Por favor inserte un numero");
            leerTolerancia(s);
        }
    }
    
    public void leerIteraciones(Scanner s){
        System.out.println("Inserte numero de iteraciones:");
        try {
            iteraciones = Integer.parseInt(s.next());
        } catch (NumberFormatException e) {
            System.out.println("Por favor inserte un numero");
            leerIteraciones(s);
        }
    }
    
    public void leerXo(Scanner s){
        System.out.println("Inserte Valor Xo:");
        try {
            Xo = Float.parseFloat(s.next());
        } catch (NumberFormatException e) {
            System.out.println("Por favor inserte un numero");
            leerXo(s);
        }
    }
    private double redondea(double n){
    	return Math.rint(n*1000000)/1000000;
    }
    
    public void leerX1(Scanner s){
        System.out.println("Inserte Valor X1:");
        try {
            X1 = Float.parseFloat(s.next());
        } catch (NumberFormatException e) {
            System.out.println("Por favor inserte un numero");
            leerX1(s);
        }
    }
    public double[][] getMatriz() {return matriz;}
}