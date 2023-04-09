//13. Convertir Y yardas, F pies y L pulgadas a Centimetros.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class YardasPiesPulgadasCM_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.print("INGRESAR MEDIDA EN PIES: ");
		double F = tc.nextDouble();
	
	double Y = F / 3.0;
	double L = F * 12.0;
	double CENTIMETROS = L * 2.54;
	double METROS = CENTIMETROS / 100.0;
	
	System.out.println("LA MEDIDA EN YARDAS ES: " + Y);
	System.out.println("LA MEDIDA EN PULGADAS ES: " + L);
	System.out.println("LA MEDIDA EN CENTIMETROS ES: " + CENTIMETROS);
	System.out.println("LA MEDIDA EN METROS ES: " + METROS);
	
	
	}

}
