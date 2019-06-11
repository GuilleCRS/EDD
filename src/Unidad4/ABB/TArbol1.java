package Unidad4.ABB;

/**
 * Created by ADM-PC on 25/04/2017.
 */
public class TArbol1 {
    public static void main(String[] args) {
        ArbolBB<String> abb = new ArbolBB<String>();
        abb.Inserta("15");
        abb.Inserta("09");
        abb.Inserta("06");
        abb.Inserta("14");
        abb.Inserta("13");
        abb.Inserta("20");
        Met(abb.DameRaiz());

    }

    public static void Met(NodoABB<String> Raiz) {
        if (Raiz == null)
            return;
        Met(Raiz.DameSubIzq());
        System.out.print(Raiz.Info + ",");
        Met(Raiz.DameSubDer());
    }
}
        /*
        MENU
        1- INSERTAR(ALEATORIO O PIDIENDO DATOS)
        2- IMPRIMIR IN ORDER (MET)LLAMAR INORDER
        3
        preorder (raiz)
        si raiz==null
               return fin;
           imprime raiz.info
           preorder raiz.subizq
           proderdes rainz.subder

        posorden (Raiz)
           Si raiz == null
                  return fin;
           postorden(raiz.subizq)
           postorden(raiz.subder)
           imprime raiz.info
         */