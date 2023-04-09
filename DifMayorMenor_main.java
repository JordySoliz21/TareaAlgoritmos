//29. Escriba un programa que lea dos numeros enteros positivos distintos y escriba la diferencia entre el mayor y el menor. Asegurese que su programa escriba por ejemplo 8 si los numeros son 10 y 2  o bien 2 y 10.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class DifMayorMenor_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		System.out.print("INGRESE AQUI EL PRIMER NUMERO: ");
		int NUMERO1 = tc.nextInt();
		System.out.print("INGRESE AQUI EL SEGUNDO NUMERO: ");
		int NUMERO2 = tc.nextInt();
		
		int MAYOR = Math.max(NUMERO1, NUMERO2);
		int MENOR = Math.min(NUMERO1, NUMERO2);
		int DIFERENCIA = MAYOR - MENOR; 
		
		System.out.println("LA DIFERENCIA ENTRE EL MAYOR Y EL MENOR ES: " + DIFERENCIA);
	}

}
