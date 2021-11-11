
/*Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.*/
import java.util.Scanner;

public class Ejercicio20T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(
                "Esta programa pinta por pantalla una pirámide hueca con una altura deseada y carácter elegido: ");
        System.out.print("El carácter a pintar: ");
        String c = System.console().readLine();
        boolean posi = false;
        int hi = 0;
        do {
            System.out.print("Altura deseada: ");
            hi = Integer.parseInt(s.nextLine());
            if (hi < 0) {
                System.out.println("Tiene que ser un valor mayor a 0");
            } else {
                posi = true;
            }
        } while (posi == false);
        int hueco = 1;
        int puntos = 1;
        int h = 1;
        int a = 0;
        int espacios = hi - 1;

        for (int i = 0; i < hi; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            if (h == 1) {
                System.out.print(" " + c);
            }
            if (h != 1) {
                System.out.print(c);
                for (a = 0; a < hueco; a++) {
                    System.out.print(" ");
                }
                System.out.print(c);
            }
            hueco += 2;
            puntos += 2;
            h++;
            espacios--;
            System.out.println();
        }
        for (a = 0; a < puntos; a++) {
            System.out.print(c);
        }
    }
}