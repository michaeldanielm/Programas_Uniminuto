
public class Factorial {

    private int Valor;

    public Factorial(int a) {
        Valor = a;
    }
    
    public void Factor(){
        System.out.println("---------------Factorial--------------");
        int b=0,n=0;
        b=Valor-1;
        while(Valor>=1){
            n=Valor*b;
            Valor--;
            b=n;
        }
        System.out.println(n);
    }

}
