//11. Obtener el valor coseno de un numero cualquiera.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class valorCos_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		System.out.print("INGRESE UN NUMERO EN GRADOS: ");
		double GRADOS = tc.nextDouble();
		
		double RADIANES = Math.toRadians(GRADOS);
		double COSENO = Math.cos(RADIANES);
		
		System.out.println("EL COSENO DE " + GRADOS + " GRADOS ES " + COSENO);
		
		
		
	}

}
