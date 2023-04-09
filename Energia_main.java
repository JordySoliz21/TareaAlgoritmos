//17. Determinar la energia total que almacena un cuerpo si su energia cinetica es 1/2 de la masa por su velocidad al cuadrado y la energia potencial es el producto de la masa , altura y la constante de gravedad. Recuerde que ET = EC + EP.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class Energia_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.print("INGRESAR LA MASA DEL CUERPO EN KILOGRAMOS: ");
		double MASA = tc.nextDouble();
		System.out.print("INGRESAR LA VELOCIDAD DEL CUERPO EN M/S: ");
		double VELOCIDAD = tc.nextDouble();
		System.out.print("INGRESAR LA ALTURA DEL CUERPO EN METRO: ");
		double ALTURA = tc.nextDouble();
		
		double EnergiaCINETICA = 0.5 * MASA * Math.pow(VELOCIDAD, 2);
		double EnergiaPOTENCIAL = MASA * 9.81 * ALTURA;
		double EnergiaTOTAL = EnergiaCINETICA + EnergiaPOTENCIAL;
		
		System.out.println("LA ENERGIA CINETICA DEL CUERPO ES: " + EnergiaCINETICA + " J");
		System.out.println("LA ENERGIA POTENCIAL DEL CUERPO ES: " +  EnergiaPOTENCIAL + " J");
		System.out.println("LA ERNGIA TOTAL DEL CUERPO ES: " + EnergiaTOTAL + " J");
		
		tc.close();
	}

}
