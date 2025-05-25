package UltimosEjercicios;

public class Barco extends Vehiculo{
    
    private int mastiles;
    private int helices;
    private String tipoBarco;

    public Barco(String marca, String modelo, int anio, int mastiles, int helices, String tipoBarco) {
        super(marca, modelo, anio);
        this.mastiles = mastiles;
        this.helices = helices;
        this.tipoBarco = tipoBarco;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    public int getHelices() {
        return helices;
    }

    public void setHelices(int helices) {
        this.helices = helices;
    }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    @Override
    public void endecerVehiculo() {
        System.out.println("El barco " + getMarca() + " " + getModelo() + " se ha encendido.");
    }

    @Override 
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de mástiles: " + mastiles);
        System.out.println("Número de hélices: " + helices);
    }

}
