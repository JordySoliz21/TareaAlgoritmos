//35. Escriba un programa que lea tres números cualesquiera y que calcule la suma de ellos y su promedio.

package AlgoritmosIterativos;
import java.util.Scanner;
public class SumaPromedio_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		System.out.print("INGRESAR AQUI EL PRIMER NUMERO: ");
        double NUM1 = tc.nextDouble();
        System.out.print("INGRESAR AQUI EL SEGUNDO NUMERO: ");
        double NUM2 = tc.nextDouble();
        System.out.print("INGRESAR AQUI EL TERCER NUMERO: ");
        double NUM3 = tc.nextDouble();
        double SUMA = NUM1 + NUM2 + NUM3;
        double PROMEDIO = SUMA / 3;
        System.out.println("LA SUMA DE LOS TRES NUMEROS INGRESADOS ES: " + SUMA);
        System.out.println("EL PROMEDIO DE LOS TRES NUMEROS INGRESADOS ES: " + PROMEDIO);
	}

}
