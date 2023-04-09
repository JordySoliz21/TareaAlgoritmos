//2. Determinar el perimetro de una circunferencia y el area de un circulo.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class perimetroAreaCir_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
	System.out.println("INGRESAR RADIO DEL CIRCULO: ");
		double r = tc.nextDouble();
		
	double pi = 3.1415;
	double Perimetro = 2*pi*r;
	double Area = pi*r*r;
	System.out.println("EL PERIMETRO DEL CIRCULO ES: "+ Perimetro);
	System.out.println("EL AREA DEL CIRCULO ES: "+ Area);
	
	
	
	}

}
