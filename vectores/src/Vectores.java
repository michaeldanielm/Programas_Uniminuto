
import java.util.Scanner;

public class Vectores {

    private int[] V;

    public Vectores(int tamaño) {
        V = new int[tamaño];
    }

    public void inicalizarelemento() {
        for (int i = 0; i <V.length;i++) {
            V[i]=0;
        }
    }
    public void asignarElemento(){
        Scanner leer=new  Scanner(System.in);
        for( int i=0;i<V.length;i++){
            System.out.print("Valor "+i+":");
           V[i]=leer.nextInt();        }
    }
    public void imprimirelemento (){
        for (int i=0;i<V.length;i++){
            System.out.print(V[i]+",");
        }
        System.out.println();
    }
    public void contarpares(){
        int cont=0;
        for(int i=0;i<V.length;i++){
            if(V[i]%2==0){
                cont++;
            }
            System.out.println("cantidades pares " + cont);
        }
    }
}
