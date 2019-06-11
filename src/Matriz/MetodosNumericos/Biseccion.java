package MetodosNumericos;
import java.util.*;
public class Biseccion {
	double a,c,tol,p,x1,x2,x3,cons;
	double matriz[][];
    int k,j,ni;
    public Biseccion(double a1, double b1, double tol1,int ni1,double x11,double x22,double x33,double consta){
         a=a1;
         c=b1;
         tol=tol1;
         ni=ni1;
         x1=x11;
         x2=x22;
         x3=x33;
         cons=consta;
         this.matriz=new double[ni][7];
    }
    private double redondea(double n){
    	return Math.rint(n*1000000)/1000000;
    }
    private double f(double x){
    	double r;
    	
    		
    		r=x1*x-x2*Math.cos(x3*x)+cons;
    		return r;
  
    	
    	
    }
    public double calcularRaiz(){
    	int i=0;
    	double b,q,z;
        q=((c-a)/2);
        b=(a+q);
        while(i<ni){
            matriz[i][0]= i+1;
            matriz[i][1]=a;
            matriz[i][2]=b;
            matriz[i][3]=c;
            matriz[i][4]=redondea(f(a));
            matriz[i][5]=redondea(f(b));
            matriz[i][6]=redondea(f(c));
        	    if(Math.abs(f(b))<=tol){
        		System.out.println("El absoluto de [ "+f(b)+" ]es menor o igual al error");
        		break;
        	}	
        	else{
        		if(f(a)*f(b)>0)
        			a=b;
        		else
        			c=b;
        		q=redondea((c-a)/2);
        		b=redondea(a+q);
        	}
        	i++;
        }
        
        System.out.println("Encontrado en el calculo numero: "+(i+1));
        
 
       return b;
    }
    
    
    public double[][] getMatriz() {return matriz;}
}
