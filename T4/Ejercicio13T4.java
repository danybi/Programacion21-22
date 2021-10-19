import java.util.Scanner;

/*Escribe un programa que ordene tres números enteros introducidos por teclado.*/
public class Ejercicio13T4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int a = Integer.parseInt(s.nextLine());
        System.out.println("Introduce el segundo número: ");
        int b = Integer.parseInt(s.nextLine());
        System.out.println("Introduce el tercer número: ");
        int c = Integer.parseInt(s.nextLine());
        int aux;
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        System.out.println("El orden quedaría tal que " + a + " , " + b + " , " + c);
    }
}