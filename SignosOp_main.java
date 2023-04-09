//28. Escriba un programa que lea dos numeros enteros como entrada y escriba el mensaje signos opuestos si solos si uno de los enteros es positivo y el otro negativo.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class SignosOp_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		System.out.print("INGRESAR AQUI EL PRIMER NUMERO: ");
		int NUMERO1 = tc.nextInt();
		System.out.print("INGRESAR AQUI EL SEGUNDO NUMERO: ");
		int NUMERO2 = tc.nextInt();
		
	if ((NUMERO2 > 0 && NUMERO2 < 0) || (NUMERO1 < 0 && NUMERO2 > 0)) {
		System.out.println("SIGNOS OPUESTOS.");
	   }
		
	}

}
