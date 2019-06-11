package Unidad3.DatosPilas;

import Proyecto.Leer;
import Unidad3.Pila;

public class ProyPilas {
	Pila<Double> pila2=new Pila();
	public static void main(String []args)
	{
		ProyPilas pp=new ProyPilas();
		int op;
		do
		{
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("Que desea hacer? ");
			System.out.println("1-° Agregar  datos a la pila");
			System.out.println("2-° Retira el ultimo dato de la pila ");
			System.out.println("3-° Mostrar todos los datos");
			System.out.println("4-° Salir.");
			op=Leer.datoInt();
			
			switch (op){
			   case 1:
			      pp.AgregaPila();
			      break;
			   case 2:
				   pp.RetiraPila();
			      break;
				case 3:
					pp.MostrarE();

			    }
		}while(op!=4);
		//Pila<Integer> pila=new Pila();
		//pila.Inserta(11);
		//pila.Inserta(24);
		//pila.Inserta(90);
		//pila.Retira();
		//System.out.println(pila.Dr);
	}
	public void AgregaPila()
	{

			System.out.println("Inserta el dato: ");
			Double d=Leer.datoDouble();
			if (pila2.Inserta(d))
			{
				System.out.println("Dato insertado correctamente");
			}else
				System.out.println("No se pudo retirar");
			

	}
	public void RetiraPila()
	{
		if (pila2.Retira()==false)
		{
			System.out.println("La pila esta vacia");
		}else {

			System.out.println("Dato retirado= " + pila2.Dr);
			if (pila2.MostrarT() == null) {
				System.out.println("La pila se ha vaciado");
			} else {
				System.out.println("Nuevo tope de la clase " + pila2.MostrarT());
			}
		}
			
			
	}
	public void MostrarE()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(pila2.RecorrerE(i));

		}

	}

}
