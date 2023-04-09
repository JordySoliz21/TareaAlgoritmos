//40. Escribir un programa que calcule la factorial de un número entero.
//3! =1’ 2’ 3’=6
//5! =1’ 2’ 3’ 4’ 5’=120

package AlgoritmosIterativos;
import java.util.Scanner;
public class fact_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
        System.out.print("INGRESAR UN NUMERO: ");
        int N = tc.nextInt();
        int FACT = 1;
        for (int i = 1; i <= N; i++) {
            FACT *= i;
        }
        System.out.println("EL FACTORIAL DE  " + N + " ES " + FACT);

	}

}
