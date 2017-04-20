package Metodos_Mat;

public class FunTrigonometricas {

    private FunMatematicas Mat;
    private double Sen;
    private double Cos;
    private double Tan;
    private double eX;
    private double Angulo;
    private int Iter;

    public FunTrigonometricas() {
        Mat = new FunMatematicas();
        Sen=0;
        Cos=0;
        Tan=0;
        eX=0;
        Angulo=0;
        Iter=0;
    }

    public double getSen() {
        return Sen;
    }

    public void setSen(double Sen) {
        this.Sen = Sen;
    }

    public double getCos() {
        return Cos;
    }

    public void setCos(double Cos) {
        this.Cos = Cos;
    }

    public double getTan() {
        return Tan;
    }

    public void setTan(double Tan) {
        this.Tan = Tan;
    }

    public double geteX() {
        return eX;
    }

    public void seteX(double eX) {
        this.eX = eX;
    }

    public double getAngulo() {
        return Angulo;
    }

    public void setAngulo(double Angulo) {
        this.Angulo = Angulo;
    }

    public int getIter() {
        return Iter;
    }

    public void setIter(int Iter) {
        this.Iter = Iter;
    }

    public FunMatematicas getMat() {
        return Mat;
    }

    public void setMat(FunMatematicas Mat) {
        this.Mat = Mat;
    }

    public double Senx() {
        double termino;
        for (int i = 0; i <= Iter; i++) {
            termino = ((Mat.signo(i)) / (Mat.Factorial((2 * i) + 1))) * Mat.Potencia(Mat.radianes(Angulo), 2 * i + 1);
            Sen = Sen + termino;
        }
        return Sen;
    }
    public double Cosx(){
        double termino;
        for (int i = 0; i <= Iter; i++) {
            termino = ((Mat.signo(i)) / (Mat.Factorial(2 * i))) * Mat.Potencia(Mat.radianes(Angulo), 2 * i);
            Cos = Cos + termino;
        }
        return Cos;
    }
    public double Tanx(){
        Tan=Sen/Cos;
        return Tan;
    }

    public double eX() {
        double termino;
        for (int i = 0; i <= Iter; i++) {
            termino = (Mat.Potencia(Angulo, i)) / Mat.Factorial(i);
            eX = eX + termino;
        }
        return eX;
    }
}
