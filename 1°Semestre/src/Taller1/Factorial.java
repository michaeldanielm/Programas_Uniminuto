package Taller1;


public class Factorial {

    private long Valor;

    public Factorial(long a) {
        Valor = a;
    }
    
    public void Factor(){
        System.out.println("---------------Factorial--------------");
        long b=0;
        b=Valor;
        Valor=Valor-1;
        while(Valor>1){
            b=Valor*b;
            Valor--;
        }
        System.out.println(b);
    }

}
