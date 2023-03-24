package figuras;

import java.util.Scanner;
import java.awt.Color;

public class PruebaFigura {

private static final String AREA = "El �rea es ";

public static void main(String[] args) {
int opcion;
Scanner teclado = new Scanner (System.in);
do { 
   opcion = mostrarMen();
   if (opcion != 4){
      System.out.print ("Introduzca la coordenada x del centro: ");
      double x = teclado.nextDouble();
      System.out.print ("Introduzca la coordenada y del centro: ");
      double y = teclado.nextDouble();
   String perimetro = "El per�metro es ";
switch (opcion)
	   {  case 1:
	primeraOpcion(teclado, x, y, perimetro);
        	 break;
         case 2:
	         System.out.print ("Introduzca la base del rect�ngulo: ");
        	 double base = teclado.nextDouble();
	         System.out.print ("Introduzca la altura del rect�ngulo: ");
        	 double altura = teclado.nextDouble();
        	 Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
        	 System.out.println (perimetro + r.perametro());
        	 System.out.println (AREA + r.area());
        	 break;
         case 3:
	         System.out.print ("Introduzca el lado del cuadrado: ");
        	 double lado = teclado.nextDouble();
	         Cuadrado c = new Cuadrado(x, y, Color.red, lado);
	         System.out.println (perimetro + c.perametro());
	         System.out.println (AREA + c.area());
	         break;
        }
   }
}while (opcion != 4); 
teclado.close();
}

private static void primeraOpcion(Scanner teclado, double x, double y, String perimetro) {
	System.out.print ("Introduzca el lado 1 del tri�ngulo: ");
	 double lado1 = teclado.nextDouble();
	 System.out.print ("Introduzca el lado 2 del tri�ngulo: ");
	 double lado2 = teclado.nextDouble();
	 System.out.print ("Introduzca el lado 3 del tri�ngulo: ");
	 double lado3 = teclado.nextDouble();
	 Triángulo t = new Triángulo(x, y, Color.red, lado1, lado2, lado3);
	 System.out.println (perimetro + t.perametro());
	 System.out.println (AREA + t.area());
}

public static int mostrarMen(){
int opcion;
System.out.println ("1) Tri�ngulo");
System.out.println ("2) Rect�ngulo");
System.out.println ("3) Cuadrado");
System.out.println ("4) Salir");
Scanner teclado = new Scanner (System.in);
do {
    System.out.print ("Introduzca una opci�n (1-4): ");
    opcion = teclado.nextInt();
    if (opcion < 1 || opcion > 4)
	   System.out.println ("Debe introducir un n�mero entre 1 y 4");
   } while (opcion < 1 || opcion > 4);
return opcion;
}
}
