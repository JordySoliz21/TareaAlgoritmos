//27. Unos pantalones se venden a 10$ cada uno si se compran mas de 3, 12$ en los demas casos, estructure un programa que lea un numero de entrada de pantalones comprados e imprima el costo.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class PantCosT_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		System.out.print("INGRESAR LA CANTIDAD DE PANTALONES QUE SE HA COMPRADO: ");
		int N = tc.nextInt();
		double PRECIO;
		
	if (N > 3) {
		PRECIO = N * 10.0;
	}else {
	    PRECIO = N * 12.0;

	}
		System.out.println("EL PRECIO TOTAL DE LA COMPRA DE LOS PANTALONES ES: " + PRECIO + " DOLARE$$$.");
		
		
	}

}
