package casino;

import java.util.Scanner;
import casino.logica;

/**
 *
 * @author Michael Daniel Murillo López
 */
public class logica extends datos{

    Scanner tec = new Scanner(System.in);

    public int[] dados(int valor, int NApuesta) {

        // lanzar dados y recojer numeros aleatorios
        int v[] = new int[6];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 6 + 1);

        }
       

        return v;
    }

    // haciertos o fracasos     
    public void AoF_Mostar(int NApuesta, int valor) {

        logica lg = new logica();

        int v[] = lg.dados(valor, NApuesta);
         // comparar resultados de dados y asignarlos a Aciertos o Fracasos       
        for (int i = 0; i < v.length; i++) {
            if (v[i] >= NApuesta) {
                contpos++;
            } else if (v[i] == 1) {
                contneg++;
            }
        }

        // cantidad de exitos
        exitos = contpos - contneg;
        perdida = contneg - contpos;

        // ganancias o perdidas 

        if (contpos > contneg) {
            ganancias = (valor * exitos) - valor;
        } else {
            perdidas = (valor * perdida) - valor;
        }

        // mostrar resultados   
        for (int i = 0; i < v.length; i++) {
            System.out.println("dado " + (i + 1) + " = " + v[i]);
        }
        System.out.println("");

        System.out.println("Aciertos: " + contpos);
        System.out.println("Fracasos: " + contneg);
        if (exitos > perdida) {
            System.out.println("Exitos: " + exitos);
        } else {
            System.out.println("perdidas: " + perdida);
        }
        if (contpos > contneg) {
            System.out.println("ganancias: " + ganancias);
        } else {
            System.out.println("perdidas: " + ganancias);
        }
        
        
        
    }
    public int acumulador(){
        int acumulador= 0; // acumulador de resultados
        if(contpos > contneg){
           acumulador += ganancias; 
        }else{
            acumulador -=perdidas;
        }
//        System.out.println("acumulador = "+ acumulador);
return acumulador ;
    }

}
