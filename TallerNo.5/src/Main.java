import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num=0,den=0;
        // Primer Objeto Fracción
        System.out.println("Numerador y Denominador F1: ");
        num=leer.nextInt();
        den=leer.nextInt();
        Fracción F1= new Fracción();
        F1.setNum(num);
        F1.setDen(den);
        F1.imprimirFracción();
        F1.Simplificar();
        System.out.println("Simplificación");
        F1.imprimirFracción();
        //Segundo Objeto Fracción
        System.out.println("Numerador y Denominador F2: ");
        num=leer.nextInt();
        den=leer.nextInt();
        Fracción F2= new Fracción();
        F2.setNum(num);
        F2.setDen(den);
        F2.imprimirFracción();
        F2.Simplificar();
        System.out.println("Simplificación");
        F2.imprimirFracción();
        // Multiplicación de las dos fraccciones
        Multiplicación MT = new Multiplicación();
        MT.setF1(F1);
        MT.setF2(F2);
        Fracción R=MT.Multiplicar();
        System.out.println("Multiplicación");
        R.imprimirFracción();
        // Suma de las fracciones
        // Resta de las fracciones
        // División de las fracciones
    }
    
}
