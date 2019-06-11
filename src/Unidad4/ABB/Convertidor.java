package Unidad4.ABB;

import java.util.*;

public class Convertidor {
    public static void main(String[] args)
    {
        String exp = "( (A * B) + (C / D) )";
        System.out.println("DIGITA TU EXPRESION");
        exp=new Scanner(System.in).nextLine();
        String postfix= aPost.infiAPost(exp);
        String prefix= aPre.postAPre(postfix);
        System.out.println(postfix);
        System.out.println(prefix);
    }
}
class aPost{
    static int Prec(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    static String infiAPost(String exp)
    {
        StringBuilder resultado = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);

            //Si es un operando se agrega al resultado
            if (Character.isLetterOrDigit(c))
                resultado.append(c).append(" ");

                // Si es un parentesis se agrega a la pila
            else if (c == '(')
                stack.push(c);

                // Si encuentra un parentesis que cierra, mientras no sea un parentesis que abre y se agregan los elementos
            //entre los parentesis al resultado
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                    resultado.append(stack.pop()).append(" ");

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Expresion invalida";
                else
                    stack.pop();
            }
            else //Se encontró un operador y se agrega a la pila
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
                    resultado.append(stack.pop()).append(" ");
                stack.push(c);
            }

        }

        // Saca todos los operadores de la pila
        while (!stack.isEmpty())
            resultado.append(stack.pop()).append(" ");

        return resultado.toString();
    }


}

class aPre {
    public static boolean operand(String s)
    {
        if(s.charAt(0) == '*' || s.charAt(0) == '/' || s.charAt(0) == '^' ||
       s.charAt(0) == '+' || s.charAt(0) == '-')
        {
            return false;
        }
        return true;
    }


    // Conversion posfijo a prefijo
    public static String postAPre(String s)
    {
        Stack stack = new Stack();

        String a, b, test;
        //va a recorrer toda la cadena
        for(int i = 0; i != s.length(); i++)
        {
            test = "" + s.charAt(i);
            //Si se encuentra un espacio se salta ese ciclo
            if(test.trim().isEmpty()) continue;
            //Si es un operando se agrega a la pila
            if(operand(test))
            stack.push(test);
            else
            {
                //Caso contrario se botan dos operandos y se concatenan con el operador para entrar en la pila
                a = stack.pop().toString();
                b = stack.pop().toString();
                stack.push(test+" " +b +" "+ a+" ");

            }

        }
        //Se regregsa la conversion
        return stack.pop().toString();
    }


}

