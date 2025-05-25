package UltimosEjercicios;

public class Empleado extends Personal {

    private double salarioBase;
    private double bonificacionesMes;

    public Empleado(int id, String nombre, String apellido, int edad, double salarioBase, double bonificacionesMes) {
        super(id, nombre, apellido, edad);
        this.salarioBase = salarioBase;
        this.bonificacionesMes = bonificacionesMes;
    }


    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonificaciones() {
        return bonificacionesMes;
    }

    public void setBonificaciones(double BonificacionesMes) {
        this.bonificacionesMes = BonificacionesMes;
    }

    @Override
    public void registrar() {
        System.out.println("Empleado " + getNombre() + " con ID " + getId() + " ha sido registrado en el sistema.");
  
    }

    @Override
    public void calcularSueldo(){
        double sueldoTotal = salarioBase + bonificacionesMes; 
         System.out.println("El sueldo total de " + getNombre() + " es: " + sueldoTotal);
    }

    

}
