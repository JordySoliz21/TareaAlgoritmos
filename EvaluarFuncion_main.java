//5. Evaluar la funcion Y= 5X^4 + 2X^3 + 3X^2 + 7. Para el valor de X=1 siendo X un numero cualquiera.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class EvaluarFuncion_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);	
	double X = 1;
	double Y = 5*Math.pow(X, 4) + 2*Math.pow(X, 3) + 3*Math.pow(X, 2) + 7;
		System.out.println("y = " + Y);

	X = 4.8;
	Y = 5*Math.pow(X, 4) + 2*Math.pow(X, 3) + 3*Math.pow(X, 2) + 7;
		System.out.println("y = " + Y);
		
	}

}
