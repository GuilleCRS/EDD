package ProySS;

import Unidad3.Nodo;

/**
 * Created by ADM-PC on 27/03/2017.
 */
public class Lista<T> {
    private Nodo<T> Frente;
    private Nodo<T> Fin;
    public T Dr;

    public Lista() {
        Frente = Fin = null;
        Dr = null;
    }

    public Nodo<T> DameFrente() {
        return Frente;
    }

    public Nodo<T> DameFin() {
        return Fin;
    }

    public boolean InsertaFrente(T Dato) {
        Nodo<T> Nuevo = new Nodo<T>(Dato);
        if (Nuevo == null)
            return false;
        if (Frente == null) {
            Frente = Fin = Nuevo;
            return true;
        }
        Nuevo.setSig(Frente);
        Frente = Nuevo;
        return true;

    }

    public boolean InsertaFin(T Dato) {
        Nodo<T> Nuevo = new Nodo<T>(Dato);
        if (Nuevo == null)
            return false;
        if (Frente == null) {
            Frente = Fin = Nuevo;
            return true;
        }
        Fin.setSig(Nuevo);
        Fin = Nuevo;
        return true;

    }

    public void EstadoActual() {
        boolean band = false;
        Nodo<T> Aux = Frente;
        while (Aux != null) {
            System.out.println(Aux.Info.toString());
            Aux = Aux.DameSig();
        }
    }

    public boolean Eliminar(T dato) {
        Nodo<T> Tra=Frente;
        Nodo<T> Ant=null;
        boolean bandera=false;
        if (Frente==null)
            return false;
        else
        {
            while(Tra !=null)
            {
                if (Tra.Info==dato)
                {
                    bandera=true;
                    break;
                }
                Ant=Tra;
                Tra=Tra.DameSig();
            }
            if (bandera==false)
                return false;

            if (Tra==Frente)
            {
                if(Frente==Fin)
                {
                    Frente=Fin=null;
                    return true;
                }
                else
                    Frente=Frente.DameSig();

            }
            if(Fin==Tra)

            {
                Fin=Ant;
                Fin.setSig(null);
                return true;
            }
            Ant.setSig(Tra.DameSig());
            return true;


        }
    }

    public boolean InsertaOrd(T dato) {
        Nodo<T> Nuevo = new Nodo<T>(dato);
        if (Nuevo == null) {
            return false;
        }
        if (Frente == null) {
            Frente = Fin = Nuevo;
            return true;
        }
        if (Nuevo.Info.toString().compareTo(Frente.Info.toString()) <= 0) {
            Nuevo.setSig(Frente);
            Frente = Nuevo;
            return true;
        }
        if (Nuevo.Info.toString().compareTo(Fin.Info.toString()) >= 0) {
            Fin.setSig(Nuevo);
            Fin = Nuevo;
            return true;
        }
        Nodo<T> Ant = null, Aux = Frente;
        while (Aux.Info.toString().compareTo(Nuevo.Info.toString()) < 0) {
            Ant = Aux;
            Aux = Aux.DameSig();
        }
        Ant.setSig(Nuevo);
        Nuevo.setSig(Aux);
        return true;
    }

    public int NoElementos() {
        boolean band = false;
        int num = 0;
        Nodo<T> Aux = Frente;
        while (Aux != null) {
            num++;
            Aux = Aux.DameSig();
        }
        return num;
    }

    public boolean Estatus() {
        if (Frente == null) {
            return false;
        } else {
            return true;
        }

    }

    public boolean Busqueda(T dato) {

        Nodo<T> Tra=Frente;
        Nodo<T> Ant=null;
        boolean bandera=false;
        if (Frente==null)
            return false;
        else {
            while (Tra != null) {
                if (Tra.Info == dato) {
                    bandera = true;
                    break;
                }
                Ant = Tra;
                Tra = Tra.DameSig();
            }
            if (bandera == true) {
                return true;
            } else
                return false;
        }

    }
    public boolean EliminarRandom(int dato) {
        int n=0;
        Nodo<T> Tra=Frente;
        Nodo<T> Ant=null;
        boolean bandera=false;
        if (Frente==null)
            return false;
        else
        {
            while(Tra !=null)
            {
                if (n==dato)
                {
                    Dr=Tra.Info;
                    bandera=true;
                    break;
                }
                Ant=Tra;
                Tra=Tra.DameSig();
                n++;
            }
            if (bandera==false)
                return false;

            if (Tra==Frente)
            {
                if(Frente==Fin)
                {
                    Frente=Fin=null;
                    return true;
                }
                else
                    Frente=Frente.DameSig();

            }
            if(Fin==Tra)

            {
                Dr=Tra.Info;
                Fin=Ant;
                Fin.setSig(null);
                return true;
            }

            Ant.setSig(Tra.DameSig());
            return true;


        }

    }

}

