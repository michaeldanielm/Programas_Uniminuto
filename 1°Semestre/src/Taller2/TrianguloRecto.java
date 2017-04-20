package Taller2;


public class TrianguloRecto {

    private int AltoTR;

    public TrianguloRecto(int n) {
        AltoTR = n;
    }

    public void Imprimir() {
        System.out.println("-------------Triangulo Recto----------\n");
        int h = 0, a = 0, m = 1;
        for (h = 0; h < AltoTR; h++) {
            for (a = 0; a < m; a++) {
                System.out.print("*");
            }
            m++;
            System.out.println();
        }
    }
}
