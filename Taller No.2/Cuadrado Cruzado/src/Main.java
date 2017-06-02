import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Escriba la dimension del cuadrado(Solo nuneros impares): ");
        Scanner Teclado = new Scanner(System.in);
        int n = Teclado.nextInt();
        CuadradoCruzado Sol = new CuadradoCruzado(n);
        Sol.Cuadrado(n);
    }
    
}
        
