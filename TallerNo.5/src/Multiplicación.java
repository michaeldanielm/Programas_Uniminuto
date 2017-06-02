
public class Multiplicación {

    private Fracción F1;
    private Fracción F2;

    public Multiplicación() {
        F1 = new Fracción();
        F2 = new Fracción();
    }

    public Fracción getF1() {
        return F1;
    }

    public void setF1(Fracción F1) {
        this.F1 = F1;
    }

    public Fracción getF2() {
        return F2;
    }

    public void setF2(Fracción F2) {
        this.F2 = F2;
    }

    public Fracción Multiplicar() {
        Fracción R=new Fracción();
        R.setNum(F1.getNum()*F2.getNum());
        R.setDen(F1.getDen()*F2.getDen());
        return R;
    }
}
