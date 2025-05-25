package EjemploHerencia;

public class Main {

    public static void main(String[] args) {

        Futbolista futbolista = new Futbolista(1, "Marcos", "Vazzquez", 25, "10", "Delantero");
        Masajista masajista = new Masajista(3, "Maria", "Hernandez", 30, "Fisioterapeuta", "5 años");
        Entrenador entrenador = new Entrenador(2, "Miguel", "Gómez", 40, "12345");

        futbolista.jugarPartido();
        System.out.println("Dorsal: " + futbolista.getDorsal());
        masajista.daarMasajes();
        System.out.println("Nombre: " + masajista.getNombre());
        entrenador.dirigirEntrenamiento();
        System.out.println("ID Federación: " + entrenador.getIdFederacion());

    }

}
