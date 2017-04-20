
public class DiferenciaSimetrica {
    
    private Conjunto C1;
    private Conjunto C2;
    
    public DiferenciaSimetrica(){
        
    }

    public Conjunto getC1() {
        return C1;
    }

    public void setC1(Conjunto C1) {
        this.C1 = C1;
    }

    public Conjunto getC2() {
        return C2;
    }

    public void setC2(Conjunto C2) {
        this.C2 = C2;
    }
    
    public Conjunto HallarDiferenciaSim(){
        Diferencia DIF = new Diferencia();
        DIF.setC1(C1);
        DIF.setC2(C2);
        Conjunto T = DIF.HallarDiferencia();
        Diferencia DIF1 = new Diferencia();
        DIF1.setC1(C2);
        DIF1.setC2(C1);
        Conjunto M = DIF1.HallarDiferencia();
        Union UN = new Union();
        UN.setC1(T);
        UN.setC2(M);
        Conjunto R = UN.Unir();
        R.setNombre(C1.getNombre()+"Δ"+C2.getNombre());
        return R;
    }
}
