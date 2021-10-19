import java.util.Scanner;

/*Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.*/
public class Ejercicio17T4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dame un número: ");
        int a = Integer.parseInt(s.nextLine());
        System.out.println("La ultima cifra del número es: " + a % 10);
    }
}