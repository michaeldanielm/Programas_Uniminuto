/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Nodo {
       private int Dato;
    private Nodo HI;//Hijo Izquierdo
    private Nodo HD;//Hijo Derecho

    public Nodo(int Dato) {
        this.Dato = Dato;
    }
    
    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public Nodo getHI() {
        return HI;
    }

    public void setHI(Nodo HI) {
        this.HI = HI;
    }

    public Nodo getHD() {
        return HD;
    }

    public void setHD(Nodo HD) {
        this.HD = HD;
    
}
}