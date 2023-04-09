//34. Escriba un programa que lea “n” números enteros y que los imprima.

package AlgoritmosIterativos;
import java.util.Scanner;
public class leerNent_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.print("INGRESAR LA CANTIDAD DE NUMEROS QUE DARA A LEER: ");
        int N = tc.nextInt();
        int[] NUMEROS = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("INGRESE AQUI EL NUMERO " + (i + 1) + ": ");
            NUMEROS[i] = tc.nextInt();
        }
        System.out.println("LOS NUMEROS QUE SE HAN INGRESADO SON:");
        for (int i = 0; i < N; i++) {
            System.out.print(NUMEROS[i] + " ");
        }
    }
}
