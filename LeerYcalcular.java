//24. Escriba un programa que lea un numero A. si A es un numero positivo calcule Y=2^A, si es negativo calcule Y+A+5 imprimir el resultado de Y.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class LeerYcalcular {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.print("INGRESE AQUI UN NUMERO: ");
		int A = tc.nextInt();
		int Y;
		
	if (A >= 0) {
		Y = (int) Math.pow(2, A);
	}else {
		Y = A + 5;
	}
		System.out.println("EL RESULTADO ES: "+ Y);
	}

}
