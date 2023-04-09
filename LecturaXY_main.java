//30. Escriba un programa que tenga como entrada la lectura de dos numeros llamados "X" y "Y" y que imprima una salida que corresponda a cada uno de los pares. a) (-X,-Y) entonces sumar cuadrados de cada exponente. b) (-X,Y) entonces dividir X entre Y. d) (X,Y) entonces verificar si X es mayor que Y, si es asi entonces sumarle a X el valor de Y, si no obtener la raiz cuadrada de X. 

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class LecturaXY_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.print("INGRESAR VALOR DE X: ");
		int X = tc.nextInt();
		System.out.print("INGRESAR VALOR DE Y: ");
		int Y = tc.nextInt();		
		System.out.println("EL PAR (" + X + ", " + Y + ") CORRESPONDE A");
		System.out.println("(" + (X) + ", " + (Y) + ")");

		int negX = -X;
		System.out.println("(" + negX + ", " + Y + ")");
		int newY = Y - negX;
		System.out.println("LA RESTA (" + negX + ", " + newY + ") CORRESPONDE A");
		System.out.println("(" + (-X) + ", " + (-Y) + ")");
		
		if (X < 0 && Y < 0) {
		
		int SUMAcUADRADOS = X * X + Y * Y;
		System.out.println("LA SUMA DE CUADRADOS DE LOS NUMEROS ANTERIORES ES: " + SUMAcUADRADOS);
		int RestarValor = -X * -Y + X * Y;
		System.out.println("LA RESTA DE LOS NUMEROS ANTERIORES ES: " + RestarValor);
		
		}
		
	}

}
