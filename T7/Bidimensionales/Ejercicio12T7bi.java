/*Realiza un programa que muestre por pantalla un array de 9 filas por 9
columnas relleno con números aleatorios entre 500 y 900. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.*/
public class Ejercicio12T7bi {
    public static void main(String[] args) {
        int[][] n= new int[9][9];
        int max=0;
        int min=900;
        int[] diagonal=new int[9];
        int columna=0;
        int suma=0;
        for(int i=0;i<9;i++) {
        	for(int j=0;j<9;j++) {
        		n[i][j]=(int)(Math.random()*401)+500;
        		System.out.printf("%4d", n[i][j] );
        	}
        	System.out.println("");
        }
        System.out.println("");
        System.out.println("Los números contenidos en la diagonal de la matriz son:\n ");
       
        for(int i=8;i>=0;i--) {
        	diagonal[i]=n[i][columna];
        	if(diagonal[i]>max) {
        		max=diagonal[i];
        	}
        	if(diagonal[i]<min) {
        		min=diagonal[i];
        	}
        	System.out.printf("%4d",diagonal[i]);
        	columna++;
        	suma+=diagonal[i];
        }
        System.out.println("\n\nEl maximo de la diagonal es "+max);
        System.out.println("El minimo de la diagonal es "+min);
        System.out.println("La media total de la diagonal es "+suma/9);
    }
}