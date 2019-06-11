package Unidad3.Listas;
import Unidad3.*;
/**
 * Created by ADM-PC on 03/04/2017.
 */
public class ListaDBLT1 {
    ListaDBL<String> listadbl=new ListaDBL<String>();
    public static void main(String[]a){
        ListaDBLT1 lista=new ListaDBLT1();
        int op;
        do
        {
            System.out.println("Que desea hacer? ");
            System.out.println("1-° Insertar");
            System.out.println("2-° Eliminar");
            System.out.println("3-° Buscar");
            System.out.println("4-° Recorrer");
            System.out.println("5-° Estado");
            System.out.println("6-° Numero de elementos");
            System.out.println("7-° Salir.");
            op= Leer.datoInt();
            switch (op){
                case 1:
                    lista.Insertar();
                    break;
                case 2:
                    lista.EliminaEle();
                    break;
                case 3:
                    lista.buscar();
                    break;
                case 4:
                    lista.EstadoActual();
                    break;
                case 5:
                    lista.Estado();
                    
                    break;
                case 6:
                    lista.CuentaElementos();
            }
        }while(op!=7);
        System.out.println("Adios");
    }
    private void buscar() {
        System.out.println("Inserte el elemento a buscar");
        String elemento = Leer.dato();
        if (elemento != null) {
            if (listadbl.buscar(elemento.toUpperCase())) {
                System.out.println("El elemento se encuentra en la lista");
            } else {
                System.out.println("El elemento no se encuentra en la lista");
            }
        } else
            System.out.println("Error al buscar elemento");
    }
    private void Estado() {
        if(listadbl.estado()){
            System.out.println("La lista contiene elementos");
        }
        else
            System.out.println("La lista esta vacia");
    }
    private void Insertar() {
        System.out.println("Desea insertar al frente o al final?");
        System.out.println("1 Frente");
        System.out.println("2 Final");
        int FF=Leer.datoInt();
        if(FF==1){
            System.out.println("Inserte el elemento string a insertar al Frente");
            String dato=Leer.dato();
            if (dato.toUpperCase()!=null){
                if(listadbl.InsDblFre(dato.toUpperCase())){
                    System.out.println("Elemento insertado correctamente");
                }
            }
            else{
                System.out.println("Error al insertar elemento, verifique si es correcto");
            }
        }
        if(FF==2){
            System.out.println("Inserte el elemento string a insertar al Fin");
            String dato=Leer.dato();
            if (dato.toUpperCase()!=null){
                if(listadbl.InsDblFin(dato.toUpperCase())){
                    System.out.println("Elemento insertado correctamente");
                }
            }
            else{
                System.out.println("Error al insertar elemento, verifique si es correcto");
            }
        }
        else if(FF>=3){
            System.out.println("ERROR");
        }
    }
    private void EliminaEle() {
        System.out.println("Elemento a retirar");
        String er=Leer.dato();
        if(er.toUpperCase()!=null){
            if(listadbl.Retira(er.toUpperCase())){
                System.out.println("Elemento a retirar "+listadbl.Dr);
                System.out.println("Elemento retirado correctamente");
            }
            else{
                System.out.println("Error al retirar elemento :No existe");
            }
        }
        else{
            System.out.println("El elemento tiene que ser un dato string y no puede ser nulo");
        }
    }
    private void EstadoActual() {
        System.out.println("Introduzca la orientacion ");
        System.out.println(" 1 = FRENTE A FIN");
        System.out.println(" 2 = FIN A FRENTE");
        int orientacion = Leer.datoInt();
        if(orientacion==1 || orientacion==2){
            listadbl.EstadoActual(orientacion);
        }
    }
    public void CuentaElementos(){
        System.out.println("Hay ["+listadbl.CuentaEle()+ "] Elementos en la lista");
    }
}
