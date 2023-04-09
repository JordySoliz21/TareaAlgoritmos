//26. Escriba un programa independiente para cada inciso considerando una lectura de distintos numeros tal como se detallan a continuacion. a) XY b) XYZ c) XYZW.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class programIndependiente_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		System.out.print("INGRESAR AQUI EL PRIMER NUMERO: ");
		int X = tc.nextInt();
		System.out.print("INGRESAR AQUI EL SEGUNDO NUMERO: ");
		int Y = tc.nextInt();
		System.out.print("INGRESAR AQUI EL TERCER NUMERO: ");
		int Z = tc.nextInt();
		System.out.print("INGRESAR AQUI EL CUARTO NUMERO: ");
		int W = tc.nextInt();
		
		 	double PROMEDIO = (X + Y + Z + W) / 4.0;
		 	System.out.println("EL PROMEDIO DE LOS NUMEROS INGRESADOS ANTERIORMENTE ES: " + PROMEDIO);
	
	
	}

}
