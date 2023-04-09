//9. Calcular el volumen de un cilindro conociendo su radio y altura.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class VolCilindro_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.print("INGRESAR RADIO DEL CILINDRO: ");
		double RADIO = tc.nextDouble();
		System.out.print("INGRESAR ALTURA DEL CILINDRO: ");
		double ALTURA = tc.nextDouble();
		
		double VOLUMEN = Math.PI * RADIO * RADIO * ALTURA;
		System.out.println("EL VOLUMEN DE ESTE CILINDRO ES: "+ VOLUMEN);
	
	
	}

}
