import java.util.Scanner;

/*Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.*/
public class Ejercicio23T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out
                .println("Introduce números sin que su suma supere a 10000, cuando esto pase el programa terminara: ");
        boolean continua = true;
        int suma = 0;
        int cont = 0;
        while (suma <= 10000) {
            int num = Integer.parseInt(s.nextLine());
            suma += num;
            cont++;
        }
        System.out.println("El total acumulado es: " + suma + " La cantidad de números introducidos es " + cont
                + " y la media " + (suma / cont));
    }
}