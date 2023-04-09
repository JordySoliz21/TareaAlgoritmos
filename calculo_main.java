//21. Escriba un programa que lea un numero que verifique si X es negativo que calcule x^4 en caso contrario que calcule X^2.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class calculo_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.print("POR FAVOR INGRRESE UN NUMERO: ");
		double X = tc.nextDouble();
		tc.close();
		
	if (X < 0) {
		double POT = Math.pow(X, 4);
		System.out.println("EL RESULTADO DE " + X + " ELEVADO A LA CUARTA POTENCIA ES: " + POT);
	
	}else {
		double POT = Math.pow(X, 2);
		System.out.println("EL RESULTADO DE " + X + " ELEVADO A LA SEGUNDA POTENCIA ES: " + POT);
	
	
	}
  }
}
