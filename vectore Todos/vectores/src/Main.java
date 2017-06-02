
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int tamaño=0;
        System.out.println("Ingrese Tamaño:");
        tamaño=leer.nextInt();
        Vectores vec=new Vectores(tamaño);
        vec.inicalizarelemento();
        vec.asignarElemento();
        vec.imprimirelemento();
        vec.contarpares();
        vec.ContarPrimos();
        vec.OrdenarBurbuja();
        vec.imprimirelemento();
        vec.Promedio();
    }
    
}
