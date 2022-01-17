/*
* Daniel Bittan Graells
*/
package Array;

public class Bidimensional {
    /*
     * Funcion que generara un array bidimensional a traves de los datos
     * introducidos. Parametro y sera el numero de filas. Parametro x sera el numero
     * de columnas. Parametro min sera el numero minimo que se generara dentro del
     * array. Parametro max sera el numero maximo que se generara dentro del array.
     */
    public static int[][] genArrBi(int n, int m, int min, int max) {
        int[][] x = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x[i][j] = (int) (Math.random() * (max - min) + min + 1);
                System.out.printf("%4d", x[i][j]);
            }
            System.out.println("");
        }
        return x;
    }

    /*
     * Devuelve una de las filas del array
     * 
     * Parametro fila sera el numero de fila que quiero que me devuelva Parametro x
     * sera el array bidimensional
     */
    public static int[] filArr(int[][] x, int fila) {
        int[] f = new int[x[0].length];
        for (int c = 0; c < x[0].length; c++) {
            f[c] = x[fila][c];
            System.out.printf("%2d ", f[c]);
        }        
        return f;
    }

    /*
     * Devuelve una columna del array
     * 
     * x sera el array bidimensional columna sera la columna que queremos extraer
     * del array
     */
    public static int[] colArr(int[][] x, int columna) {
        int[] c = new int[x.length];

        for (int f = 0; f < x.length; f++) {
            c[f] = x[f][columna];
            System.out.printf("%2d ", c[f]);
        }
        return c;
    }

    /*
     * Muestra las coordenadas del numero especificado dentro del array
     * bidimensional.
     * 
     * x sera el arraybidimensional n sera el numero del que queremos saber sus
     * coordenadas
     */
    public static int[] coordArr(int[][] x, int n) {
        for (int f = 0; f < x.length; f++) {
            for (int c = 0; c < x[0].length; c++) {
                if (x[f][c] == n) {
                	System.out.println("Esta en la fila: " +f+" y en la columna: "+c);
                }
            }
        }
        int[] coordenadas = { -1, -1 };
        return coordenadas;
    }

    /*
     * Indica si el numero es el minimo o el maximo de su fila
     * 
     * x sera el array bidimensional i sera la fila elegida j sera la columna
     * elegida
     */
    public static boolean puntodesilla(int[][] x, int i, int j) {
        int[] fila = filArr(x, i);
        int[] columna = colArr(x, j);
        return ((Array.Unidimensional.mostrarmin(fila) == x[i][j])
                && (Array.Unidimensional.mostrarmax(columna) == x[i][j]));
    }

    public static int[] diagonal(int[][] x, int fila, int columna, String direccion) {
        int elementos = 0, i, j;
        int[] diagonalAux = new int[1000];
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[0].length; j++) {
                if ((((columna - j) == (fila - i)) && (direccion.equals("nose")))
                        || (((columna - j) == (i - fila)) && (direccion.equals("neso")))) {
                    diagonalAux[elementos++] = x[i][j];
                }
            }
        }
        int[] diagonal = new int[elementos];
        for (j = 0; j < elementos; j++) {
            diagonal[j] = diagonalAux[j];
        }
        return diagonal;
    }
}