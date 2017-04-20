
public class Diferencia {

    private Conjunto C1;
    private Conjunto C2;

    public Diferencia() {

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

    public Conjunto HallarDiferencia() {
        int tam = 0;
        for (int i = 0; i < C1.getElementos().length; i++) {
            int S = 0;
            for (int j = 0; j < C2.getElementos().length; j++) {
                if (C1.getElementos()[i].compareTo(C2.getElementos()[j]) == 0) {
                    S++;
                }
            }
            if (S==0) {
                tam++;
            }
        }
        Conjunto C1DC2 = new Conjunto(tam);
        C1DC2.setNombre(C1.getNombre() + "/" + C2.getNombre());
        C1DC2.inicalizarElemento();
        int K=0;
        for (int i = 0; i < C1.getElementos().length; i++) {
            int S = 0;
            for (int j = 0; j < C2.getElementos().length; j++) {
                if (C1.getElementos()[i].compareTo(C2.getElementos()[j]) == 0) {
                    S++;
                }
            }
            if (S==0) {
                C1DC2.getElementos()[K]=C1.getElementos()[i];
                K++;
            }
        }
        return C1DC2;
    }
}
