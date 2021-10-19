public class Ejercicio4T4 {
    /*
     * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
     * las horas extras. Escribe un programa que calcule el salario semanal de un
     * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
     * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
     * euros la hora.
     */
    public static void main(String[] args) {
        System.out.print(
                "Introduce la cantidad de horas trabajadas y te dire cuanto ganas(A partir de las 40 horas se 16€ y antes se gana 12€): ");
        int horas = Integer.parseInt(System.console().readLine());
        int sueldo = 0;
        if ((horas > 0) && (horas <= 40)) {
            sueldo = horas * 12;
        }
        if (horas > 40) {
            sueldo = 480 + ((horas - 40) * 16);
        }
        if (horas <= 0) {
            System.out.println("No has trabajado nada");
        }
        System.out.println("Le corresponde un salario de: " + sueldo + "€");
    }
}