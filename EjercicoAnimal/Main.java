package EjercicoAnimal;

public class Main {

    public static void main(String[] args) {

        Animal perro = new Animal("Perro", "Carnivoro", "4 patas");
        Animal gato = new Animal("Gato", "Carnivoro", "4 patas");

        System.out.println("Nombre del animal: " + perro.getNombre());
        System.out.println("Orden del animal: " + perro.getOrden());
        System.out.println("Extrmimidades del animal : " + perro.getExtremidades());

         System.out.println("Nombre del animal: " + gato.getNombre());
        System.out.println("Orden del animal: " + gato.getOrden());
        System.out.println("Extrmimidades del animal : " + gato.getExtremidades());


    }

}
