
public class TrianguloRecto {

    private int Alto;

    public TrianguloRecto(int n) {
        Alto = n;
    }

    public void Imprimir(int n) {
        int h = 0, a = 0, m = 1;
        for (h = 0; h < n; h++) {
            for (a = 0; a < m; a++) {
                System.out.print("*");
            }
            m++;
            System.out.println();
        }
    }
}
