import java.util.Scanner;
public class programa
{
    public static void main(String[] args)
    {
        Scanner leer=new Scanner(System.in);
        int lim, fila=0, columna;
        System.out.println("Este programa lee un número entero positivo, crea una matriz con esa cantidad de filas y columnas. \nPosteriormente guarda los números enteros positivos desde las posiciones exteriores de la matriz \nhasta las posiciones interiores.");
        System.out.print("\nDigite la cantidad de filas y columnas que desea: ");
        lim=leer.nextInt();
        if(lim>1)
        {
            int mat[][]=new int[lim][lim];
            int num=1,derecha=0,abajo=1,izquierda=lim-2,arriba=lim-2,limIz=0,limArr=1,limAb=lim;
            while(num<=(lim*lim))
            {
                for(columna=derecha;columna<lim-derecha;columna++)
                {
                    mat[fila][columna]=num;
                    num++;
                }
                columna--;
                for(fila=abajo;fila<limAb;fila++)
                {
                    mat[fila][columna]=num;
                    num++;
                }
                fila--;
                for(columna=izquierda;columna>=limIz;columna--)
                {
                    mat[fila][columna]=num;
                    num++;
                }
                columna++;
                for(fila=arriba;fila>=limArr;fila--)
                {
                    mat[fila][columna]=num;
                    num++;
                }
                fila++;
                derecha++;
                abajo++;
                izquierda--;
                arriba--;
                limIz++;
                limArr++;
                limAb--;
            }
            System.out.println("Matriz:");
            for(int i=0;i<lim;i++)
            {
                for(int j=0;j<lim;j++)
                {
                    System.out.print("["+mat[i][j]+"]");
                }
                System.out.println(" ");
            }
        }
        else
        {
            System.out.println("\nEl valor ingresado no es válido.");
        }
    }
}