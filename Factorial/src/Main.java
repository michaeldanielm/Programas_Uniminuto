import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Main {

   
    public static double factorial(double numero) {
        if (numero == 0) {
            return 1;
        } else {
            double resultat = numero * factorial(numero - 1);
            return resultat;
        }
    }

    public static void main(String[] args) {

        System.out.println("Introdusca un número:");
        try (Scanner scan = new Scanner(System.in)) {
            int num = scan.nextInt();
            
            System.out.println(factorial(num));
        }
    }

}
