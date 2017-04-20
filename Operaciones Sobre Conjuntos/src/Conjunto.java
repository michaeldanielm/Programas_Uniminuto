
import java.util.Scanner;

public class Conjunto {

    private String Nombre;
    private String Elementos[];

    public Conjunto(int tamaño) {
        Nombre = "C1";
        Elementos = new String[tamaño];
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String[] getElementos() {
        return Elementos;
    }

    public void setElementos(String[] Elementos) {
        this.Elementos = Elementos;
    }

    public void inicalizarElemento() {
        for (int i = 0; i < Elementos.length; i++) {
            Elementos[i] = "_";
        }
    }

    public void imprimirElemento() {
        System.out.print(Nombre + "={");
        for (int i = 0; i < Elementos.length; i++) {
            System.out.print(Elementos[i] + ",");
        }
        System.out.println("}");
    }

    public void asignarElementos() {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < Elementos.length; i++) {
            System.out.print("valor" + i + ":");
            Elementos[i] = leer.next();
            if (validarElementos()) {
                i--;
                System.out.println("No se permiten valores repetidos.\nPor favor ingrese un valor diferente.");
            }
        }
    }

    public boolean validarElementos() {
        boolean valor = false;
        for (int i = 0; i < Elementos.length; i++) {
            for (int j = i + 1; j < Elementos.length; j++) {
                if (Elementos[i].compareTo(Elementos[j]) == 0 && Elementos[i] != "_") {
                    valor = true;
                    j = i = Elementos.length;
                }
            }
        }
        return valor;
    }
}
