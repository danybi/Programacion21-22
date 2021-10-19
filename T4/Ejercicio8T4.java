import java.util.Scanner;

public class Ejercicio8T4 {
    /*
     * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
     * suficiente, bien, notable o sobresaliente).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Calculo de una media a partir de 3 notas \n Introduce tus 3 notas: ");
        double nota1 = Double.parseDouble(s.nextLine());
        double nota2 = Double.parseDouble(s.nextLine());
        double nota3 = Double.parseDouble(s.nextLine());
        double media = (nota1 + nota2 + nota3) / 3;
        if (media < 5) {
            System.out.println(media + " Media insuficiente");
        }
        if (media == 5) {
            System.out.println(media + " Media suficiente");
        }
        if ((media >= 6) && (media <= 7)) {
            System.out.println(media + " Buena media");
        }
        if ((media >= 8) && (media <= 9)) {
            System.out.println(media + " Media notable");
        }
        if (media == 10) {
            System.out.println(media + " Media sobresaliente");
        }
    }
}