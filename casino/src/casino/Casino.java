package casino;

import java.util.Scanner;
import casino.*;

/**
 *
 * @author Michael Daniel Murillo López
 */
public class Casino extends datos{

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int valor, NApuesta;
        int acumulador1 = 0, ganancias = 0, perdidas = 0;

        //repetir juego hasta que sea = o mayor al 500% o visceversa  
       do {
            // valor a apostar        
            do {
                System.out.println("ingrese valor a apostar:");
                valor = tec.nextInt();
            } while (valor < 10000 || valor > 600000);

            // ingresar numero objetivo       
            do {
                System.out.println("ingrese numero a apostar:");
                NApuesta = tec.nextInt();
            } while (NApuesta > 6 || NApuesta <1);

            //mostrar
            logica lg = new logica();
            lg.AoF_Mostar(NApuesta, valor);
//                 if (contpos > contneg){
//               
//           }
            acumulador1 += lg.acumulador();
            System.out.println("acumulador = "+ acumulador1);
       } while (acumulador1 < valor*5);

        System.out.println("fin del juego");
    }

}
