package tp1;

import java.util.Scanner;

public class AreaDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo:");
        double base = s.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = s.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectángulo es: "+ area);

    }
}
