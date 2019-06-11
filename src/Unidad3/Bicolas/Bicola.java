package Unidad3.Bicolas;
public class Bicola<G>
{
    private int	    numDeNodos;
    private Nodo<G>	primerNodo;
    private Nodo<G>	ultimoNodo;


    public int getNumDeNodos()//Metodo para obtener el numero de nodos
    {
        return numDeNodos;
    }
    // Añade un nuevo Nodo a la izquierda modificando las referencias de las propiedades.
    public void addDatoIzquierda( G dato )
    {
        Nodo<G> temp = new Nodo<G>(dato);

        if( primerNodo == null )
        {
            primerNodo = temp;
            ultimoNodo = temp;
        }
        else
        {
            temp.setNodoSiguiente(primerNodo);
            primerNodo.setNodoAnterior(temp);
            primerNodo = temp;
        }
        numDeNodos++;
    }
    // Añade un nuevo Nodo a la derecha modificando las referencias de las propiedades.
    public void addDatoDerecha( G dato )
    {
        Nodo<G> temp = new Nodo<G>(dato);

        if( ultimoNodo == null )
        {
            primerNodo = temp;
            ultimoNodo = temp;
        }
        else
        {
            temp.setNodoAnterior(ultimoNodo);
            ultimoNodo.setNodoSiguiente(temp);
            ultimoNodo = temp;
        }
        numDeNodos++;
    }
    // Extrae el primer dato y cambia las referenciaas de las propiedades.
    public G getDatoIzquierda()
    {
        G temp = primerNodo.getDatoNodo();

        if( primerNodo == ultimoNodo ) // Solo hay un nodo y se acaba de extraer quedando ahora 0.
        {
            primerNodo = null;
            ultimoNodo = null;
        }
        else
        {
            primerNodo = primerNodo.getNodoSiguiente();
            primerNodo.setNodoAnterior(null);
        }

        numDeNodos--;
        return temp;
    }
    // Extrae el ultimo dato y cambia las referenciaas de las propiedades.
    public G getDatoDerecha()
    {
        G temp = ultimoNodo.getDatoNodo();

        if( primerNodo == ultimoNodo )
        {
            primerNodo = null;
            ultimoNodo = null;
        }
        else
        {
            ultimoNodo = ultimoNodo.getNodoAnterior();
            ultimoNodo.setNodoSiguiente(null);
        }

        numDeNodos--;
        return temp;
    }
    // Concatena todos los elementos de la Bicola por referencias y lo retorna.
    public String toString()
    {
        StringBuilder cadena = new StringBuilder();
        Nodo<G> posicion = primerNodo;

        while(posicion != null)
        {
            cadena.append(posicion.getDatoNodo()).append(", ");
            posicion = posicion.getNodoSiguiente();
        }
        return cadena.toString();
    }

}
