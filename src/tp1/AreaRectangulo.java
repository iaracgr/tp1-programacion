package tp1;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo:");
        int base = s.nextInt();
        System.out.println("Ingrese la altura del rectángulo:");
        int altura = s.nextInt();
        int area = base * altura;
        System.out.println("El área del rectángulo es: "+ area);

    }
}
