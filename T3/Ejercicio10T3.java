public class Ejercicio10T3 {
    /* Realiza un conversor de Mb a Kb. */
    public static void main(String[] args) {
        System.out.println("Conversor de Mb a kb\n Introduce la cantidad de Mb: ");
        int Mb = Integer.parseInt(System.console().readLine());
        int kb = Mb * 1024;
        System.out.println("La cantidad en kb es " + kb + "Kb");
    }
}