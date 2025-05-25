package UltimosEjercicios;

public class ProbarVehiculo {

    public static void main(String[] args){
        Automovil automovil1 = new Automovil("Toyota", "Corolla", 2020, 4, 2);
        automovil1.mostrarInformacion();
        automovil1.endecerVehiculo();


        Barco barco = new Barco("Yamaha", "242X", 2021, 2, 2, "Lancha");
        barco.mostrarInformacion();
        barco.endecerVehiculo();

        Avion avion = new Avion("Boeing", "747", 2019, 2, 4);
        avion.mostrarInformacion();
        avion.endecerVehiculo();
    }

}
