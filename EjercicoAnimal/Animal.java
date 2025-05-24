package EjercicoAnimal;

public class Animal {

    public String nombre;
    public String orden;
    public String extremidades;

    public Animal() {
    }

    public Animal(String nombre, String orden, String extremidades) {
        this.nombre = nombre;
        this.orden = orden;
        this.extremidades = extremidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(String extremidades) {
        this.extremidades = extremidades;
    }


}
