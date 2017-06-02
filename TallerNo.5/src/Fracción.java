
public class Fracción {

    private int Num;
    private int Den;

    public Fracción() {
        Num = 1;
        Den = 1;

    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public int getDen() {
        return Den;
    }

    public void setDen(int Den) {
        this.Den = Den;
    }
    public void Simplificar(){
        int div=2;
        while(div<=Num&&div<=Den){
            if(Num%div==0&&Den%div==0){
                Num=Num/div;  
                Den=Den/div;
            } else {
                div ++;
            }
        }
    }
    public void imprimirFracción(){
        System.out.println(Num+"/"+Den);
    }
}
