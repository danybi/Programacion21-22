import java.util.Scanner;

/*Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo*/
public class Ejercicio10T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean nega = false;
        float num = 0;
        int cant = 0;
        float suma = 0;
        System.out.print(
                "Introduce la cantidad de números positivos que quieras y te calculare la media de estos(Para terminar introduce un número negativo): ");
        while (nega == false) {
            num = Float.parseFloat(s.nextLine());
            if (num < 0) {
                nega = true;
            } else {
                cant++;
                suma += num;
            }
        }
        float media = suma / cant;
        if (cant == 0) {
            System.out.println("No hay con que hacer la media");
        } else {
            System.out.println("La media final es: " + media);
        }
    }
}