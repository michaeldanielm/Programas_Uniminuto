/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class MenuTaller1 {

    public void imprimirMenu() {
        Scanner Teclado = new Scanner(System.in);
        int opc = 0;
        System.out.println("-----------------Taller No.1----------------");
        System.out.println("Taller No.1\n\n1. Fibonacci\n2. Factorial\n3. Binaria\n4. Fraccion\n5. Primo\n6. Potencia\n7. Volver\n");
        System.out.println("¿Cual operación desea realizar?");
        opc = Teclado.nextInt();
        switch (opc) {
            case 1:
                int lim = 0;
                System.out.print("Ingrese Limite:");
                lim = Teclado.nextInt();
                Fibonacci fibo = new Fibonacci(lim);
                fibo.ImprimirSerie();
                break;
            case 2:
                int Valor = 0;
                System.out.println("Ingrese el valor: ");
                Valor = Teclado.nextInt();
                Factorial Fact = new Factorial(Valor);
                Fact.Factor();
                break;
            case 3:
                int Bin = 0;
                System.out.println("Ingrese un valor");
                Bin = Teclado.nextInt();
                Binario Ejem = new Binario(Bin);
                Ejem.Proceso();
                break;
            case 4:
                int Numerador = 0;
                int Denominador = 0;
                System.out.println("Ingrese numerador");
                Numerador = Teclado.nextInt();
                System.out.println("Ingrese denominador");
                Denominador = Teclado.nextInt();
                Fracción Frac = new Fracción(Numerador, Denominador);
                Frac.Operación();
                break;
            case 5:
                int primo = 0;
                System.out.println("Ingrese un valor");
                primo = Teclado.nextInt();
                Primo prim = new Primo(primo);
                prim.Operación();
                break;
            case 6:
                int Base = 0;
                int Exponente = 0;
                System.out.println("Ingrese la base");
                Base = Teclado.nextInt();
                System.out.println("Ingrese el exponente");
                Exponente = Teclado.nextInt();
                Potencia Pot = new Potencia(Base, Exponente);
                Pot.Operación();
                break;
            case 7:
                break;
            default:
                System.out.println("-----------------Error----------------");
                System.out.println("Por favor elija una operación correcta");
        }

    }
}
