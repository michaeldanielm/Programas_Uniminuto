import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Escriba la altura del triangulo: ");
        int n = Teclado.nextInt();
        TrianguloRecto Sol = new TrianguloRecto(n);
        Sol.Imprimir(n);
    }
    
}
