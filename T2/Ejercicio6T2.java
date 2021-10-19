public class Ejercicio6T2 {
    public static void main(String[] args) {
        double baseimp = 15.06;

        System.out.printf("Base imponible %8.2f\n", baseimp);
        System.out.printf("Iva            %8.2f\n", (baseimp * 0.21));
        System.out.printf("-----------------------\n");
        System.out.printf("Total          %8.2f\n", (baseimp * 1.21));

    }
}
