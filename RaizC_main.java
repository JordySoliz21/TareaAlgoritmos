//4. Determine la raiz cuadrada de un numero cualquiera.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class RaizC_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.println("INTRODUCIR NUMERO ENTERO: ");
	int n = tc.nextInt();
	tc.close();
	
	if (n < 0) {
		System.out.println("ERROR NO PUEDO CALCULAR RAIZ DE UN NUMERO NEGATIVO: ");

	} else {
		
		double Raiz = Math.sqrt(n);
		System.out.printf("LA RAIZ DE %d es %.2f" , n, Raiz);
	
		}
	}
}
