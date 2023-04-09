//18. Leer un numero de tres cifras e imprimirlo en orden invertido. Ejemplo: Entrada 567, Salida: 765.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class n3cifrasOrdenI_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.print("INGRESAR NUMERO DE TRES CIFRAS: ");
		int Num = tc.nextInt();
		int Dig1 = Num % 10;
		int Dig2 = (Num / 10) % 10;
		int Dig3 = Num / 100;
		int NumInv = Dig1 * 100 + Dig2 * 10 + Dig3;
		
		System.out.println("EL NUMERO INVERTIDO ES: " + NumInv);
		
		
		

	}

}
