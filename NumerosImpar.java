import java.util.Scanner;
public class NumerosImpar {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        

        System.out.println("Digite 12 numeros");
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite el numero " + (i + 1) + " ");
            numeros[i] = scanner.nextInt();

        }

        System.out.println("Los numeros impares son: ");
        for(int i = 0; i < numeros.length; i++){

            if((numeros[i]) % 2 != 0){
                System.out.println("El numero " + (i + 1) + " es impar: " + numeros[i]);
            }
        }
        scanner.close();


        
    }

}
