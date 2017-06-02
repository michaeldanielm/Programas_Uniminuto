/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class NodoArbol {
    
    //miembros de acceso
    NodoArbol nodoizquierdo;
    int datos;
    NodoArbol nododerecho;

    //iniciar dato y hacer de este nodo un nodo hoja
    public NodoArbol(int datosNodo)
    {
        datos = datosNodo;
        nodoizquierdo = nododerecho = null; //el nodo no tiene hijos
    }

    //buscar punto de insercion  e insertar nodo nuevo
    public synchronized void insertar(int valorInsertar)
    {
    //insertar en subarbol izquierdo
    if (valorInsertar < datos){

        //inserta nuevo nodoarbol
        if (nodoizquierdo == null)
        nodoizquierdo = new NodoArbol(valorInsertar);
        
        else //continua recorriendo subarbol izquierdo
        nodoizquierdo.insertar(valorInsertar);
        }

        //insertar nodo derecho
        else if(valorInsertar > datos){

            //insertar nuevo nodoarbol
            if (nododerecho == null)
            nododerecho = new NodoArbol(valorInsertar);
            
            else //continua recorriendo subarbol derecho
            nododerecho.insertar(valorInsertar);
        }
    } //fin del metodo insertar
}
