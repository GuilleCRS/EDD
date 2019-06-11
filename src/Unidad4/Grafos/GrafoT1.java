package Unidad4.Grafos;
import java.util.*;
/**
 * Created by guillecrs on 15/05/17.
 */
public class GrafoT1 {
    Grafos1 gr1=new Grafos1();
    Scanner leer = new Scanner(System.in);
    public static void main(String[]Args){
        GrafoT1 g1=new GrafoT1();
        Scanner nc=new Scanner(System.in);
        int op=0;
        do{
            System.out.println("");
            System.out.println("1°- Inserta vertice");
            System.out.println("2°- Busca vertice(Imprime ady)");
            System.out.println("3°- Inserta arista");
            System.out.println("4°- Elimina vertice");
            System.out.println("5°- Eliminar arista");
            System.out.println("6°- Recorre Grafo");
            System.out.println("7°- Verificar vacio");
            System.out.println("8°- Salir");
            System.out.println("Digita tu opcion");
            op=nc.nextInt();
            switch(op){
                case 1:
                    g1.Inserta();//terminado
                    break;
                case 2:
                    g1.BuscaVer();//terminado
                    break;
                case 3:
                    g1.InsertaAris();//terminado
                    break;
                case 4:
                    g1.EliminaVer();//terminado
                    break;
                case 5:
                    g1.EliminaAris();//terminado

                    break;
                case 6:
                    g1.Recorre();//terminado

                    break;
                case 7:
                    g1.Vacio();//terminado

                    break;
                case 8:
                    System.out.println("Adios");
                    break;
            }
        }while(op!=8);
    }

    private void EliminaAris() {
        System.out.println("Digita arista a elimnar");
        System.out.println("Nodo principal");
        String nodop=leer.nextLine();
        System.out.println("Nodo secundario");
        String nodosec=leer.nextLine();
        gr1.eliminAris(nodop,nodosec);

    }

    private void EliminaVer() {
        System.out.println("Digita nodo a eliminar");
                String nodo=leer.nextLine();
                gr1.eliminavert(nodo);
    }

    private void Vacio() {
        if(gr1.vacio()){
            System.out.println("El grafo esta vacio");
        }
        else
        {
            System.out.println("El grafo contiene elementos");
        }
    }

    private void BuscaVer() {
        System.out.println("Inserta nodo para buscar adyacentes");
        String a=leer.nextLine();
        gr1.ImprimeAdyacentes(a);
    }

    private void Recorre() {
       gr1.Recorrer();
    }

    private void Inserta() {
        System.out.println(" Inserta elemento");
        String a=leer.nextLine();
        if(gr1.agregaNodo(a)){
            System.out.println("Se inserto correctamente");
        }
        else{
            System.out.println("Hubo error al insertar vertice");
        }
    }

    private void InsertaAris() {
        System.out.println("Inserta nodo principal");
        String nodo=leer.nextLine();
        System.out.println("Inserta nodo a apuntar");
        String nvo=leer.nextLine();
        if(gr1.agregaArista(nodo,nvo)){
            System.out.println("Enlazado correctamente");
        }
        else{
            System.out.println("Hubo un error al enlazar");
        }
    }


}
