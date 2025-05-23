import java.util.Scanner;
import java.util.Arrays;

public class Transpuesta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[3][3];

        System.out.println("Digite los 9 numeros de la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("valor [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextDouble();

            }
        }
        scanner.close();

       double[][] transpuesta = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

         System.out.println("Transpuesta:");
        for (double[] fila : transpuesta) {
            System.out.println(Arrays.toString(fila));
        }

    }

}
