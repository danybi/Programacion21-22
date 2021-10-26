import java.util.Scanner;

/*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while
*/
public class Ejercicio3T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mul = 5;
        int i = 0;
        System.out.print("Multiplos de 5: ");
        do {
            System.out.print(mul + " ");
            mul += 5;
            i++;
        } while (i < 20);
    }
}