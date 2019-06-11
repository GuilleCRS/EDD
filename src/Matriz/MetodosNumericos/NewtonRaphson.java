package MetodosNumericos;

public class NewtonRaphson {

	
		   int i=0;
		    double x[]=new double[50];
		   double e=10;
		  
		   NewtonRaphson(double aprox_i){
		   
		       x[0]=aprox_i;
		   
		   }
		   
		   double f(double x)
		   {
		       double fx;
		       fx=x-5*Math.cos(2*x)+5;
		       //fx=Math.pow(x,3)-5;
		       return fx;
		   
		   
		   }
		   
		   double fp(double x)
		   {
		   
		       double fpx;
		       fpx=10*Math.sin(2*x)+1;
		       return fpx;
		   }
		   
		   
		    double calcRaiz()
		    {
		    i=0;
		        while(e>0.0001)
		        {
		            x[i+1]=x[i]-(f(x[i])/fp(x[i]));
		            e=Math.abs((x[i+1]-x[i])/x[i+1]);
		            e=e*100;
		            System.out.println((i+1)+"\t\t"+redondea(x[i])+"\t\t"+redondea(e)+"\t"+redondea(x[i+1]));
		            i++;
		        }
		    
		        return(x[i]);
		    }
		    private double redondea(double n){
		    	return Math.rint(n*1000000)/1000000;
		    }
		    
		    
}
