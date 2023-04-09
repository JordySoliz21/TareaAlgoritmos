//37. Escriba un programa que tenga como entrada “n” números enteros y que calcule el número de números pares e impares.

package AlgoritmosIterativos;
import java.util.Scanner;
public class calcNumdNum_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		 int N, NUM, PARES = 0, IMPARES = 0;
	        System.out.print("INGRESE AQUI LA CANTIDAD DE NUMEROS A INGRESAR: ");
	        N = tc.nextInt();
	        for (int i = 1; i <= N; i++) {
	            System.out.print("INGRESAR EL NUMERO " + i + ": ");
	            NUM = tc.nextInt();
	            if (NUM % 2 == 0) {
	                PARES++;
	            } else {
	                IMPARES++;
	            }
	        }
	        System.out.println("CANTIDAD DE NUMEROS PARES: " + PARES);
	        System.out.println("CANTIDAD DE NUMEROS IMPARES: " + IMPARES);
	}

}
