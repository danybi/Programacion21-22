import java.util.Scanner;

public class Ejercicio9T4 {
    /*
     * Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2
     * + bx + c = 0).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Resolución de una ecuación de segundo grado \nIntroduce el valor de a: ");
        double a = Double.parseDouble(s.nextLine());
        System.out.print("Introduce el valor de b: ");
        double b = Double.parseDouble(s.nextLine());
        System.out.print("Introduce el valor de c: ");
        double c = Double.parseDouble(s.nextLine());
        if ((a == 0) && (b == 0) && (c == 0)) {
            System.out.println("La ecuación tiene infinitas soluciones.");
        }
        if ((a == 0) && (b == 0) && (c != 0)) {
            System.out.println("La ecuación no tiene solución.");
        }
        if ((a != 0) && (b != 0) && (c == 0)) {
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-b / a));
        }
        if ((a == 0) && (b != 0) && (c != 0)) {
            System.out.println("x1 = x2 = " + (-c / b));
        }
        if ((a != 0) && (b != 0) && (c != 0)) {
            double contenido = b * b - (4 * a * c);
            if (contenido < 0) {
                System.out.println("La ecuación no tiene soluciones reales");
            } else {
                System.out.println("x1 = " + (-b + Math.sqrt(contenido)) / (2 * a));
                System.out.println("x2 = " + (-b - Math.sqrt(contenido)) / (2 * a));
            }
        }
    }
}