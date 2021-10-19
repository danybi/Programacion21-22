/*Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%. */
public class Ejercicio12T3 {
    public static void main(String[] args) {
        System.out.print("Dime la primera nota que obtuviste: ");
        double primera = Double.parseDouble(System.console().readLine());
        System.out.print("Dime la media que deseas: ");
        double deseada = Double.parseDouble(System.console().readLine());
        float nesecita = ((deseada * 100) - (primera * 40) / 60);
        System.out.println("Nesecitas obtener un: " + nesecita + " en el siguiente examen");
    }
}