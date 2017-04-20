
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamaño=0;
        System.out.print("Digite el numero de nombres que desea ordenar: ");
        tamaño=leer.nextInt();
        Vector obj= new Vector(tamaño);
        obj.IniciaElementos();
        obj.AsignaElementos();
        obj.OrdenarAlfa();
        obj.imprimirelemento();
    }
    
}
