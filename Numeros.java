import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[12];

        System.out.println("Digite 12 numeros");
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.print("Digite el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();

        }

        double sumaNumeros = 0;

        for (int i = 0; i < numeros.length; i++) {
            sumaNumeros += (numeros[i]);
        }

        double promedio = sumaNumeros / 12;
        System.out.println("El promedio de los 12 numeros es: " + Math.round(promedio));






        scanner.close();

    }

}
