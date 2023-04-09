//22. Escribir un programa para calcular el interes de una capital conforme a la siguiente condicion. Si el capital es ,mayor que 10,000$ entonces la tasa es del 7% en caso contrariio del 6%, debe imprimir el capital y su interes.

package AlgoritmoSecuenciales;

import java.util.Scanner;

public class InteresCapital_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		double CAPITAL, TASA, INTERES;
		System.out.print("POR FAVOR INGRESE EL CAPITAL PRESTADO: ");
		CAPITAL = tc.nextDouble();
		
		if (CAPITAL > 10000) {
			TASA = 0.07;
		}else {
			TASA = 0.05;
		}
	INTERES = CAPITAL * TASA;	
	System.out.println("EL INTERES ES: " + INTERES);
	
	}

}


