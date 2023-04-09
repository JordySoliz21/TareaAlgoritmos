//41. Calcule e imprima el producto de “N” números.

package AlgoritmosIterativos;
import java.util.Scanner;
public class CalEimpri_main {

	public static void main(String[] args) {
	      Scanner tc = new Scanner(System.in);
	      int N, PRODUCTO = 1;
	      
	      System.out.print("INGRESAR LA CANTIDAD DE NUMEROS QUE VA A MULTIPLICAR: ");
	      N = tc.nextInt();

	      int[] NUMEROS = new int[N];

	      for (int i = 0; i < N; i++) {
	         System.out.print("POR FAVOR INGRESE EL NUMERO " + (i+1) + ": ");
	         NUMEROS[i] = tc.nextInt();
	         PRODUCTO *= NUMEROS[i];
	      }

	      System.out.println("EL PRODUCTO DE LOS " + N + " NUMEROS ES: " + PRODUCTO);

	}

}
