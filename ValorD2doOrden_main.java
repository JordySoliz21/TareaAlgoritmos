//15. Determinar el valor del determinante de segundo plano.

package AlgoritmoSecuenciales;

public class ValorD2doOrden_main {

	public static void main(String[] args) {
		
		int [][] MATRIZ = {{1,2}, {3,4}}; 
		int DETERMINANTE = MATRIZ[0][0] * MATRIZ [1][1] - MATRIZ [0][1] * MATRIZ [1][0]; 
		System.out.println("EL DETERMINANTE DE LA MATRIZ ES: " + DETERMINANTE);
	}

}


