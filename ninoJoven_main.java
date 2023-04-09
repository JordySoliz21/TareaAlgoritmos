//44. Dada la edad de una persona escriba un programa que imprima “niño” si la edad es menor que 13 “joven” si la edad es mayor que 13 y menor o igual 25 y “adulto” si la edad es mayor que 25.

package AlgoritmosIterativos;
import java.util.Scanner;
public class ninoJoven_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
	      System.out.print("INGRESAR LA EDAD DE LA PERSONA: ");
	      int EDAD = tc.nextInt();

	      if (EDAD < 13) {
	         System.out.println("NIN'O");
	      } else if (EDAD <= 25) {
	         System.out.println("JOVEN");
	      } else {
	         System.out.println("ADULTO");
	      }
	   }
	}
