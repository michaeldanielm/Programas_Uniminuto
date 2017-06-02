
public class Isosceles {
    private int Limite;
    public Isosceles(int n){
        Limite=n;
    }
    public void Triangulo(int n){
        int h=0,a=0,m=1,e=0,c=0;
        c=n-1;
        for(h=0;h<n;h++){
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
