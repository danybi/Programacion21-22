import java.util.Scanner;

/*Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.*/
public class Ejercicio17T6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pez = 0;
        System.out.print("Introduce la altura de una pecera (Mínimo 4): ");
        int h = Integer.parseInt(s.nextLine());
        System.out.print("Introduce la anchura de una pecera (Mínimo 4): ");
        int anch = Integer.parseInt(s.nextLine());
        int pospez = (int) (Math.random() * (h - 2) * (anch - 2));
        for (int i = 0; i < anch; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 2; i < h; i++) {
            System.out.print("*");
            for (int j = 2; j < anch; j++) {
                if (pez == pospez) {
                    System.out.print("&");
                } else {
                    System.out.print(" ");
                }
                pez++;
            }
            System.out.println("*");
        }
        for (int i = 0; i < anch; i++) {
            System.out.print("*");
        }
    }
}