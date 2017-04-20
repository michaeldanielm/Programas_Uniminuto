


import Taller1.MenuTaller1;
import Taller2.MenuTaller2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc = 0;
        while (opc != 3) {
            System.out.println("-----------------1° Semestre----------------");
            System.out.println("Primer Semestre\n\n1. Taller 1\n2. Taller 2\n3. Salir\n");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    MenuTaller1 M1 = new MenuTaller1();
                    M1.imprimirMenu();
                    break;
                case 2:
                    MenuTaller2 M2 = new MenuTaller2();
                    M2.imprimirMenu();
                    break;
                case 3:
                    System.out.println("--------------------------------------");
                    System.out.println("Gracias por usar nuestro software :D");
                    System.out.println("--------------------------------------");
                    System.exit(0);
                default:
                    System.out.println("Por favor elija un valor entre 1 y 3.");
            }
        }
    }
}
