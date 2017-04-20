package Taller2;


public class Rombo {

    private int AltoR;

    public Rombo(int n) {
        AltoR = n;
    }

    public void Imprimir() {
        System.out.println("-----------------Rombo----------------\n");
        int h = 0, a = 0, m = 1, e = 0, c = 0;
        c = AltoR - 1;
        for (h = 0; h < AltoR; h++) {
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
        for (h = 0; h < AltoR - 1; h++) {
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
