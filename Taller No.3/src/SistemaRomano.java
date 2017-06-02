/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class SistemaRomano {

    private String Romano;
    private int x;

    public SistemaRomano() {
        Romano = "";
    }

    public String getRomano() {
        return Romano;
    }

    public void setRomano(String Romano) {
        this.Romano = Romano;
    }

    public int RomanoDecimal() {
        int num = 0, dec = 0, p = 1, tamaño;
        String Romano = "";
        tamaño = Romano.length();
        for (int i = tamaño - 1; i >= 0; i--) {
            Romano = Character.toString(Romano.charAt(i));
            switch (Romano) {
                case "I":
                    num = 1;
                    break;
                case "II":
                    num = 2;
                    break;
                case "III":
                    num = 3;
                    break;
                case "IV":
                    num = 4;
                    break;
                case "V":
                    num = 5;
                    break;
                case "VI":
                    num = 6;
                    break;
                case "VII":
                    num = 7;
                    break;
                case "VIII":
                    num = 8;
                    break;
                case "IX":
                    num = 9;
                    break;
                case "X":
                    num = 10;
                    break;
                case "XI":
                    num = 11;
                    break;
                case "L":
                    num = 50;
                    break;
                case "C":
                    num = 100;
                    break;
                case "D":
                    num = 500;
                    break;
                case "M":
                    num = 1000;
                    break;
                case "-L":
                    num = 1000;
                    break;
                case "-X":
                    num = 10000;
                    break;
                case "-c":
                    num = 100000;
                    break;
                default:
                    num = Integer.parseInt(Character.toString(Romano.charAt(i)));
                    break;
            }
            dec = dec + (num * p);
            p = p * -c;
        }
        return dec;
    }
}
