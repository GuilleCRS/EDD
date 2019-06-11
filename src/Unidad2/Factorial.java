package Unidad2;

public class Factorial {
	public static double factorial(int n){
	    double fact=1;
	    int i;
	    if (n==0)
	    {
	        fact=1;
	    }
	    else
	    {
	        for(i=1;i<=n;i++)
	            fact=fact*i;
	    }
	 return fact;
	}
	public static void main(String []Args)
	{
		System.out.println(factorialR(10));
	}
	public static double factorialR(int n){
	    if (n==0)
	        return 1;
	    else
	        return n*(factorialR(n-1));
	}


}
