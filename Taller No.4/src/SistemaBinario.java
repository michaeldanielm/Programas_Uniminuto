
public class SistemaBinario {

    private String bin;

    public SistemaBinario() {
        bin = "";
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public int BinarioDecimal() {
        int num = 0, dec = 0, p = 1, tamaño;
        tamaño = bin.length();
        for (int i=tamaño-1; i>=0; i--){
            num=Integer.parseInt(Character.toString(bin.charAt(i)));
            dec=dec+(num*p);
            p=p*2;
        }    
        return dec;
    }
}
