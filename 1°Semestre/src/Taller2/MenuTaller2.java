/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Taller2;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class MenuTaller2 {
     public void imprimirMenu() {
        Scanner Teclado = new Scanner(System.in);
        int opc = 0;
        System.out.println("-----------------Taller No.2----------------");
        System.out.println("Taller No.2\n\n1. Rectangulo\n2. Triangulo Recto\n3. Paralelogramo\n4. Triangulo Isosceles\n5. Rombo\n6. Cuadrado Cruzado\n7. Volver\n");
        System.out.println("¿Cual figura desea dibujar?");
        opc = Teclado.nextInt();
        switch (opc) {
            case 1:
                int LargoR = 0;
                int AnchoR = 0;
                System.out.println("Ingrese el alto de la figura");
                LargoR = Teclado.nextInt();
                System.out.println("Ingrese el ancho de la figura");
                AnchoR = Teclado.nextInt();
                Rectangulo rec = new Rectangulo(LargoR, AnchoR);
                rec.Imprimir();
                break;
            case 2:
                int AltoTR = 0;
                System.out.println("Ingrese el alto de la figura: ");
                AltoTR = Teclado.nextInt();
                TrianguloRecto trian = new TrianguloRecto(AltoTR);
                trian.Imprimir();
                break;
            case 3:
                int LargoP = 0;
                int AnchoP = 0;
                System.out.println("Ingrese el largo de la figura:");
                LargoP = Teclado.nextInt();
                System.out.println("Ingrese el ancho de la figura:");
                AnchoP = Teclado.nextInt();
                Paralelogramo Ejem = new Paralelogramo(LargoP, AnchoP);
                Ejem.Imprimir();
                break;
            case 4:
                int Altura = 0;
                System.out.println("Ingrese la altura de la figura:");
                Altura = Teclado.nextInt();
                Isosceles iso = new Isosceles(Altura);
                iso.Triangulo();
                break;
            case 5:
                int AltoR = 0;
                System.out.println("Ingrese el alto de la figura:");
                AltoR = Teclado.nextInt();
                Rombo rom = new Rombo(AltoR);
                rom.Imprimir();
                break;
            case 6:
                int LimiteC = 0;
                System.out.println("Ingrese la altura de la figura (SOLO NUMEROS IMPARES)");
                LimiteC = Teclado.nextInt();
                CuadradoCruzado ejem = new CuadradoCruzado(LimiteC);
                ejem.Cuadrado();
                break;
            case 7:
                break;
            default:
                System.out.println("-----------------Error----------------");
                System.out.println("Por favor elija una operación correcta");
        }
    }

}
