package Taller2;


public class Isosceles {
    private int Altura;
    public Isosceles(int n){
        Altura=n;
    }
    public void Triangulo(){
        System.out.println("----------Triangulo isosceles---------\n");
        int h=0,a=0,m=1,e=0,c=0;
        c=Altura-1;
        for(h=0;h<Altura;h++){
            for(e=0;e<c;e++){
                System.out.print(" ");
            }
            c--;
            for(a=0;a<m;a++){
                System.out.print("*");
            }
            m=m+2;
            System.out.println();
        }
    }
}
