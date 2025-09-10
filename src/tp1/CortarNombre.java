package tp1;

import java.util.Scanner;

public class CortarNombre {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellido separados por un espacio por favor:");

        String nombreCompleto = s.nextLine();

        int posicion = nombreCompleto.indexOf(' ');

        String nombre = nombreCompleto.substring(0, posicion);
        String apellido = nombreCompleto.substring(posicion + 1);

        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su apellido es: " + apellido);

    }
}
