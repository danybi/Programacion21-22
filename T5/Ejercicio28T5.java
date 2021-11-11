import java.util.Scanner;

/*Escribe un programa que calcule el factorial de un número entero leído por
teclado.
*/
public class Ejercicio28T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número del cual quieras su factorial: ");
        int factor = Integer.parseInt(s.nextLine());
        int fact = factor;
        if (factor == 0) {
            System.out.println("El factorial es 0");
        }
        for (int i = 1; i < factor; i++) {
            fact *= i;
        }
        System.out.println("El factorial de " + factor + "! = " + fact);
    }
}