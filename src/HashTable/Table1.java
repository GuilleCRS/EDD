package HashTable;

import java.util.*;

public class Table1 
{
	public static void main(String[] args)
	{
		Hashtable<String,Integer>ht=new Hashtable <String,Integer>();
		ht.put("Paco",4);
		ht.put("Hugo",3);
		ht.put("Luis",1);
		ht.put("Mario",3);
	
	
		
		//No generica
		Enumeration rht1=ht.keys();
		while (rht1.hasMoreElements()){
			String llave=(String)rht1.nextElement();
			System.out.println("Llave "+llave+"Elemento "+ht.get(llave));
		

	}
		System.out.println();
		//Enumeracion generica
		System.out.println("Metodo Imprime 2");
		Enumeration<String>rht2=ht.keys();
		while (rht2.hasMoreElements()){
			String llave=(String)rht2.nextElement();
			System.out.println("Llave "+llave+" Elemento "+ht.get(llave));
		}
		System.out.println();
		if(ht.containsKey("Paco"))
		{
			System.out.println("Si se encontro");
		}
		else
		{
		  System.out.println("No se encontro");
		}
		System.out.println();
		//Enumeracion generica
		System.out.println("Metodo Imprime 3");
		Enumeration<Integer>rht3=ht.elements();
		while (rht3.hasMoreElements()){
			Integer llave=(Integer)rht3.nextElement();
			System.out.println("Llave "+llave/*+" Elemento "+ht.get(llave)*/);
		}
	
  }

}
