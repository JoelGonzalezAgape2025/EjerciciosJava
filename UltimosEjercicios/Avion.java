package UltimosEjercicios;

public class Avion extends Vehiculo{

    private int alas;
    private int propulsores;

    public Avion(String marca, String modelo, int anio, int alas, int propulsores) {
        super(marca, modelo, anio);
        this.alas = alas;
        this.propulsores = propulsores;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getPropulsores() {
        return propulsores;
    }

    public void setPropulsores(int propulsores) {
        this.propulsores = propulsores;
    }

    @Override
    public void endecerVehiculo() {
        System.out.println("El avion " + getMarca() + " " + getModelo() + " se ha encendido.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de alas: " + alas);
        System.out.println("Numero de propulsores: " + propulsores);
    
    }




}
