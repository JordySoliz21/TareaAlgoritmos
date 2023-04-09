//14. Determinar la solucion lineal que tiene la forma ax + b = 0 donde a y b son numeros reales.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class SolLineal_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.print("INGRESAR EL VALOR DE a: ");
		double a = tc.nextDouble();
		System.out.print("INGRESAR EL VALOR DE b: ");
		double b = tc.nextDouble();
		
		if (a == 0) {
			if (b == 0) {
				System.out.println("ESTA ECUACION TIENE UN SIN FIN DE SOLUCIONES.");
			} else {
				System.out.println("ESTA ECUACION NO TIENE SOLUCION.");
			}
		} else {
			double X = -b / a;
			System.out.println("LA SOLUCION DE ESTA ECUACION ES X = " + X);
	   }
					tc.close();
	
	
	}

}
