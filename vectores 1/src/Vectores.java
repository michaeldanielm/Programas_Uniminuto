
import java.util.Scanner;

public class Vectores {

    private int [] V;

    public Vectores(int tamaño) {
        V = new int[tamaño];
    }

    public void inicalizarelemento() {
        for (int i = 0; i < V.length; i++) {
            V[i] = 0;
        }
    }

    public void asignarElemento() {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < V.length; i++) {
            System.out.print("Valor " + i + ":");
            V[i] = leer.nextInt();
        }
    }

    public void imprimirelemento() {
        for (int i = 0; i < V.length; i++) {
            System.out.print(V[i] + ",");
        }
        System.out.println();
    }

    public void contarpares() {
        int cont = 0;
        for (int i = 0; i < V.length; i++) {
            if (V[i] % 2 == 0) {
                cont++;
            }
        }
        System.out.println("cantidad de pares\n" + cont);
    }

    public void OrdenarBurbuja() {
        int i, j, aux;
        for (i = 0; i < V.length ; i++) {
            for (j = i+1; j < V.length ; j++) {
                if (V[i] > V[j]) {
                    aux=V[i];
                    V[i]=V[j];        
                    V[j] = aux;
                }
            }
        }
        System.out.println("Vector ordenado");
    }

    public void ContarPrimos() {
        int cont = 0;
        for (int i = 0; i < V.length; i++) {
            if (V[i] != 1) {
                int div = 2;
                while (V[i] % div != 0 && div <= V[i]) {
                    div++;
                }
                if (div == V[i]) {
                    cont++;
                }
            } else {
                cont++;
            }
        }
        System.out.println("cantidad de primos\n" + cont);
    }
    public void Promedio (){
        double prom=0, Total=0;
        for (int i = 0; i < V.length; i++){
            prom=prom+V[i];
        }
        Total=prom/V.length;
        System.out.println("El promedio de los valores de la clase es: "+Total);
    }
}
