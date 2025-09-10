package tp1;

import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal para calcular la raíz cuadrada: ");
        double num = s.nextDouble();
        double raiz = Math.sqrt(num);
        System.out.println("El valor de su raíz es: " + raiz);
    }
}
