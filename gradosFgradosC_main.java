//7. Convertir X grados Fahrenheit a grados Celsius. Celsius=5/9 (Fahrenheit-323)

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class gradosFgradosC_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.println("INGRESAR GRADOS FAHRENHEIT: ");
		double FAHRENHEIT = tc.nextDouble();
		
		double CELSIUS = 5.0 / 9.0 * (FAHRENHEIT - 32);
		System.out.println(FAHRENHEIT + "GRADOS FAHRENHEIT ES IGUAL A " + CELSIUS + " GRADOS CELSIUS.");
	}

}
