/*Realiza un programa que calcule la estatura media, m�nima y m�xima en
cent�metros de personas de diferentes pa�ses. El array que contiene los
nombres de los paises es el siguiente: pais = {�Espa�a�, �Rusia�, �Jap�n�,
�Australia�}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con n�meros aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los pa�ses se deben mostrar utilizando el array de pa�ses (no se pueden escribir
directamente*/
public class Ejercicio13T7bi {
	public static void main(String [] args) {
		int[][] n= new int[4][10];
		String[] pais = {"Espa�a", "Rusia", "Jap�n","Australia"};
        int max=140;
        int min=210;
        int suma=0;
        for(int i=0;i<4;i++) {
        	System.out.printf("%10s |",pais[i]);
        	for(int j=0;j<10;j++) {
        		n[i][j]=(int)(Math.random()*71)+140;
        		System.out.printf("%4d", n[i][j] );
        		if(n[i][j]>max) {
            		max=n[i][j];
            	}
            	if(n[i][j]<min) {
            		min=n[i][j];
            	}
            	suma+=n[i][j];
        	}
        	System.out.println("");
        }
        System.out.println("\nLa altura maxima entre los diferentes paises es de "+max);
        System.out.println("La altura minima entre los diferentes paises es de "+min);
        System.out.println("La altura media es "+suma/40);
	}
}
