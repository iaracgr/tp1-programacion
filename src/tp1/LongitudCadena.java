package tp1;

import java.util.Scanner;

public class LongitudCadena {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un texto:");
        String texto = s.nextLine();
        int longitud = texto.length();
        System.out.println("La longitud del texto ingresado es: " + longitud);
    }
}
