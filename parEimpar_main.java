//20. Escriba un programa que lea un numero cualquiera e imprima si es par o impar.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class parEimpar_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.print("INGRESA UN NUMERO: ");
	
		int NUM = tc.nextInt();
		if (NUM % 2 == 0) { 
			System.out.println(NUM + " ESTE ES UN NUMERO ES PAR.");
		}else {
			System.out.println(NUM + " ESTE ES UN NUMERO IMPAR.");
		}
	}

}
