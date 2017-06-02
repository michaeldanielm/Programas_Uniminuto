
public class Rombo {

    private int Alto;

    public Rombo(int n) {
        Alto = n;
    }

    public void Imprimir(int n) {
        int h = 0, a = 0, m = 1, e = 0, c = 0;
        c = n - 1;
        for (h = 0; h < n; h++) {
            for (e = 0; e < c; e++) {
                System.out.print(" ");
            }
            c--;
            for (a = 0; a < m; a++) {
                System.out.print("*");
            }
            m = m + 2;
            System.out.println();
        }
        m = m - 4;
        for (h = 0; h < n - 1; h++) {
            for (e = 0; e > c; e--) {
                System.out.print(" ");
            }
            c--;
            for (a = 0; a < m; a++) {
                System.out.print("*");
            }
            m = m - 2;
            System.out.println();
        }
    }
}
