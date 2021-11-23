import java.util.Scanner;

/*Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.*/
public class Ejercicio16T6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Máquina tragaperras.
        System.out.print("Presione enter para realizar una tirada: ");
        s.nextLine();
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        for (int i = 0; i < 3; i++) {
            v = (int) (Math.random() * 5);
            switch (v) {
            case 0:
                System.out.print("Corazón ");
                break;
            case 1:
                System.out.print("Diamante ");
                break;
            case 2:
                System.out.print("Herradura ");
                break;
            case 3:
                System.out.print("Campana ");
                break;
            case 4:
                System.out.print("Limón ");
                break;
            default:
            }
            switch (i) {
            case 0:
                v1 = v;
                break;
            case 1:
                v2 = v;
                break;
            case 2:
                v3 = v;
                break;
            default:
            }
        }
        if ((v1 != v2) && (v2 != v3) && (v1 != v3)) {
            System.out.println("\nLo siento, ha perdido.");
        } else if ((v1 == v2) && (v2 == v3)) {
            System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
        } else {
            System.out.println("\nBien, ha recuperado su moneda.");
        }
    }
}