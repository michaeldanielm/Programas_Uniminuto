
public class Interseccion {

    private Conjunto C1;
    private Conjunto C2;

    public Interseccion() {

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

    public Conjunto HallarInterseccion() {
        int tam = 0;
        for (int i = 0; i < C1.getElementos().length; i++) {
            for (int j = 0; j < C2.getElementos().length; j++) {
                if (C1.getElementos()[i].compareTo(C2.getElementos()[j]) == 0) {
                    tam++;
                }
            }
        }
        Conjunto C1nC2 = new Conjunto(tam);
        C1nC2.setNombre(C1.getNombre() + "n" + C2.getNombre());
        C1nC2.inicalizarElemento();
        int k=0;
        for (int i = 0; i < C1.getElementos().length; i++) {
            for (int j = 0; j < C2.getElementos().length; j++) {
                if (C1.getElementos()[i].compareTo(C2.getElementos()[j]) == 0) {
                    C1nC2.getElementos()[k]=C1.getElementos()[i];
                    k++;
                }
            }
        }
        return C1nC2;
    }
}
