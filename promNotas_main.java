//43. En un curso de 25 alumnos se practican 3 exámenes los datos de cada estudiante se registran así: Nombre, Nota1, Nota2, Nota3. Escriba un programa que calcule por cada estudiante el promedio de las notas.

package AlgoritmosIterativos;
import java.util.Scanner;
public class promNotas_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		 double[] NOTAS = new double[25];
	      double SUMA = 0;
	      
	      for (int i = 0; i < NOTAS.length; i++) {
	         
	    	 System.out.print("INGRESE EL NOMBRE DEL ESTUDIANTE " + (i + 1) + ": ");
	         String NOMBRE = tc.nextLine();
	         System.out.print("INGRESE LA NOTA #1 DEL ESTUDIANTE " + (i + 1) + ": ");
	         double NOTA1 = tc.nextDouble();
	         System.out.print("INGRESE LA NOTA #2 DEL ESTUDIANTE " + (i + 1) + ": ");
	         double NOTA2 = tc.nextDouble();
	         System.out.print("INGRESE LA NOTA #3 DEL ESTUDIANTE " + (i + 1) + ": ");
	         double NOTA3 = tc.nextDouble();
	         tc.nextLine();
	         
	         double PROMEDIO = (NOTA1 + NOTA2 + NOTA3) / 3;
	         NOTAS[i] = PROMEDIO;
	         SUMA += PROMEDIO;
	         
	         System.out.println("EL PROMEDIO DEL ESTUDIANTE " + NOMBRE + " ES: " + PROMEDIO);
	      }
	      
	      double promedioGENERAL = SUMA / NOTAS.length;
	      System.out.println("EL PROMEDIO GENERAL DEL CURSO ES: " + promedioGENERAL);
	   }
	}
