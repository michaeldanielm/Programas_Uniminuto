import java.util.Scanner;

class MatCaracol
{
    public static void main(String []args)
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Este programa le pide al usuario el tamaño de una matriz cuadrada e imprime los numeros naturales en forma de caracol");
        int a = 0;
        int columna1 = 0;
        int compara = 0, compara1 = 0,compara2 = 1;
        do
        {
            System.out.println("\nIngrese un numero para el tamaño de la matriz mayor a 2");
            a = leer.nextInt();
            if(a < 2)
            {
                System.out.println("Dato no válido, "+a+" no es positivo");
            }
        }while(a < 2);
        int fila = a, columna = a;
        int [][] mat = new int [a][a];
        
        columna1 = fila * columna;
        compara1 = fila - 1;
        
        while (compara2 <= columna1) 
        {
            for (int f = compara; f <= compara1; f++) 
            {
                mat[compara][f] = compara2;
                compara2 = compara2 + 1;
            }
            for (int f = compara + 1; f <= compara1; f++) 
            {
                mat[f][compara1] = compara2;
                compara2 = compara2 + 1;
            }
            for (int f = compara1 - 1;f >= compara; f--) 
            {
                mat[compara1][f] = compara2;
                compara2 = compara2 + 1;
            }
            for (int f = compara1 - 1 ; f >= compara + 1; f--) 
            {
                mat[f][compara] = compara2;
                compara2 = compara2+1;
            }
            compara = compara + 1;
            compara1 = compara1 - 1;
        }
        
        System.out.println("La matriz de tamaño "+a+" es:");
        for (int f = 0; f < fila; f++) 
        {
            for (int c = 0; c < columna; c++) 
            {
                System.out.print("[" + mat[f][c] + "]");
            }
            System.out.println();
        }
    }
}