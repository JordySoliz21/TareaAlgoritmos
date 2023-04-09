//45. De una lista de n voltajes escriba el programa que calcule el voltaje mínimo, el voltaje máximo y el promedio de todos

package AlgoritmosIterativos;
import java.util.Scanner;
public class VoltminMax_main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de voltajes: ");
        int N = tc.nextInt();

        double[] VOLTAJES = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("INGRESAR EL VOLTAJES " + (i+1) + ": ");
            VOLTAJES[i] = tc.nextDouble();
        }
        double MIN = N;
        for (int i = 1; i < N; i++) {
            if(VOLTAJES[i] < MIN) {
                MIN = VOLTAJES[i];
            }
        }
        double MAX = N;
        for (int i = 1; i < N; i++) {
            if (VOLTAJES[i] > MAX) {
                MAX = VOLTAJES[i];
            }
        }
        double SUM = 0;
        for (int i = 0; i < N; i++) {
            SUM += VOLTAJES[i];
        }
        double PROMEDIO = SUM / N;

        System.out.println("EL VOLTAJE MINIMO ES: " + MIN);
        System.out.println("EL VOLTAJE MAXIMO ES: " + MAX);
        System.out.println("EL PROMEDIO DE LOS VOLTAJES ES: " + PROMEDIO);

    }
}

	


