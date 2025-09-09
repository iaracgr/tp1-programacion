package tp1;

import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = s.next();
        System.out.println("Hola " + nombre);
    }
}
