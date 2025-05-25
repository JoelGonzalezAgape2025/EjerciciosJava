package UltimosEjercicios;

public class Sistema {

    public static void main(String[] args){
 
        Personal empleado1 = new Empleado(1, "Manuel", "Gamez", 30, 3000.0, 500.0);
        empleado1.registrar();
        empleado1.calcularSueldo();

        Personal empleado2 = new Empleado(2, "Ana", "Gómez", 28, 3500.0, 700.0);
        empleado2.registrar();
        empleado2.calcularSueldo();

    }

}
