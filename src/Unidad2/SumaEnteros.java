package Unidad2;

public class SumaEnteros {
	static long time_start = System.currentTimeMillis();
	static long time_end;
	static int suma(int n){
		time_end=System.currentTimeMillis();
		if (n==1)
		{
			return 1;
		}
		else {
			return n+suma(n-1);
		}

	}
	public static void main(String []args)
	{
		
	    
		System.out.println("Suma de los primeros 5 numeros enteros "+sumaN(100000));
	}
	static int sumaN(int n)
	{
		
		int sum=0;
		for (int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		time_end=System.currentTimeMillis();
		System.out.println("Tiempo de ejecucion " +(time_end-time_start)+" Milisegundos");
		return sum;
	}
}
