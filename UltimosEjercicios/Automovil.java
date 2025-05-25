package UltimosEjercicios;

public class Automovil  extends Vehiculo {

    private int numPuertas;
    private int numEscapes;

    public Automovil(String marca, String modelo, int anio, int numPuertas, int numEscapes) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
        this.numEscapes = numEscapes;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumEscapes() {
        return numEscapes;
    }

    public void setNumEscapes(int numEscapes) {
        this.numEscapes = numEscapes;
    }


    @Override
    public void endecerVehiculo() {
        System.out.println("El automovil " + getMarca() + " " + getModelo() + " se ha encendido.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println("Numero de escapes traseros: " + numEscapes);
    }

}
