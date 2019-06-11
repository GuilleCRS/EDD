package Unidad3.Bicolas;

/**
 * Created by GuilleCRS on 29/03/2017.
 */
public class Nodo<G>
{

    private G	    elemento;
    private Nodo<G>	anteriorNodo;
    private Nodo<G>	siguienteNodo;


    public Nodo( G dato )
    {
        elemento = dato;
    }


    public G getDatoNodo()
    {
        return elemento;
    }


    public void setDatoNodo( G dato )
    {
        elemento = dato;
    }


    public Nodo<G> getNodoAnterior()
    {
        return anteriorNodo;
    }


    public Nodo<G> getNodoSiguiente()
    {
        return siguienteNodo;
    }


    public void setNodoAnterior( Nodo<G> nodo )
    {
        anteriorNodo = nodo;
    }


    public void setNodoSiguiente( Nodo<G> nodo )
    {
        siguienteNodo = nodo;
    }

}
