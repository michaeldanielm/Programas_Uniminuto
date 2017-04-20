package Taller2;


public class CuadradoCruzado {

    private int LimiteC;

    public CuadradoCruzado(int n) {
        LimiteC = n;

    }

    public void Cuadrado() {
        System.out.println("------------Cuadrado Cruzado----------\n");
        int h = 0, a = 0, m = 0, p = 0, i = 0, l = 0, r = 0;
        for (h = 0; h < LimiteC; h++) {
            System.out.print("*");
            if (h == 0 || h == LimiteC - 1) {
                m = LimiteC - 3;
                for (a = 0; a < m; a++) {
                    System.out.print("*");
                }
                System.out.print("*");
            } else {
                if (h == 1) {
                    p = LimiteC - 4;
                }
                if (h < (LimiteC + 1) / 2) {
                    for (i = 0; i < l; i++) {
                        System.out.print(" ");
                    }
                    l++;
                    System.out.print("*");
                    for (i = 0; i < p; i++) {
                        System.out.print(" ");
                    }
                    if (h == (LimiteC - 1) / 2) {

                    } else {
                        p = p - 2;
                        System.out.print("*");
                    }
                    for (i = 0; i < r; i++) {
                        System.out.print(" ");
                    }
                    r++;
                } else {
                    if (h <= (LimiteC + 1) / 2) {
                        p = p + 4;
                    }
                    for (i = 2; i < l; i++) {
                        System.out.print(" ");
                    }
                    l--;
                    System.out.print("*");
                    for (i = 2; i < p; i++) {
                        System.out.print(" ");
                    }
                    p = p + 2;
                    System.out.print("*");
                    for (i = 2; i < r; i++) {
                        System.out.print(" ");
                    }
                    r--;
                }

            }
            System.out.println("*");
        }
    }
}
