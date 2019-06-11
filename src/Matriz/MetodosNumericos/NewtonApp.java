package MetodosNumericos;

import java.io.*;

public class NewtonApp {


static BufferedReader reader;

public NewtonApp() {

reader = new BufferedReader(new InputStreamReader(System.in));

}

public static double readDouble() throws IOException {

return (new Double(reader.readLine())).doubleValue();

}


public static double f1 (double x) {

return x-5*Math.cos(2*x)+5;

}



public static double df(double x) {

return 10*Math.sin(2*x)+1;

}

public static void main(String[] args) {

double x, y, error;

boolean done = false;

NewtonApp v = new NewtonApp();

try {

System.out.print("x0 = ");

x = readDouble();

System.out.println();

System.out.print("error = ");

error = readDouble();

do {

y = f1(x);

System.out.println(x + " " + y);

if (Math.abs(y) <= error)

done = true;

x -= y / df(x);

} while (!done);

System.out.println("Raiz de la Ecuación :" + x);

} catch (Exception e) {

e.printStackTrace();

}

}

}
