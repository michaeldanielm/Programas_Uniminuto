public class Fibonacci {
    private int limite;
    
    public Fibonacci(int lim){
        limite=lim;
    }
    
    public void ImprimirSerie(){
        System.out.println("---------------Fibonacci--------------");
        int a=1, b=0, c=0;
        while (c<=limite){
            System.out.println(c);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
