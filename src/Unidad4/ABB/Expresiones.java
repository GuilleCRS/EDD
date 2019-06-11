package Unidad4.ABB;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Expresiones {
    public static void main(String[] args) {
        ArbolBB<String> abb=new ArbolBB<>();
        System.out.println("Digita tu expresion");
        String expresion=new Scanner(System.in).nextLine();
        StringTokenizer st=new StringTokenizer(expresion," */+-()",true);
        while (st.hasMoreElements()){
            String dato=st.nextElement().toString();
            System.out.println(dato);

            abb.Inserta(dato);
        }
        abb.inorder(abb.DameRaiz());
    }
}
