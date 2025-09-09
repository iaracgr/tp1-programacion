package tp1;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int x = s.nextInt();
        System.out.println("Ingrese otro numero:");
        int y = s.nextInt();
        int suma = x + y;
        System.out.println("La suma de " + x + " y " + y + " es: " + suma);

    }
}
