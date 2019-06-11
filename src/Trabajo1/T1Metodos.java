package Trabajo1;



import java.util.Scanner;
public class T1Metodos 
{
    
        Scanner teclado=new Scanner(System.in);
        boolean e = false;
        
        int num[]=new int[10];
        int x,op;
        public int menu()
        {
        	 System.out.println("\nQue desea hacer?: ");
    		 System.out.println("1 Agregar valores");
    		 System.out.println("2 Buscar valores");
    		 System.out.println("3 Imprimir Arreglo");
    		 System.out.println("4 Salir");
    		 do
    		 {
    			 System.out.println("Seleccione su opcion: ");
    			 op=Leer.datoInt();
    		 }
    		 while(op<1 || op>4);
    		 return op;
        }
        public void agregar()
        {
        	 for(x=0;x<num.length;x++){
                 System.out.print("Ingrese un numero: ");
                 num[x]=teclado.nextInt();
             }
           
             }
       
        
        public void buscar()
        {
        	System.out.print("Buscar numero: ");
            int numero,cont=0;
            numero=teclado.nextInt();

            for(x=0;x<num.length;x++){
                if (numero == num[x])
                {
                	 e = true;
                	
                             System.out.println("El numero esta en la posicion "+(x));
                             cont++;
               }
               
            }
            System.out.println(" \nEl numero se repite "+cont+" Veces");

            if(e ==false) {
                System.out.println("\nEl numero no esta");
            }
            
        }

       public void imprimir()
       {
    	   for(x=0;x<num.length;x++){
               System.out.println(num[x]);
    	   
       }
    }
}
