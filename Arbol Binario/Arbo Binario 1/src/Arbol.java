/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Arbol {

    private NodoArbol raiz;

    //contruir un arbol vacio
    public Arbol()
    {
        raiz = null;
    }

    //insertar un nuevo nodo en el arbol de busqueda binaria
    public synchronized void insertarNodo(int valorInsertar)
    {
        if(raiz == null)
        raiz = new NodoArbol(valorInsertar); //crea nodo raiz

        else
        raiz.insertar(valorInsertar); // llama al metodo insertar
    }
    
    

    
}
