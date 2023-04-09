//8. Calcular el area de un triangulo conociendo sus tres lados.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class areaTriang3L_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
	System.out.print("INGRESAR EL PRIMER LADO DEL TRIANGULO: ");
	double x = tc.nextDouble();
	System.out.print("INGRESAR EL SEGUNDO LADO DEL TRIANGULO: ");
	double y = tc.nextDouble();
	System.out.print("INGRESAR EL TERCER LADO DEL TRI4NGULO: ");
	double z = tc.nextDouble();
	
	double w = (x + y + z) / 2;
	double AREA = Math.sqrt(w * (w - x) * (w - y) * (w - z));
	
	System.out.println("EL AREA DEL TRIANGULO ES: "+ AREA);
	
	tc.close();
	
	
	
	
	
	}

}
