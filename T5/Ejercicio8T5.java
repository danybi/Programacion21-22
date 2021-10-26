import java.util.Scanner;

/*Muestra la tabla de multiplicar de un número introducido por teclado.
*/
public class Ejercicio8T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número del cual quieras ver su tabla de multiplicar: ");
        int num = Integer.parseInt(s.nextLine());
        int cont = 0;
        for (int i = 0; i <= 9; i++) {
            System.out.println(num + " x " + cont + " || " + num * cont);
            cont++;
        }
    }
}