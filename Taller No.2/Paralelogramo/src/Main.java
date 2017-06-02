import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Escriba el largo del paralelogramo: ");
        int n = Teclado.nextInt();
        System.out.println("Escriba el ancho del paralelogramo: ");
        int m = Teclado.nextInt();
        Paralelogramo Sol = new Paralelogramo(n,m);
        Sol.Imprimir(n, m);
    }
    
}
