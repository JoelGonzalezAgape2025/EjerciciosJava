import java.util.Scanner;

public class NumeroMayor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Digite 10 numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite el numero : " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();

        }

        double mayor = numeros[0];
        double menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];

            }

            if (numeros[i] < menor) {
                menor = numeros[i];

            }
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

        scanner.close();

    }

}
