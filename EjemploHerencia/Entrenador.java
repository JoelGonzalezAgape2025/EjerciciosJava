package EjemploHerencia;

public class Entrenador extends Persona {

    private String  idFederacion;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println("Dirigiendo partido");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Dirigiendo entrenamiento");
    }
}
