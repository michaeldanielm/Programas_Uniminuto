package Taller1;


public class Fracción {

    private int Numerador;
    private int Denominador;

    public Fracción(int n, int d) {
        Numerador = n;
        Denominador = d;
    }

    public void Operación() {
        System.out.println("----------------Fracción--------------");
        int r = 2;
        if (Numerador % Denominador == 0) {
            Numerador = Numerador / Denominador;
            Denominador = 1;
            System.out.println(Numerador + "/" + Denominador);
        } else {
            while (Numerador % r != 0 && Denominador % r != 0) {
                r++;
            }
            if (Numerador == r || Denominador == r) {
                System.out.println(Numerador + "/" + Denominador);
            } else if (Numerador % r == 0 && Denominador % r == 0) {
                Numerador = Numerador / r;
                Denominador = Denominador / r;
                System.out.println(Numerador + "/" + Denominador);
            } else {
                System.out.println(Numerador + "/" + Denominador);
            }
        }
    }
}
