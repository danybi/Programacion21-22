import java.util.Scanner;

public class Ejercicio11T4 {
    /*
     * Escribe un programa que dada una hora determinada (horas y minutos), calcule
     * los segundos que faltan para llegar a la medianoche.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(
                "Este programa recibira una hora con minutos y te dira cuantos segundos faltan para la medianoche \nIntroduce una hora que vaya entre 1-23: ");
        int hora = Integer.parseInt(s.nextLine());
        System.out.print("Introduce los minutos: ");
        int minutos = Integer.parseInt(s.nextLine());
        int cambio = (hora * 3600) + (minutos * 60);
        int falta = (24 * 3600) - cambio;
        if ((hora < 0) || (hora > 23)) {
            System.out.println("No existe esa hora");
        }
        if (hora == 0) {
            System.out.println("Ya es de medianoche");
        }
        System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %02d segundos", hora, minutos, falta);
    }
}