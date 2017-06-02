
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc = 0, dec = 0;
        String bin = "", oct = "", hexa = "";
        SistemaDecimal SD = new SistemaDecimal();
        SistemaBinario SB = new SistemaBinario();
        SistemaOctal SO = new SistemaOctal();
        SistemaHexa SH = new SistemaHexa();
        while (opc != 5) {
            System.out.println("----------------------------------------------");
            System.out.println("              Sistemas Númericos\n----------------------------------------------\n"
                    + "1. Decimal \n2. Binario \n3. Octal \n4. Hexadecimal \n5. Salir\n");
            System.out.println("¿Qué operación desea realizar?");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("----------------------------------------------");
                    System.out.println("                  Decimal");
                    System.out.println("----------------------------------------------");
                    System.out.print("Ingrese decimal:");
                    dec = leer.nextInt();
                    SD.setDec(dec);
                    bin = SD.DecimalBinario();
                    SD.setDec(dec);
                    oct = SD.DecimalOctal();
                    SD.setDec(dec);
                    hexa = SD.DecimalHexa();
                    System.out.println("Binario: " + bin + "\nOctal: " + oct + "\nHexa: " + hexa);
                    break;
                case 2:
                    System.out.println("----------------------------------------------");
                    System.out.println("                  Binario");
                    System.out.println("----------------------------------------------");
                    System.out.print("Ingrese el binario:");
                    bin = leer.next();
                    SB.setBin(bin);
                    dec = SB.BinarioDecimal();
                    SD.setDec(dec);
                    oct = SD.DecimalOctal();
                    SD.setDec(dec);
                    hexa = SD.DecimalHexa();
                    System.out.println("Decimal: " + dec + "\nOctal: " + oct + "\nHexa: " + hexa);
                    break;
                case 3:
                    System.out.println("----------------------------------------------");
                    System.out.println("                  Octal");
                    System.out.println("----------------------------------------------");
                    System.out.print("Ingrese el octal:");
                    oct = leer.next();
                    SO.setOct(oct);
                    dec = SO.OctalDecimal();
                    SD.setDec(dec);
                    bin = SD.DecimalBinario();
                    SD.setDec(dec);
                    hexa = SD.DecimalHexa();
                    System.out.println("Decimal: " + dec + "\nBinario: " + bin + "\nHexa: " + hexa);
                    break;
                case 4:
                    System.out.println("----------------------------------------------");
                    System.out.println("                Hexadecimal");
                    System.out.println("----------------------------------------------");
                    System.out.print("Ingrese el Hexadecimal:");
                    hexa = leer.next();
                    SH.setHexa(hexa);
                    dec = SH.HexaDecimal();
                    SD.setDec(dec);
                    bin = SD.DecimalBinario();
                    SD.setDec(dec);
                    oct = SD.DecimalOctal();
                    System.out.println("Decimal: " + dec + "\nBinario: " + bin + "\nOctal: " + oct);
                    break;
                case 5:
                    System.out.println("----------------------------------------------");
                    System.out.println("     Gracias por usar nuestro software :D");
                    System.out.println("----------------------------------------------");
                    System.exit(0);
                default:
                    System.out.println("Por favor elija una opción correcta");
            }
        }
    }
}
