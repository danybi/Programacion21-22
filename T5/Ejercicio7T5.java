import java.util.Scanner;

public class Ejercicio7T5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el código de la caja fuerte de 4 cifras y solo tienes 4 oportunidades: ");
        boolean cod = false;
        int opor = 0;
        while (cod == false) {
            System.out.print("Código: ");
            int codi = Integer.parseInt(s.nextLine());
            if (codi == 1234) {
                System.out.println("Código introducido correctamente");
                cod = true;
            } else {
                System.out.println("Código erroneo");
                opor++;
            }
            if (opor == 4) {
                cod = true;
            }
        }
        if ((opor == 4) && (cod == true)) {
            System.out.println("Número de intentos fallidos máximos alcanzado");
        }
    }
}