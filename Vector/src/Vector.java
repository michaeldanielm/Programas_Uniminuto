
import java.util.Scanner;

public class Vector {

    private String V[];

    public Vector(int tamaño) {
        V = new String[tamaño];
    }

    public void IniciaElementos() {
        for (int i = 0; i < V.length; i++) {
            V[i] = "Vacio";
        }
    }

    public void AsignaElementos() {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < V.length; i++) {
            System.out.print("Nombre " + i + " : ");
            V[i] = leer.next();
        }
    }

    public void OrdenarAlfa() {
        String aux;
        int i, j;
        for (i = 0; i < V.length; i++) {
            for (j = i + 1; j < V.length; j++) {
                if (V[i].compareTo(V[j]) > 0) {
                    aux = V[i];
                    V[i] = V[j];
                    V[j] = aux;
                }
            }
        }
        System.out.println("Nombres Alfabeticamente:");
    }

    public void imprimirelemento() {
        for (int i = 0; i < V.length; i++) {
            System.out.println(V[i]);
        }
    }
}
