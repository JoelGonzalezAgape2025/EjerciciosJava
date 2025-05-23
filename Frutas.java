import java.util.Scanner;

public class Frutas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] frutas = new String[10];

        for (int i = 0; i < frutas.length; i++) {

            System.out.print("Digite fruta " + (i + 1) + ": ");
            frutas[i] = scanner.next();
        }

        System.out.println("Frutas digitadas pero en listadas en inversa:");
        
        for (int i = frutas.length -1; i >= 0; i--) {
            System.out.println("Fruta " + (i + 1) + ": " + frutas[i]);
        }
        scanner.close();
    }

}
