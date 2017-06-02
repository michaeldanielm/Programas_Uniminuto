
public class Primo {

    private int primo;

    public Primo(int a) {
        primo = a;
    }

    public void Operación() {
        System.out.println("-----------------Primo----------------");
        int b = 2;
        while (primo % b != 0) {
            b++;
        }
        if (b == primo) {
            System.out.println("Este numero es primo");
        } else {
            System.out.println("Este numero NO es primo");
        }
    }
}
