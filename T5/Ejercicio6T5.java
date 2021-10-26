
/*Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
un bucle do-while.
*/
import java.util.Scanner;

public class Ejercicio6T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Números del 320 al 160 de 20 en 20: ");
        int num = 320;
        int i = 0;
        do {
            System.out.print(num + " | ");
            num -= 20;
            i++;
        } while (i < 9);
    }
}