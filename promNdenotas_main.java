//12. Obtener el promedio de N notas.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class promNdenotas_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
	
	System.out.print("INGRESAR LA CANTIDAD DE NOTAS: ");
	int N = tc.nextInt();
	
	    double SUMA = 0;
		for (int i = 0; i < N; i++) {
	System.out.print("INGRESAR NOTA " + (i+1) + ": ");
	double NOTA = tc.nextDouble();
	SUMA += NOTA;
	}
		double PROMEDIO = SUMA / N;
		System.out.println("EL PROMEDIO DE LAS " + N + " NOTAAS INGRESADAS ES: " + PROMEDIO);

	}
}