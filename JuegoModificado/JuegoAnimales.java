package JuegoModificado;

public class JuegoAnimales {

   public static void main(String[] args){

        Nivel1 obj = new Nivel1();
        obj.imprimePregustas();

        Nivel2 obj2 = new Nivel2();
        obj2.imprimePregustas();

        System.out.println("//***********Marcador**********\\");
        System.out.println("Nivel 1");
        System.out.println("Tu Puntaje: " + obj.puntaje);
        System.out.println("Nivel 2");
        System.out.println("Tu Puntaje: " + obj2.puntaje);
        int total = obj.puntaje + obj2.puntaje;
        System.out.println("Tu puntaje total es: " + total + " puntos");
        System.out.println("//***********Fin del Juego**********\\");
    }

}
