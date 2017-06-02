/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Diseñe un programa que calcule e imprima cuántos nodos tiene un árbol binario.

public class Main {
    
    public static void main(String args[])
{
    Arbol arbol = new Arbol();
    int valor;

    System.out.println( "Mostrando los Nodos almacenados en el arbol binario con  los siguientes valores: ");

    //Muestra los nodos 
    for (int i = 1; i<=10 ; i++)
    {
        valor = (int) (Math.random() * 100);
        System.out.print(valor + " ");
        arbol.insertarNodo(valor);
    }
 }

}
