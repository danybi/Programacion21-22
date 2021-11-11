import java.util.Scanner;

/*Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.*/
public class Ejercicio25T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int numeroIntroducido = Integer.parseInt(s.nextLine());
        int numero = numeroIntroducido;
        int volteado = 0;
        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        } // while
        System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volteado);
    }
}