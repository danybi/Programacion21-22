
/*Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s2*/
import java.util.Scanner;

public class Ejercicio6T4 {
    final static Double g = 9.81;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Realiza el calculo del tiempo con la formula(t =√2h/g)");
        System.out.println("Introduce la altura: ");
        Double h = Double.parseDouble(s.nextLine());
        Double t = Math.sqrt(2 * h / g);
        System.out.printf("Tarda %.2f segs en caer", t);
    }
}