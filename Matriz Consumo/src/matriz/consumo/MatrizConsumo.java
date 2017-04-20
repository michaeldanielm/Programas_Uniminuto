/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz.consumo;

import java.util.*;

/**
 *
 * @author Administrador
 */
public class MatrizConsumo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ran = new Random();
        int s, suma = 0, c, p;
        int[][] matriz = new int[30][24];
        int[] consumo = new int[30];
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 24; j++) {
                do {
                    s = ran.nextInt(200);
                } while (s < 100);
                matriz[i][j] = s;
            }
        }
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 24; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 24; j++) {
                suma += matriz[i][j];
            }
            consumo[i] = suma;
            suma = 0;
        }
        c = consumo[0];
        for (int t = 1; t < consumo.length; t++) {
            if (consumo[t] > c) {
                c = consumo[t];
            }
        }
        for( int d=0; d< consumo.length; d++){
            if (consumo[d]==c){
                System.out.println("El dia de mayor consumo es: "+(d+1)+" Con un total de: "+c);
            }
        }
        p=matriz[0][0];
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 24; j++) {
                if( matriz [i][j]>p){
                    p=matriz[i][j];
                }
            }
        }
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 24; j++) {
                if (matriz [i][j]==p){
                    System.out.println("El dia de mayor consumo es: "+(i+1)+" En la hora: "+(j+1)+" Con un total de: "+p);
                }
            }
        }
      {

    Scanner linea = new Scanner(System.in);
    int n, digito, digito1, repetir;
    System.out.print("Introduce un número entero: ");
    n = linea.nextInt();
    repetir = 0;
    digito1 = 0;
    do {
        digito = n % 10;
        if (digito > digito1) {

            digito1 = digito;
            repetir = 1;
        } else {

            if (digito == digito1) {
                repetir++;
            }
        }
        n = n / 10;

    } while (n != 0);

    System.out.println("El numero " + digito1 + " se repite " + repetir + " veces");
    }
}}
