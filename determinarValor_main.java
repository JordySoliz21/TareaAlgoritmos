//3. Determinar el valor de y=x*c-2 donde c es una constante con valor c=2.5, sabiendo x=2 considerando X como valor cualquiera.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class determinarValor_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
	double C = 2.5;
		System.out.println("INGRESAR EL VALOR DE X: ");
	
	double X = tc.nextDouble();
	
	double Y = X*C-2;
		System.out.println("EL VALOR DE Y ES: "+ Y);
	
	}

}
