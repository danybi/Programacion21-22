import java.util.Scanner;

/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */
public class Ejercicio11T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int numintro = Integer.parseInt(System.console().readLine());
        for (int i = numintro; i < numintro + 5; i++) {
            System.out.printf("%4d,%6d,%8d\n", i, i * i, i * i * i);
        }
    }
}