package Metodos_Mat;

public class FunMatematicas {

    private double PI;

    public FunMatematicas() {
        PI = 3.141592654;
    }

    public double Factorial(double num) {
        double f = 1;
        for (double i = 2; i <= num; i++) {
            f = f * i;
        }
        return f;
    }

    public double Potencia(double base, int expo) {
        double num = base;
        for (int i = 1; i < expo; i++) {
            num = num * base;
        }
        return num;
    }

    public double signo(int num) {
        if (num % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public double radianes(double grados) {
        double rad = (grados * PI) / 180;
        return rad;
    }
}
