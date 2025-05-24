package JuegoModificado;
import java.util.Scanner;
public class Nivel2 {

    public int puntaje;
    private String respuesta;
    private final String[] animales;
    private final Scanner ent;

    public Nivel2(){
        puntaje = 0;
        ent = new Scanner(System.in);
        animales = new String[4];
        animales[0] = "loro";
        animales[1] = "vaca";
        animales[2] = "caballo";
        animales[3] = "gallo";
    }


    public void  puntajeLoro(){
        if(respuesta.equals(animales[0])){
            System.out.println("¡Correcto!, Haz ganado 10 puntos");
            puntaje += 20;

        }
        else
        {
            System.out.println("¡Incorrecto!, La respuesta es: " + animales[0]);
            System.out.println("Haz perdido 5 puntos");
            puntaje -= 10;

        }

    }

    public void puntajeVaca(){
        if(respuesta.equals(animales[1])){
            System.out.println("¡Correcto!, Haz ganado 10 puntos");
            puntaje += 20;

        }
        else
        {
            System.out.println("¡Incorrecto!, La respuesta es: " + animales[1]);
            System.out.println("Haz perdido 5 puntos");
            puntaje -= 10;

        }

    }

    public void puntajeCaballo(){
        if(respuesta.equals(animales[2])){
            System.out.println("¡Correcto!, Haz ganado 10 puntos");
            puntaje += 20;

        }
        else
        {
            System.out.println("¡Incorrecto!, La respuesta es: " + animales[2]);
            System.out.println("Haz perdido 5 puntos");
            puntaje -= 10;

        }

    }

    public void puntajeGallo(){
        if(respuesta.equals(animales[3])){
            System.out.println("¡Correcto!, Haz ganado 10 puntos");
            puntaje += 20;

        }
        else
        {
            System.out.println("¡Incorrecto!, La respuesta es: " + animales[3]);
            System.out.println("Haz perdido 5 puntos");
            puntaje -= 10;

        }

    }

    public void imprimePregustas(){
        System.out.println("¿Es un animal que aprende a hablar?");
        respuesta = ent.nextLine();
        puntajeLoro();

        System.out.println("¿Es un animal que da leche?");
        respuesta = ent.nextLine();
        puntajeVaca();

        System.out.println("¿Es un animal que galopa?");
        respuesta = ent.nextLine();
        puntajeCaballo();

        System.out.println("¿Es un animal que canta en las mañanas?");
        respuesta = ent.nextLine();
        puntajeGallo();
    }

}
