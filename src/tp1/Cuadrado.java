package tp1;

import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número decimal:");
        double n = s.nextDouble();
        double cuadrado = Math.pow(n, 2);
        System.out.println("El cuadrado del número ingresado es: " + cuadrado);
    }
}
