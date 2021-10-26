import java.util.Scanner;

/*Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).*/
public class Ejercicio9T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numdig = 1;
        System.out.print("Introduce un número y te dire cuantos dígitos tiene: ");
        long numintro = Long.parseLong(s.nextLine());
        while (numintro > 10) {
            numintro /= 10;
            numdig++;
        }
        System.out.println("Tu número tiene " + numdig + " dígitos");
    }
}