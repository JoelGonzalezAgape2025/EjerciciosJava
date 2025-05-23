import java.util.Scanner;

public class Articulos {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        String[] articulos = new String[9];

        for (int i = 0; i < articulos.length; i++) {
            System.out.print("Articulo " + (i + 1) + ": ");
            articulos[i] = scanner.next();
        }

        System.out.println("Articulos digitados pero en listados en inversa:");
        for (int i = articulos.length -1; i >= 0; i--) {
            System.out.println("Articulo " + (i + 1) + ": " + articulos[i]);
        }

        scanner.close();
    }

}
