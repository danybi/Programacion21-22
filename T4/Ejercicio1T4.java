public class Ejercicio1T4 {
    public static void main(String[] args) {
        System.out.print("Dime un día de la semana y te digo que toca a primera hora: ");
        String dia = System.console().readLine();
        String clase = "";
        switch (dia) {
            case "lunes":
                clase = "LM";
                break;
            case "martes":
                clase = "BBDD";
                break;
            case "miercoles":
                clase = "Programación";
                break;
            case "jueves":
                clase = "Sistemas informáticos";
                break;
            case "viernes":
                clase = "HLC";
                break;
            default:
                System.out.println("Ese día no existe o no tienes clases");
        }
        System.out.println("Ha primera hora tienes: " + clase);
    }
}