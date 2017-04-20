package Taller1;


public class Binario {
    private int Bin;
    public Binario(int n){
        Bin=n;
    }
    public void Proceso (){
        System.out.println("----------------Binario---------------");
        int r=0;
        String bin="";
        while(Bin>=1){
            r=Bin%2;
            bin=r+bin;
            Bin=Bin/2;
        }
        System.out.println(bin);
    }
}
