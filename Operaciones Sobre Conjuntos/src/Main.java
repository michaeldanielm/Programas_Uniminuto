
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamaño = 0;
        String Nombre = "";
        System.out.print("Ingrese Nombre conjunto 1:");
        Nombre = leer.next();
        System.out.print("Ingrese Cantidad De Elementos:");
        tamaño = leer.nextInt();
        Conjunto A = new Conjunto(tamaño);
        A.setNombre(Nombre);
        A.inicalizarElemento();
        A.imprimirElemento();
        A.asignarElementos();
        A.validarElementos();
        A.imprimirElemento();

        System.out.print("Ingrese Nombre conjunto 2:");
        Nombre = leer.next();
        System.out.print("Ingrese Cantidad De Elementos:");
        tamaño = leer.nextInt();
        Conjunto B = new Conjunto(tamaño);
        B.setNombre(Nombre);
        B.inicalizarElemento();
        B.imprimirElemento();
        B.asignarElementos();
        B.validarElementos();
        B.imprimirElemento();
        System.out.println("--------------------------");
        System.out.println("       Operaciones:");
        System.out.println("--------------------------");
        A.imprimirElemento();
        B.imprimirElemento();
        Union UN = new Union();
        UN.setC1(A);
        UN.setC2(B);
        Conjunto R = UN.Unir();
        R.imprimirElemento();
        
        Interseccion INT = new Interseccion();
        INT.setC1(A);
        INT.setC2(B);
        Conjunto S = INT.HallarInterseccion();
        S.imprimirElemento();
        
        Diferencia DIF = new Diferencia();
        DIF.setC1(A);
        DIF.setC2(B);
        Conjunto T = DIF.HallarDiferencia();
        T.imprimirElemento();
        
        Diferencia DIF1 = new Diferencia();
        DIF1.setC1(B);
        DIF1.setC2(A);
        Conjunto T1 = DIF1.HallarDiferencia();
        T1.imprimirElemento();
        
        DiferenciaSimetrica DS = new DiferenciaSimetrica();
        DS.setC1(A);
        DS.setC2(B);
        Conjunto L = DS.HallarDiferenciaSim();
        L.imprimirElemento();
        System.out.println("-----------------------------------------------------------");
        System.out.println("  (*^‿^*) Gracias por utilisar nuestro software (｀◕‿◕´+)");
        System.out.println("-----------------------------------------------------------");
    }

}
