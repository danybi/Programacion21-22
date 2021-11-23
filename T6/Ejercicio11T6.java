/*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.*/
public class Ejercicio11T6 {
    public static void main(String[] args) {
        int nota = 0;
        int sus = 0;
        int suf = 0;
        int good = 0;
        int not = 0;
        int sob = 0;
        for (int i = 0; i < 20; i++) {
            nota = (int) (Math.random() * 5);
            switch (nota) {
            case 0:
                System.out.print("Suspenso ");
                sus++;
                break;
            case 1:
                System.out.print("Suficiente ");
                suf++;
                break;
            case 2:
                System.out.print("Bien ");
                good++;
                break;
            case 3:
                System.out.print("Notable ");
                not++;
                break;
            case 4:
                System.out.print("Sobresaliente ");
                sob++;
                break;
            }
        }
        System.out.println("");
        System.out.println("Al final tienes:\n" + sus + " suspensos\n" + suf + " suficientes\n" + good + " bien\n" + not
                + " notables\n" + sob + " sobresalientes.");
    }
}