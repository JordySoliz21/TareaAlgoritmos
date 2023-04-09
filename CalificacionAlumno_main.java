//23. Escribir un programa que lea la calificacion de un alumno e imprima el mensaje de aprobado si su calificacion es mayor o igual a 60, en caso contrario imprima reporobado.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class CalificacionAlumno_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.print("INGRESE AQUI LA CALIFICACION DEL ALUMNO: ");
		int CALIFICACION = tc.nextInt();
	
	if (CALIFICACION >= 60) {
		System.out.println("A P R O B A D O!! ");
	}else {
		System.out.println("R E P R O B A D O!! ");
		}
 
	}
}
