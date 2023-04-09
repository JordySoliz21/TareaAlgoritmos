//39. Escriba un programa que lea las notas de “N” alumnos y calcule cuantos aprobados y desaprobados hay (está aprobado si la nota es mayor de 60).

package AlgoritmosIterativos;
import java.util.Scanner;
public class notaNalum_main {

		public static void main(String[] args) {
			Scanner tc = new Scanner(System.in);
	        int N, APROBADOS = 0, DESAPROBADOS = 0;
	        float NOTA;

	        System.out.print("INGRESAR AQUI EL NUMERO DE ALUMNOS: ");
	        N = tc.nextInt();

	        for (int i = 1; i <= N; i++) {
	            System.out.print("IMGRESAR LA NOTA QUE TIENE EL ALUMNO " + i + ": ");
	            NOTA = tc.nextFloat();

	            if (NOTA >= 60) {
	                APROBADOS++;
	            } else {
	                DESAPROBADOS++;
	            }
	        }

	        System.out.println("EL NUMEROS DE ALUMNOS APROBADOS ES: " + APROBADOS);
	        System.out.println("EL NUMERO DE ALUMNOS DESAPROBADOS ES: " + DESAPROBADOS);

	}

}
