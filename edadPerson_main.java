//19. Escriba un programa que lea la edad de una persona e imprima es votante dado que tiene 16 o mas an'os de edad.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class edadPerson_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		System.out.print("INGRESAR LA EDAD DE LA PERSONA: ");
		int edad = tc.nextInt();
		
	if (edad >= 16) {
		System.out.println("PERFECTO, ESTA PERSONA ES VOTANTE.");
	} else {
		System.out.println("LO SIENTO, ESTA PERSONA NO ES VOTANTE.");
	}
		
	tc.close();	
		
		
	}

}
