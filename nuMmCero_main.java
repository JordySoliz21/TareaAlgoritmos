//42. Leer “N” números distintos de 0, si el número leído es positivo súmelo en caso contrario cuéntelo.

package AlgoritmosIterativos;
import java.util.Scanner;
public class nuMmCero_main {

	public static void main(String[] args) {
		Scanner tc =  new Scanner(System.in);
	        int N, NUM, SUMApos = 0, CONTAneg = 0;

	        System.out.print("INGRESAR VALOR DE N: ");
	        N = tc.nextInt();

	      for (int i = 1; i <= N; i++) {
	        System.out.print("INGRESAR EL NUMERO " + i + ": ");
	        NUM = tc.nextInt();

	            if (NUM > 0) {
	                SUMApos += NUM;
	            } else if (NUM < 0) {
	                CONTAneg++;
	            }
	        }

	        System.out.println("LA SUMA DE LOS NUMEROS POSITIVOS ES: " + SUMApos);
	        System.out.println("EL NUMERO DE NUMEROS NEGATIVOS QUE HAY ES: " + CONTAneg);

	       
	}

}
