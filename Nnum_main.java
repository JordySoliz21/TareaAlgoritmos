//36. Escriba un programa que lea “n” números que calcule su suma y su promedio.

package AlgoritmosIterativos;
import java.util.Scanner;
public class Nnum_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
        int N, SUMA = 0;
        double PROMEDIO;
        System.out.print("INGRESAR LA CANTIDAD DE NUMEROS A SUMAR: ");
        N = tc.nextInt();
        int[] NUMEROS = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("INGRESE EL NUMERO " + (i + 1) + ": ");
            NUMEROS[i] = tc.nextInt();
            SUMA += NUMEROS[i];
        }
        PROMEDIO = (double) SUMA / N;
        System.out.println("LA SUMA DE ESTOS NUMEROS ES: " + SUMA);
        System.out.println("EL PROMEDIO DE ESTOS NUMEROS ES: " + PROMEDIO);

	}

}
