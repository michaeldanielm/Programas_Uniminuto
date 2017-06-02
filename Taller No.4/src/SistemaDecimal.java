
public class SistemaDecimal {

    private int dec;

    public SistemaDecimal() {
        dec = 0;
    }

    public int getDec() {
        return dec;
    }

    public void setDec(int dec) {
        this.dec = dec;
    }

    public String DecimalBinario() {
        int r = 0;
        String bin = "";
        while (dec > 0) {
            r = dec % 2;
            dec = dec / 2;
            bin = r + bin;
        }
        return bin;
    }

    public String DecimalOctal() {
        int s = 0;
        String oct = "";
        while (dec > 0) {
            s = dec % 8;
            dec = dec / 8;
            oct = s + oct;
        }
        return oct;
    }

    public String DecimalHexa() {
        int t = 0;
        String hex = "";
        while (dec > 0) {
            t = dec % 16;
            dec = dec / 16;
            switch (t) {
                case 10:
                    hex = "A" + hex;
                    break;
                case 11:
                    hex = "B" + hex;
                    break;
                case 12:
                    hex = "C" + hex;
                    break;
                case 13:
                    hex = "D" + hex;
                    break;
                case 14:
                    hex = "E" + hex;
                    break;
                case 15:
                    hex = "F" + hex;
                    break;
                default:
                    hex = t + hex;
                    break;
            }
        }
        return hex;
    }
}
