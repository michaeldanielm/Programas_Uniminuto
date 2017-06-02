
public class Paralelogramo {

    private int Largo;
    private int Ancho;

    public Paralelogramo(int n, int m) {
        Largo = n;
        Ancho = 0;
    }

    public void Imprimir(int n, int m) {
        int h = 0, a = 0, e = 0, c = 0;
        c = n - 1;
        for (h = 0; h < n; h++) {
            for (e = 0; e < c; e++) {
                System.out.print(" ");
            }
            c--;
            for (a = 0; a < m; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
