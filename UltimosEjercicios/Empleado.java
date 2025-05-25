package UltimosEjercicios;

public class Empleado extends Personal {

    private double salarioBase;
    private double bonificaciones;

    public Empleado(int id, String nombre, String apellido, int edad, double salarioBase, double bonificaciones) {
        super(id, nombre, apellido, edad);
        this.salarioBase = salarioBase;
        this.bonificaciones = bonificaciones;
    }


    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(double Bonificaciones) {
        this.bonificaciones = Bonificaciones;
    }

    @Override
    public void registrar() {
        System.out.println("Empleado " + getNombre() + " con ID " + getId() + " ha sido registrado en el sistema.");
  
    }

    @Override
    public void calcularSueldo(){
        double sueldoTotal = salarioBase + bonificaciones; 
         System.out.println("El sueldo total de " + getNombre() + " es: " + sueldoTotal);
    }

    

}
