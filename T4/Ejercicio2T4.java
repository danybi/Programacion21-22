public class Ejercicio2T4 {
    /*
     * Realiza un programa que pida una hora por teclado y que muestre luego buenos
     * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos
     * de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta
     * las horas, los minutos no se deben introducir por teclado.
     */
    public static void main(String[] args) {
        System.out.print("Introduce una hora del día entre 0 y 23: ");
        int hora = Integer.parseInt(System.console().readLine());
        if ((hora >= 6) && (hora <= 12)) {
            System.out.println("Güenos días");
        }
        if ((hora >= 13) && (hora <= 20)) {
            System.out.println("Güenas tardes");
        }
        if ((hora >= 21) && (hora < 24) || (hora >= 0) && (hora <= 5)) {
            System.out.println("Güenas noche");
        }
        if ((hora >= 24) && (hora < 0)) {
            System.out.println("Hora introducida incorrecta");
        }
    }
}