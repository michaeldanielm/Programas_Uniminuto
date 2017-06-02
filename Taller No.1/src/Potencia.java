
public class Potencia {
    private int Base;
    private int Exponente;
    public Potencia(int a, int p){
        Base=a;
        Exponente=p;
    }
    public void Operación (){
        System.out.println("----------------Potencia--------------");
        int r=0;
        r=Base;
        while(Exponente>1){
            r=Base*r;
            Exponente--;
        }
        System.out.println("El resultado es "+r);
    }
}
