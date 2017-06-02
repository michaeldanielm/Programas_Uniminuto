public class SistemaOctal {
    
    private String oct;
    
    public SistemaOctal(){
        oct="";
    } 

    public String getOct() {
        return oct;
    }

    public void setOct(String oct) {
        this.oct = oct;
    }
    
    public int OctalDecimal() {
        int num = 0, dec = 0, p = 1, tamaño;
        tamaño = oct.length();
        for (int i=tamaño-1; i>=0; i--){
            num=Integer.parseInt(Character.toString(oct.charAt(i)));
            dec=dec+(num*p);
            p=p*8;
        }    
        return dec;
    }
}
