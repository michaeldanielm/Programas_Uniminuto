import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Escriba la altura del rombo: ");
        int n = Teclado.nextInt();
        Rombo Sol = new Rombo(n);
        Sol.Imprimir(n);
    }
    
}
