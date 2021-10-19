import java.util.Scanner;

public class Ejercicio7T4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Calculo de una media a partir de 3 notas \n Introduce tus 3 notas: ");
        double nota1 = Double.parseDouble(s.nextLine());
        double nota2 = Double.parseDouble(s.nextLine());
        double nota3 = Double.parseDouble(s.nextLine());
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("La media es %.2f", media);
    }
}