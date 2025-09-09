package tp1;

public class Intercambio {

    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        int c = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = b;
        b = c;
        System.out.println("nuevo valor a = " + a);
        System.out.println("nuevo valor b = " + b);


    }
}
