public class Rectangulo {
    private int Largo;
    private int Ancho;
    public Rectangulo(int n,int m){
        Largo=n;
        Ancho=m;
    }
    public void Imprimir(int n,int m){
        int h=0,a=0;
        for(h=0;h<n;h++){
            for(a=0;a<m;a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
