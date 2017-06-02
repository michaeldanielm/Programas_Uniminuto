public class Arbol {

    Nodo Raiz;

    public Arbol() {
        Raiz = null;
    }

    public Nodo getRaiz() {
        return Raiz;
    }

    /*En un Arbol Binario de Busqueda, los elementos mayores se insertan al lado derecho y los menores sl lsdo izquierdo*/
    public void Insertar(int x) {
        if (Raiz == null) {
            Raiz = new Nodo(x);
        } else {
            Nodo ant = null;
            Nodo p = Raiz;
            while (p != null) {
                ant = p;
                if (x > p.getDato()) {
                    p = p.getHD();
                } else if (x < p.getDato()) {
                    p = p.getHI();
                } else {
                    return;
                }
            }
            if (ant.getDato() < x) {
                Nodo aux = new Nodo(x);
                ant.setHD(aux);
            } else {
                Nodo aux = new Nodo(x);
                ant.setHI(aux);
            }
        }
    }

    /*Recorrido InOrden para mostrar los datos de un arbol binario*/
    public void Inorden() {
        Inorden2(Raiz);
    }

    private void Inorden2(Nodo T) {
        if (T == null) {
            return;
        } else {
            if (T.getHI() == null && T.getHD() == null) {
                System.out.print(T.getDato() + " ");
            } else {
                Inorden2(T.getHI());
                System.out.print(T.getDato() + " ");
                Inorden2(T.getHD());
            }
        }
    }
    /* Metodo Iterativo que devuelve true si el DATO X se encuentra en el arbol*/
    public boolean existe(int x) {
        if (Raiz == null) {
            return false;
        } else {
            Nodo p = Raiz;
            while (p != null) {
                if (x > p.getDato()) {
                    p = p.getHD();
                } else if (x < p.getDato()) {
                    p = p.getHI();
                } else {
                    return true;
                }
            }
            return false;
        }
    }
     /* Metodo Recursivo que devuelve true si el DATO X se encuentra en el arbol*/
   public boolean ExisteR(int x) {
        return (ExisteR2(Raiz, x));
    }

    private boolean ExisteR2(Nodo T, int x) {
        if (T == null) {//1er caso base
            return false;
        } else {
            if (T.getHI()==null && T.getHD()==null ){//2do caso base
                if (T.getDato() == x) {
                    return true;
                }
            } else {//caso general
                boolean HI = ExisteR2(T.getHI(), x);
                boolean HD = ExisteR2(T.getHD(), x);
                if (T.getDato() == x) {
                    return true;
                } else {
                    if (HD || HI) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}