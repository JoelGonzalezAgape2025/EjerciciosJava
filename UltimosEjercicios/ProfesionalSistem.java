package UltimosEjercicios;

public class ProfesionalSistem {

    public static void main(String[] args) {

        Consultor consultor = new Consultor("Juan", "Pérez", 3000, 500);
        System.out.println("El sueldo total del consultor " + consultor.getNombre() + " " + consultor.getApellido()+ " es: " + consultor.calcularSueldo());
    }

}
