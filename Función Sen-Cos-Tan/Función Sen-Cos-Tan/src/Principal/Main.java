package Principal;
import Metodos_Mat.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double grados;int num;
        Scanner leer = new Scanner(System.in);
        FunTrigonometricas F = new FunTrigonometricas();
        System.out.print("Digite los grados ->");grados=leer.nextDouble();
        System.out.print("Digite el numero de iteraciones -> ");num=leer.nextInt();
        F.setAngulo(grados);
        F.setIter(num);
        try{
            System.out.println("Sen("+grados+")= "+F.Senx());
        }catch(Exception e){
            System.out.println("Sen NO es posible (División entre cero)");
        }
        try{
            System.out.println("Cos("+grados+")= "+F.Cosx());
        }catch(Exception e){
            System.out.println("Cos NO es posible (División entre cero)");
        }
        try{
            System.out.println("Tan("+grados+")= "+F.Tanx());
        }catch(Exception e){
            System.out.println("Tan NO es posible (División entre cero)");
        }    
        System.out.println("Secuencia eX("+grados+")= "+F.eX());
    }
}
