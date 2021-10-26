import java.util.Scanner;

/*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
*/
public class Ejercicio1T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mul = 5;
        System.out.print("Este programa muestra todos los números multiplos de 5 desde 0 a 100: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(mul + " ");
            mul += 5;
        }
    }
}