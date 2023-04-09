//10. Determine el valor de la fuerza de un cuerpo que tiene por masa "M" y aceleracion "A".

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class FuerzaCuerpo_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		double M, A, F;
		
		System.out.print("INGRESAR LA MASA DEL CUERPO: ");
		M = tc.nextDouble();
		System.out.print("INGRESAR LA ACELERACION DEL CUERPO: ");
		A = tc.nextDouble();
		
		F = M*A;
		System.out.println("LA FUERZA DEL CUERPO ES: " + F);
		
		
		
	}

}
