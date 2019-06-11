package Libreria;
import java.util.*;

import Proyecto.Leer;
public class Biblio {
	int cl=1000;
	Hashtable<Integer,Libro>ht=new Hashtable <Integer,Libro>();
	public static  void main (String []args)
	{
		Biblio obj= new Biblio();
		int op=0;
		 do
		 {
			 op=obj.menu();
				switch(op)
				{
				case 1:
					obj.leer();
					break;
				case 2:
					 obj.buscar();
					 break;
				case 3:
					 obj.imprime();
					break;
				}

		 } while (op!=4);
	}
	public  int menu()
    {
		 int opcion=0;
    	 System.out.println("\nQue desea hacer?: ");
		 System.out.println("1°- Agregar libro");
		 System.out.println("2°- Buscar libros");
		 System.out.println("3°- Imprimir libro");
		 System.out.println("4°- Salir");
		 do
		 {
			 System.out.println("\nSeleccione su opcion: ");
			 opcion=Leer.datoInt();
		 }
		 while(opcion<1 || opcion>4);
		 return opcion;
    }
	public  void leer()
	{
		String desc,aut,edi,lib;
	    int cant;
		
	
		    System.out.println("Clave "+cl);
		    System.out.println("Introduzca el nombre del Libro");		
		    lib=Leer.dato();
			System.out.println("Introduzca la descripcion del Libro");
			desc=Leer.dato();
			System.out.println("Introduzca el nombre del autor");
			aut=Leer.dato();
			System.out.println("Introduzca editorial del Libro");
			edi=Leer.dato();
			System.out.println("Existencia de Libros");
			cant=Leer.datoInt();
		    Libro libro=new Libro(cant,lib.toUpperCase(),desc.toUpperCase(),aut.toUpperCase(),edi.toUpperCase());
		    alta(libro);
		    cl++;
		
	}
	public  void buscar()
	{
		System.out.println("Que elemento desea buscar? ");
		int cmn=Leer.datoInt();
	   if (ht.containsKey(cmn))
		{
		   System.out.println("El elemento se encuentra en la lista ");
			System.out.println("Clave: "+cmn+" Elemento: "+ht.get(cmn));
		}else 
		{
			System.out.println("El elemento no se encontro ");
		}

	}
	public  void alta(Libro libro)
	{ 
     
		if (ht.containsKey(cl))
			
		{
			System.out.println("La clave del elemento ya se encuentra en la lista");
		}
		else 
		{
			ht.put(cl,libro);	
		}	
	}
	public  void imprime()
	{
		
			Enumeration<Integer>rht=ht.keys();
			while (rht.hasMoreElements()){
				Integer llave=(Integer)rht.nextElement();
				System.out.println("Clave: "+llave+" Elemento: "+ht.get(llave));

		}

	}
	
}
