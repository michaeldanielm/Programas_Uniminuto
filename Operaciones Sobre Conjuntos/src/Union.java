
public class Union {

    private Conjunto C1;
    private Conjunto C2;

    public Union() {
        C1 = new Conjunto(1);
        C2 = new Conjunto(1);
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

    public Conjunto Unir() {
        int tam = C1.getElementos().length + C2.getElementos().length;
        for (int i = 0; i < C1.getElementos().length; i++) {
            for (int j = 0; j < C2.getElementos().length; j++) {
                if (C1.getElementos()[i].compareTo(C2.getElementos()[j]) == 0) {
                    tam--;
                }
            }
        }
        Conjunto C1UC2 = new Conjunto(tam);
        C1UC2.setNombre(C1.getNombre() + "U" + C2.getNombre());
        C1UC2.inicalizarElemento();
        int k = 0;
        for (int i = 0; i < C1.getElementos().length; i++) {
            C1UC2.getElementos()[k] = C1.getElementos()[i];
            k++;
        }
        boolean valor = true;
        for (int i = 0; i < C2.getElementos().length; i++) {
            for (int j = 0; j < C1.getElementos().length; j++) {
                if (C2.getElementos()[i].compareTo(C1.getElementos()[j]) == 0) {
                    valor = false;
                    j = C1.getElementos().length;
                }
            }
            if (valor) {
                C1UC2.getElementos()[k] = C2.getElementos()[i];
                k++;
            } else {
                valor = true;
            }
        }
        return C1UC2;
    }
}
