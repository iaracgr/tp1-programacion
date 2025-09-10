package tp1;

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        // hipotenusa = √(a^2+b^2), siendo a y b catetos
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer cateto:");
        double cat1 = s.nextDouble();
        System.out.println("Ingrese el valor del segundo cateto:");
        double cat2 = s.nextDouble();
        double sumaCatetosAlCuadrado = Math.pow(cat1, 2) + Math.pow(cat2, 2);
        double hipotenusa =  Math.sqrt(sumaCatetosAlCuadrado);
        System.out.printf("El valor de la hipotenusa es: " + hipotenusa);
    }
}
