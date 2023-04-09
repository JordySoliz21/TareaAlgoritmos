//25. Escribir un programa que lea un numero cualquiera e imprima si el numero leido es divisible por 3.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class DivPor3 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		System.out.print("INGRESA AQUI UN NUMERO: ");
		int NUMERO = tc.nextInt();
	
	if (NUMERO % 3 == 0) {
		System.out.println(NUMERO + " ESTE SI ES DIVISIBLE POR TRES.");
	}else {
		System.out.println(NUMERO + " ESTE NO ES DIVISIBLE POR TRES.");
	
	   }
	
	}

}
 