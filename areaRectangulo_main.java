//1. Determinar el area del rectangulo que tenga por base "b" y altura "h"
	//IMPRIMIR BASE, ALTURA, AREA.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class areaRectangulo_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int b, h, a;
	
	System.out.print("INGRESAR BASE: ");
	b = tc.nextInt();
	System.out.print("INGRESAR ALTURA: ");
	h = tc.nextInt();
	
	a = b*h;
	
	System.out.println("BASE: " + b);
	System.out.println("ALTURA: "+ h);
	System.out.println("AREA: "+ a);
	
	
	
	
	}

}
