
package reloj;
import java.util.*;
/**
 *
 * @author Michael Daniel Murillo López 
 */
public class Reloj {
    

    
    public static void main(String[] args) throws InterruptedException {
     Scanner reloj = new Scanner(System.in);
        int horas ;
        int minutos ;
        int segundos =0;
       System.out.println("introdusca hora: ");
       horas = reloj.nextInt();
       System.out.println("introdusca minutos: ");
       minutos = reloj.nextInt();
       System.out.println("introdusca segundos: ");
       segundos=reloj.nextInt();
        
        while( true){
          Thread.sleep(1000);
          segundos = segundos +1;
          
          if ( segundos >59){
          segundos =0;    
              minutos = minutos +1;          
          }
          if ( minutos >59){
              minutos =0;
              horas = horas +1;              
          }
          if (horas >23){
              horas=0;
          }
          
          System.out.println(horas+":"+minutos+":"+segundos);
         
       }
       
    }
    
}
