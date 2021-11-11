/*
* Daniel Bittan Graells
Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*/
public class Ejercicio3T6 {
    public static void main(String[] args) {
        String palo = "";
        String carta = "";

        int numeropalo = (int) (Math.random() * 4) + 1;

        switch (numeropalo) {
        case 1:
            palo = "oros";
            break;
        case 2:
            palo = "copas";
            break;
        case 3:
            palo = "bastos";
            break;
        case 4:
            palo = "espadas";
        default:
        }
        int numerocarta = (int) (Math.random() * 10) + 1;
        switch (numerocarta) {
        case 1:
            carta = "as";
            break;
        case 8:
            carta = "sota";
            break;
        case 9:
            carta = "caballo";
            break;
        case 10:
            carta = "rey";
            break;
        default:
            carta = String.valueOf(numerocarta);
        }
        System.out.println(carta + " de " + palo);
    }
}
