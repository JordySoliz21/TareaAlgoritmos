//38. Escriba un programa que calcule cuantos números impares hay entre 20 y 100 e igualmente a cuantos asciende la suma de ellos.

package AlgoritmosIterativos;

public class veinteCien_main {

	public static void main(String[] args) {
		int CANTIDADdeIMPARES = 0;
        int SUMAdeIMPARES = 0;

        for (int i = 20; i <= 100; i++) {
            if (i % 2 != 0) {
                CANTIDADdeIMPARES++;
                SUMAdeIMPARES += i;
            }
        }

        System.out.println("LA CANTIDAD DE NUMEROS IMPARES ENTRE 20 y 100 es: " + CANTIDADdeIMPARES);
        System.out.println("LA SUMA DE LOS NUMEROS IMPARES ENTRE 20 Y 100 ES: " + SUMAdeIMPARES);

	}

}
