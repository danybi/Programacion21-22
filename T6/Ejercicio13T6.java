/*Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor*/
public class Ejercicio13T6 {
    public static void main(String[] args) {
        // El programa tira dos dados y no para hasta que los dos tengar el mismo valor
        // de manera aleatoria.
        int d1 = 0;
        int d2 = 0;
        do {
            d1 = (int) (Math.random() * 6) + 1;
            d2 = (int) (Math.random() * 6) + 1;
            System.out.println("Dado 1: " + d1 + " | Dado 2: " + d2 + "\n");
        } while (d1 != d2);
    }
}