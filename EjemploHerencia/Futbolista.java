package EjemploHerencia;

public class Futbolista  extends Persona {

    private String dorsal;
    private String demarcacion;

    public Futbolista() {
    }

   
    public Futbolista(int id, String nombre, String apellidos, int edad, String dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println("Jugando partido");
    }

    public void entrenar() {
        System.out.println("Entrenando");
    }


}
