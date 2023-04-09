//6. Convertir N kilogramos a libras.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class nKGaLB_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("INGRESAR LIBRAS : ");
		
        double lb = tc.nextDouble();
        final double KILOGRAMOS = 0.454;

        double CONVERSION = lb * KILOGRAMOS;
        if(lb !=0) {
        	System.out.println(lb + " LIBRAS ES A " + CONVERSION + " kilogramos.");
        }else {
        	System.out.println("EY, NO HAY NADA QUE CONVERTIR");
        	
        }
		}
	}


