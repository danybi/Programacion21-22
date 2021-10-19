public class Ejercicio3T4 {
    /*
     * Escribe un programa en que dado un número del 1 a 7 escriba el
     * correspondiente nombre del día de la semana
     */
    public static void main(String[] args) {
        System.out.print(
                "Dime un número entre el 1 y el 7 los dos incluidos y te digo que día de la semana corresponde: ");
        int dianum = Integer.parseInt(System.console().readLine());
        String dia = "";
        switch (dianum) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "dia incorrecto";
        }
        System.out.println(dia);
    }
}