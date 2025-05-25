package EjemploHerencia;

public class Masajista extends Persona {

    private String titulacion;
    private String aniosExperiencia;

    public Masajista() {
    }

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, String aniosExperiencia ) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(String aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void daarMasajes() {
        System.out.println("Dando masajes");
    }

}
