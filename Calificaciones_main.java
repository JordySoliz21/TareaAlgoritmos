//32. Las calificaciones de los alumnos en un instituto son consideradas de la siguiente forma:a) A es 90 o más.b) B es al menos 80 pero menos de 90.c) C es al menos 70 pero menos de 80.d) D es al menos 65 pero menos de 70.e) E es menos de 6.Escriba un programa que considere la entrada de nota en número e imprima su codificación en letra.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class Calificaciones_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
        System.out.print("Ingrese la nota del alumno: ");
        int nota = tc.nextInt();
        char calificacion;
        if (nota >= 90) {
            calificacion = 'A';
        } else if (nota >= 80) {
            calificacion = 'B';
        } else if (nota >= 70) {
            calificacion = 'C';
        } else if (nota >= 60) {
            calificacion = 'D';
        } else if (nota >= 50) {
            calificacion = 'E';
        } else {
            calificacion = 'F';
        }
        System.out.println("La calificación del alumno es: " + calificacion);
    }

}


