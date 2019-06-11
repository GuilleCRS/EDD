package Trabajo1;
public class Trabajo1{
	
	
	 public static void main(String []Args)
	 {
		 int op;
		 T1Metodos Metod=new T1Metodos();
		 do
		 {
			 op=Metod.menu();
				switch(op)
				{
				case 1:
					Metod.agregar();
					break;
				case 2:
					Metod.buscar();
					break;
				case 3:
					Metod.imprimir();
					break;
				
				}
		    
			
		 } while (op!=4);
		
	 }
	    
}

	 
