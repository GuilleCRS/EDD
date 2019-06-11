package Unidad4.ABB;

public class UsaArboles 
{
	ArbolBB<String> Arbol=new ArbolBB<String>();
	public static void main(String[] args) 
	{
		UsaArboles usa= new UsaArboles();
		usa.Menu();
	}
	public void Menu()
	{
		int op=0;
		do
		{
			System.out.println();
			System.out.println("-------------------------------------------------");
			System.out.println("              SELECCIONE UNA OPCION              ");
			System.out.println("1.- INSERTAR NODO");
			System.out.println("2.- BUSCAR NODO");
			System.out.println("3.- ALTURA ARBOL");
			System.out.println("4.- MOSTRAR PRE-ORDEN");
			System.out.println("5.- MOSTRAR POS-ORDEN");
			System.out.println("6.- MOSTRAR IN-ORDEN");
			System.out.println("7.- ELIMINAR UN NODO");
			System.out.println("8.- SALIR");
			op=Leer.datoInt();
			System.out.println("-------------------------------------------------");
			switch(op)
			{
			case 1:
				Inserta();
			break;
			case 2:
				Buscar();
				break;
			case 3:
				Altura();
				break;
			case 4:
				PreOrden();
				break;
			case 5:
				PosOrden();
				break;
			case 6:
				InOrden();
				break;
			case 7:
				Eliminar();
				break;
			}
		}while(op!=8);
	}
	public void Inserta()
	{
		System.out.println("DATO A AGREGAR: ");
		String dato= Leer.dato();
		if(!(Arbol.Inserta(dato)))
		{
			System.out.println("EL DATO NO SE AGREGO");
		}
		else
		{
			System.out.println("EL DATO "+dato+" SE AGREGO");
		}
	}
	public void Buscar()
	{
		System.out.println("QUE DATO DESEA BUSCAR?");
		String dato=Leer.dato();
		if(Arbol.Busca(Arbol.DameRaiz(), dato)==true)
			System.out.println("EL NODO CON EL DATO "+dato+" SE ENCONTRO");
		else
			System.out.println("EL NODO CON EL DATO "+dato+" NO SE ENCONTRO");
	}
	public void Altura()
	{
		System.out.println("LA ALTURA DEL ARBOL ES:");
		int altura= Arbol.Altura(Arbol.DameRaiz(),0)+1;
		System.out.println(altura);
	}
	public void PreOrden()
	{
		Arbol.inorder(Arbol.DameRaiz());
	}
	public void PosOrden()
	{
		Arbol.posorder(Arbol.DameRaiz());
	}
	public void InOrden()
	{
		Arbol.preorder(Arbol.DameRaiz());
	}
	public void Eliminar()
	{
		System.out.println("INSERTA EL DATO A ELIMINAR");
		String d=Leer.dato();
		if(Arbol.Busca(Arbol.DameRaiz(),d)==true)
		{
			if(Arbol.Retira(Arbol.DameRaiz(), d)==true)
				System.out.println("SE ENCONTRO Y SE ELIMINO EL NODO CON EL DATO " +d);
			else
				System.out.println("SE ENCONTRO EL NODO CON EL DATO "+d+" PERO NO SE ELIMINO");
		}
		else 
		{
			System.out.println("EL NODO CON EL DATO "+d+" NO SE ENCONTRO");
		}
	}
}
