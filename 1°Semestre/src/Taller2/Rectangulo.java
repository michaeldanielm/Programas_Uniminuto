package Taller2;

public class Rectangulo {
    private int LargoR;
    private int AnchoR;
    public Rectangulo(int n,int m){
        LargoR=n;
        AnchoR=m;
    }
    public void Imprimir(){
        System.out.println("---------------Rectangulo-------------\n");
        int h=0,a=0;
        for(h=0;h<LargoR;h++){
            for(a=0;a<AnchoR;a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
