package tp1;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número decimal: ");
        double n = s.nextDouble();
        System.out.println("Ingrese el exponente: ");
        double e = s.nextDouble();
        double potencia = Math.pow(n, e);
        System.out.printf("La potencia de " + n + " con exponente "+ e + " es: " + potencia);
    }
}
