//31. Un triangulo es equilatero si posee sus 3 lados, es isosceles si tiene solamente 2 lados, y escaleno cuando todos sus ladoss son desiguales. Escribir un programa que lea las dimrnsiones de los lados del triangulo y presente como salida el mensaje de su clasificacion.

package AlgoritmoSecuenciales;
import java.util.Scanner;
public class tipoTriangulo_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		System.out.println("INGRESE EL PRIMER LADO DEL TRIANGULO: ");
		double PRIMERLADO = tc.nextDouble();
		
		System.out.println("INGRESE EL SEGUNDO LADO DEL TRIANGULO: ");
		double SEGUNDOLADO = tc.nextDouble();
		
		System.out.println("INGRESE EL TERCER LADO DEL TRIANGULO: ");
		double TERCERLADO = tc.nextDouble();
		
	if (PRIMERLADO == SEGUNDOLADO && SEGUNDOLADO == TERCERLADO) {
		System.out.println("ESTE ES UN TRIANGULO EQUILATERO.");
	} else if (PRIMERLADO == SEGUNDOLADO || PRIMERLADO == TERCERLADO || SEGUNDOLADO == TERCERLADO) {
		System.out.println("ESTE UN TRIANGULO ISOSCELES.");
	}else {
		System.out.println("ESTE ES UN TRIANGULO ESCALENO.");
		
		
    	}
		
	}

}
