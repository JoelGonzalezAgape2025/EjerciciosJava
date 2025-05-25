package UltimosEjercicios;

public class Sistema {

    public static void main(String[] args){

        Empleado empleado1 = new Empleado(1, "Juan", "Pérez", 30, 3000.0, 500.0);
        empleado1.registrar();
        empleado1.calcularSueldo();

        Empleado empleado2 = new Empleado(2, "Ana", "Gómez", 28, 3500.0, 700.0);
        empleado2.registrar();
        empleado2.calcularSueldo();

        // Puedes agregar más empleados y realizar otras operaciones según sea necesario

        
    }

}
