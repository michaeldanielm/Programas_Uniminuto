package Taller2;


public class Paralelogramo {

    private int LargoP;
    private int AnchoP;

    public Paralelogramo(int n, int m) {
        LargoP = n;
        AnchoP = m;
    }

    public void Imprimir() {
        System.out.println("-------------Paralelogramo------------\n");
        int h = 0, a = 0, e = 0, c = 0;
        c = LargoP - 1;
        for (h = 0; h < LargoP; h++) {
            for (e = 0; e < c; e++) {
                System.out.print(" ");
            }
            c--;
            for (a = 0; a < AnchoP; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
