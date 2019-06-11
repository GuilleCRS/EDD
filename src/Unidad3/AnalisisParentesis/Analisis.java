package Unidad3.AnalisisParentesis;
import Unidad3.*;
import java.util.Stack;
/**
 * Created by ADM-PC on 13/03/2017.
 */
public class Analisis {
    Pila pila = new Pila();

    public static void main(String[] args) {
        Analisis an = new Analisis();
        System.out.println("Introduzca una expresion");
        String exp = "";
        exp = Leer.dato();
        if (an.Analisis(exp)) {
            an.Conversion(exp);
        }
    }
    public boolean Analisis(String exp) {
        for (int i = 0; i < exp.length(); i++) {
            char caract = exp.charAt(i);
            if ((caract == '(') || (caract == '{') || (caract == '[')) {
                pila.Inserta(caract);
                System.out.println(pila.MostrarT());
            }
            if ((caract == '}') || (caract == ']') || (caract == ')')) {
                if (!pila.Vacia()) {
                    char caract2 = (char) pila.MostrarT();
                    char cart1 = ' ';
                    if (caract2 == '(') {
                        cart1 = ')';
                    }
                    if (caract2 == '[') {
                        cart1 = ']';
                    }
                    if (caract2 == '{') {
                        cart1 = '}';
                    }
                    if (pila.Vacia() == false) {
                        if (cart1 == caract) {
                            pila.Retira();
                            System.out.println(caract);
                        }
                    } else if (pila.Vacia()) {
                        System.out.println("Error en la expresion " + exp);
                        return false;
                    }
                } else {
                    System.out.println("Hay un error en la expresion");
                    return false;
                }
            }
        }
        if (pila.Vacia()) {
            return true;
        } else if (pila.Vacia() == false) {
            System.out.println("Error en la expresion " + exp);
            return false;
        }
        return false;
    }
    public void Conversion(String exp) {
        Stack S = new Stack();
        StringBuilder salida = new StringBuilder();
        for (int i = 0; i < exp.length(); i++) {
            char caract = exp.charAt(i);
            if ((caract >= 'a' && caract <= 'z') || (caract >= 'A' && caract <= 'Z') || ('0' <= caract && caract <= '9')) {
                salida.append(caract);
            }
            if ((caract == '+') || (caract == '*') || (caract == '/') || (caract == '-')) {
                S.push(caract);
            }
            if ((caract == '}') || (caract == ']') || (caract == ')')) {
                if (!S.empty()) {
                    salida.append(S.pop());
                }
            }
        }
        while (!S.empty()) {
            salida.append(S.pop());
        }
        System.out.println("Expresion infija:  " + exp);
        System.out.println("Expresion postfija: " + salida);
    }
}