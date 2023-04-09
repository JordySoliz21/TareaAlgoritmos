//16. Determinar las soluciones de N sustemas de ecuaciones lineales con 2 incognitas aplicando el metodo de cramer. ax + by= c dx + ey = f donde a,b,c,e,f son numeros reales.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class MetodoCramer_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		double a, b, c, d, e, f;
		System.out.println("INGRESAR COEFICIENTES DEL SISTEMA DE ECUACIONES LINEALES:");
		
		System.out.print("a = ");
		a = tc.nextDouble();
		
		System.out.print("b = ");
		b = tc.nextDouble();
		
		System.out.print("c = ");
		c = tc.nextDouble();
		
		System.out.print("d = ");
		d = tc.nextDouble();
		
		System.out.print("e = ");
		e = tc.nextDouble();
	
		System.out.print("f = ");
		f = tc.nextDouble();
		
		double detA = a * e - b * d;
		double detX = c * e - b * f;
		double detY = a * f - c * d;
	if (detA != 0) {
		double X = detX / detA;
		double Y = detY / detA;
	System.out.println("ESTE SISTEMA TIENE UNA SOLUCION UNICA:");
	System.out.println("x = " + X);
	System.out.println("y = " + Y);
	} else if (detX == 0 && detY ==0) {
	System.out.println("ESTE SISTEMA TIENE UN SIN FIN DE SOLUCIONES.");
	}else {
		System.out.println("ESTE SISTEMA NO TIENE SOLUCION.");
	  	}
		
	}

}
