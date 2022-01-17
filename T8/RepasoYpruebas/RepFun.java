import java.util.Scanner;
import Array.Unidimensional;
import Array.Bidimensional;
public class RepFun {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        System.out.println("Escriba dos entero");
        int num = Integer.parseInt(s.nextLine());
        int num2 = Integer.parseInt(s.nextLine());
        int[] x= new int [num];
        int[][] y=new int [num][num2];
        System.out.println("El doble de el número introducido es: " + doble(num));
        System.out.println("Unidimensional: ");
        x=Array.Unidimensional.GenArr(num, 1, 10);
        System.out.println("\nBidimensional:\n");
        y=Array.Bidimensional.genArrBi(num, num2, 1, 10);
        System.out.println("Fila: ");
        Array.Bidimensional.filArr(y, 0);
        System.out.println("\nColumna: ");
        Array.Bidimensional.colArr(y, 0);
        System.out.println("\nCoordenada de x numero: ");
        Array.Bidimensional.coordArr(y, 8);
        System.out.println("");
        Array.Bidimensional.puntodesilla(y, 4,4);
        System.out.println("\n"+Array.Unidimensional.mostrarmin(x));
        System.out.println(Array.Unidimensional.mostrarmax(x));
        System.out.println(Array.Unidimensional.mediaArr(x));
        if(Array.Unidimensional.estaenarr(x, 7)==true) {
        	System.out.println("Esta en el Array");
        }else {
        	System.out.println("No esta en el Array");
        }
        if(Array.Unidimensional.posArr(x, 7)==-1) {
        	System.out.println("No esta en el Array");
        }else {
        	System.out.println(Array.Unidimensional.posArr(x, 7));
        }
        Array.Unidimensional.Arrvolteado(x);
        System.out.println(Array.Unidimensional.rotaArrIzq(x, 4));
        System.out.println(Array.Unidimensional.rotaArrDer(x, 4));
       
    }

    public static int doble(int x) {
        x = (x * 2);
        return x;
    }
    
}