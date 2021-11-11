import java.util.Scanner;

/*Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto*/
public class Ejercicio6T6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numadiv = (int) (Math.random() * 100 + 1);
        System.out.println("Tienes 5 intentos para adivinar el número aleatorio entre 0 y 100 (Ambos incluidos)");
        boolean repite = true;
        int intentos = 5;
        int ans = 0;
        while (repite) {
            System.out.print("Introduce el número que crees que es: ");
            ans = Integer.parseInt(s.nextLine());
            if (ans == numadiv) {
                repite = false;
                System.out.println("¡Lo lograste crack.!");
            } else {
                System.out.println("Fallaste, vuelve a intentarlo");
                if (numadiv < ans) {
                    System.out.print("El número a adivinar es menor al de tu respuesta. ");
                }
                if (numadiv > ans) {
                    System.out.print("El número a adivinar es mayor al de tu respuesta. ");
                }
                intentos--;
            }
            if (intentos == 0) {
                repite = false;
            }
        }
    }
}