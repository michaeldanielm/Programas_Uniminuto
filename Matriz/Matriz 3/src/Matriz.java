import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Este programa crea una matriz que va de derecha → a abajo ↓ ");
        System.out.print("Y luego hacia la izquierda ← y luego sube ↑ ");
        System.out.print("Dimesión De La Matriz: ");
        int n = in.nextInt();
        mostrarMatriz(generarMatrizCaracol(n, 1), n, n);
    }

    public static int[][] generarMatrizCaracol(int n, int x) {
        int[][] M = new int[n + 1][n + 1];
        for (int a = 1; a <= n / 2; a++) {
            for (int i = a; i <= n - a; i++) {
                M[a][i] = x;
                x++;
            }
            for (int i = a; i <= n - a; i++) {
                M[i][n - a + 1] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[n - a + 1][i] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[i][a] = x;
                x++;
            }
        }
        if (n % 2 == 1) {
            M[n / 2 + 1][n / 2 + 1] = x;
        }
        return M;
    }

    /**
     * Muestra Una Matriz Cualquiera Por Consola A Partir De La Fila 1 y Columna 1
     * @ M matriz a mostrar
     * @ f numero de filas de la matriz
     * @ c numero de columnas de la matriz
     */
    public static void mostrarMatriz(int[][] M, int f, int c) {
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("\t" + M[i][j]);
            }
            System.out.println();
        }
    }
}




////crear un programa que lea la cantidad de filas y columnas positivas 
// posterio debe calcular los numeros naturales desde el uno y guardalos 
//en el orde definido por el usuario