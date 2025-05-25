import java.util.Scanner;

public class PuntoSilla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];


        System.out.println("Ingrese 12 números para llenar la matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Datos [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean hayPuntoSilla = false;


        for (int i = 0; i < 3; i++) {
            int minFila = matriz[i][0];
            int colMin = 0;
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] < minFila) {
                    minFila = matriz[i][j];
                    colMin = j;
                }
            }

            boolean esMayorCol = true;
            for (int k = 0; k < 3; k++) {
                if (matriz[k][colMin] > minFila) {
                    esMayorCol = false;
                    break;
                }
            }

            if (esMayorCol) {
                System.out.println("Punto de silla encontrado: " + minFila +
                        " en posición [" + i + "][" + colMin + "]");
                hayPuntoSilla = true;
            }
        }

        if (!hayPuntoSilla) {
            System.out.println("No hay punto de silla en la matriz.");
        }

        scanner.close();
    }
   

      
}
