import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Escriba el largo del rectangulo: ");
        int n = Teclado.nextInt();
        System.out.println("Escriba el ancho del rectangulo: ");
        int m = Teclado.nextInt();
        Rectangulo Sol = new Rectangulo(n,m);
        Sol.Imprimir(n,m);
    }
    
}
