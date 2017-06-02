
public class SistemaHexa {

    private String hexa;

    public SistemaHexa() {
        hexa = "";
    }

    public String getHexa() {
        return hexa;
    }

    public void setHexa(String hexa) {
        this.hexa = hexa;
    }

    public int HexaDecimal() {
        int num = 0, dec = 0, p = 1, tamaño;
        String hex="";
        tamaño = hexa.length();
        for (int i=tamaño-1; i>=0; i--){
            hex=Character.toString(hexa.charAt(i));
            switch (hex){
                case "A":
                    num=10;
                    break;
                case "B":
                    num=11;
                    break;
                case "C":
                    num=12;
                    break;
                case "D":
                    num=13;
                    break;
                case "E":
                    num=14;
                    break;
                case "F":
                    num=15;
                    break;
                default:
                    num=Integer.parseInt(Character.toString(hexa.charAt(i)));
                    break;
            }
            dec=dec+(num*p);
            p=p*16;
        }    
        return dec;
    }

}
