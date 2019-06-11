package Proyecto;

import java.util.Enumeration;
import java.util.Hashtable;


public class Principal {
	
		int op;
		int depaid;
		Departamento depo[]=new Departamento[5];
		Vendedor vn=new Vendedor();
		Hashtable<Integer,Vendedor> ht=new Hashtable<Integer,Vendedor>();
		public static void main (String []Args)
		{ 
			Principal m=new Principal();
			m.menu();
	
		}
		public void menu()
		{
			
			int op;
			
			
			do
			{
				System.out.println("Que desea hacer? ");
				System.out.println("1-° Dar de alta un departamento.");
				System.out.println("2-° Dar de alta un vendedor. ");
				System.out.println("3-° Asignar el valor de ventas.");
				System.out.println("4-° Calcular comsion.");
				System.out.println("5-° Consultar a un empleado.");
				System.out.println("6-° Consultar a todos los vendedores.");
				System.out.println("7-° Salir.");
				op=Leer.datoInt();
				
				switch (op){
				   case 1:
				      altad();
				      break;
				   case 2:
					   altae();
				      break;
				   case 3:
					   asignar();
					   break;
				   case 4:
					   calculac();   
					   break;
				   case 5:
					   buscar();
					   break;
				   case 6:
					   imprime();

				    }
			}while(op!=7);
			
		}
		public void calculac() { 
			String nom2;
			System.out.println("Introduzca el nombre del empleado");
			String nom=Leer.dato();
			nom=nom.toUpperCase();
			Enumeration<Vendedor> eht=ht.elements();
			while (eht.hasMoreElements()){
				Vendedor ven=eht.nextElement();
				nom2=ven.getNombre();
			     if (nom.compareTo(ven.getNombre())==0)
			     {
			    	 String dep=ven.getDepartamento();
			    	 System.out.println(dep);
			    	 if (BuscaDep(dep.toUpperCase())==true)
			    	 {
			    		 for (int n=0;n<depo.length;n++)
					     { 
			    			 if(depo[n].getNom().equals(dep))
			    			 {
			    				 double comision=depo[n].getComision();
			    				 double idv=comision*ven.getIdv();
			    					 ven.setComision(idv);
			    				 break;
			    			 }
					     
					     }
			    		 
			    	 }
			    	
			     }
				
			}
		}
		public void altae(){
			String dep1;
			dep1= depo[0].getNom();
			System.out.println("Introduzca la clave del empleado");
			int cl=Leer.datoInt();
			if (ht.containsKey(cl))
			{
				System.out.println("La clave ya existe");
			}
			else {
				
				System.out.println("Introduzca el nombre del empleado");
				String nom=Leer.dato();
				if (nom!=null)
				{
				   System.out.println("Introduzca el departamento del empleado ");
				   String dep=Leer.dato();
				   if (dep!=null)
				   {
					   if (BuscaDep(dep.toUpperCase())==true)
					   {
						   vn=new Vendedor(cl,nom.toUpperCase(),dep.toUpperCase(),0);
						   System.out.println("Dado de alta exitosamente");
						   ht.put(cl,vn);
					   } 
					   else 
						   System.out.println("Ese departamento no existe");
				}
				   else System.out.println("El departamento no puede ser nulo");
				}else System.out.println("El nombre no puede ser nulo");

			}
			
		}
		public boolean BuscaDep(String nomD)
		{
			boolean bandera=false;
			
			 for (int n=0;n<depo.length;n++)
		     { 
				
		    	if (depo[n]!=null)
		    	{
		    		
		    		String nom=depo[n].getNom();
		    		
				    if(nomD.equals(nom))
				    {
					    bandera=true;
					    
					    return bandera;
					    
				    }
		    	}
		   }
			 return bandera;
			 
		}
		public void altad()
		{   String dep;int cld;double com;
		if (depaid<depo.length)
		{
			 System.out.println("Introduzca la clave del departamento");
			    cld=Leer.datoInt();
				System.out.println("Introduzca el nombre del nuevo departamento");
				dep=Leer.dato();
				if (dep!=null)
				{
					if(BuscaDep(dep.toUpperCase())==true)
					{
						System.out.println("El departamento ya existe");
					}
					else 
					{
						System.out.println("Introduzca el porcentaje de comision hasta el 100%");
						com=Leer.datoDouble();
						if (com>0)
						{
							
							depo[depaid]=new Departamento(cld,dep.toUpperCase(),(com/100));
							depaid++;
							System.out.println("Departamento creado exitosamente");
						
						}
					}
					
				}
		}else
			System.out.println("Limite maximo de departamentos");
		   
	
		}
		public void buscar(){
			String nom2;
			System.out.println("Introduzca el nombre del empleado");
			String nom=Leer.dato();
			nom=nom.toUpperCase();
			Enumeration<Vendedor> eht=ht.elements();
			while (eht.hasMoreElements()){
				Vendedor ven=eht.nextElement();
				nom2=ven.getNombre();
			     if (nom.compareTo(ven.getNombre())==0)
			     {
			    	 System.out.println("Se encontro: "+ven);
			    	
			     }
			}
		}
		public void imprime()
		{
			Enumeration<Integer>rht=ht.keys();
			while (rht.hasMoreElements()){
				Integer clave=(Integer)rht.nextElement();
				System.out.println(ht.get(clave));
			}
			
		}
		public void asignar()
		{
			System.out.println("Introduzca la clave del empleado");
			int cl=Leer.datoInt();
			if(ht.containsKey(cl))
			{
				Vendedor ven=ht.get(cl);
				System.out.println("Cuanto desea agregar al importe de venta");
				double idv=Leer.datoDouble();
				if (idv>0)
				 ven.setIdv(idv);
				else
					System.out.println("El valor debe ser mayor a cero");
			}
			else
			{
			  System.out.println("No se encontró");
			  System.out.println();
			}
 
	     }
		

}
