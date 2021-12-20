/*Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. El array que contiene los
nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
“Australia”}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los países se deben mostrar utilizando el array de países (no se pueden escribir
directamente*/
public class Ejercicio13T7bi {
	public static void main(String [] args) {
		int[][] n= new int[4][10];
		String[] pais = {"España", "Rusia", "Japón","Australia"};
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
