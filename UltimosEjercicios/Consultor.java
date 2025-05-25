package UltimosEjercicios;

public class Consultor implements IProfesion {

    private String nombre;
    private String apellido;
    private double sueldoBase;
    private double bonificacion;


    public Consultor(String nombre, String apellido, double sueldoBase, double bonificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

   @Override
   public double calcularSueldo() {
       double sueldoTotal = sueldoBase + bonificacion; 
       return sueldoTotal;
    }

  

 



}
