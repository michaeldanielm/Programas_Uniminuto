/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Daniel Murillo López 
 * Id:534830
 * Corporación Univesitaria Minuto de Dios 
 */
import java.util.Scanner;
import java.util.Random;
public class Ahorcado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random R = new Random();
        String PalabraAni[] = {"MAPACHE", "ELEFANTE", "SALAMANDRA", "ORNITORRINCO", "PUERCOESPIN", "PANDA", "HIPOPOTAMO", "TARANTULA", "TUCAN"};
        String AnimalClave[] = {"Terrestre", "Terrestre", "Reptil", "Semiacuatico", "Sistema de Defensa Corporal", "Tiene Pelaje", "Africa", "Muchas Patas", "Ave"};
        String PalabraMit[] = {"ZEUS", "POSEIDON", "HADES", "KRAKEN", "PEGASO", "TRITON", "CENTAURO", "MINOTAURO", "HERCULES"};
        String SeresClave[] = {"Dios", "Dios", "Dios", "Ser Acuatico", "Ser Volador", "Ser Acuatico", "SemiHumano", "SemiHumano", "Heroe"};
        String PalabraPel[] = {"CHUCKY", "TITANIC", "CAZAFANTASMAS", "RESIDENT EVIL", "TERMINATOR", "STAR WARS", "EL TRANSPORTADOR", "ERA DE HIELO", "MADAGASCAR"};
        String PeliClave[] = {"Terror", "Drama", "Comedia Clasico", "Terror", "Accion Ficción", "Acción Ficción", "Accion", "Animada", "Animada"};
        String PalabraVer[] = {"ACUMULAR", "COMER", "RESOLVER", "CONTINUAR", "COMPARTIR", "TRADUCIR", "CONTRIBUIR", "ACRIBILLAR", "CULMINAR"};
        String PalabraPer[] = {"EINSTEIN", "HAWKING", "HOMERO", "MICHAEL JORDAN", "VAN HELSING", "STEVE JOBS", "STEPHEN KING", "SEBASTIAN BACH", "BETHOVEN"};
        String PersoClave[] = {"Cientifico", "Cientifico", "Personaje Animado", "Deportista", "Caza Monstruos", "Inventor Magnate", "Escritor", "Musico", "Musico"};
        char Temp[] = new char[1];
        char Palabra[] = new char[1];
        char Temp1[] = new char[1];
        int intentos = 7;
        int opc = 0;
        System.out.println("--------------------------------\n"
                + "|            Ahorcado          |\n"
                + "--------------------------------\n\n"
                + "            Categorias\n\n"
                + "1. Animales\n"
                + "2. Seres Mitologícos\n"
                + "3. Peliculas\n"
                + "4. Verbos\n"
                + "5. Personajes Famosos\n");
        while (opc < 1 || opc > 5) {
            System.out.print("Elija una categoria -->");
            opc = leer.nextInt();
            if (opc < 1 || opc > 5) {
                System.out.println("La categoria seleccionada no existe.\nPor favor elija una categoria correcta.");
            }
        }
        String Pista = "";
        String Nombre = "";
        int j = 10;
        switch (opc) {
            case 1:
                Nombre = "Animales";
                while (j > 8) {
                    j = (int) (R.nextFloat() * 10);
                }
                Palabra = PalabraAni[j].toCharArray();
                Pista = AnimalClave[j];
                Temp = new char[Palabra.length];
                for (int i = 0; i < Temp.length; i++) {
                    Temp[i] = '_';
                }
                break;
            case 2:
                Nombre = "Seres Mitologícos";
                while (j > 8) {
                    j = (int) (R.nextFloat() * 10);
                }
                Palabra = PalabraMit[j].toCharArray();
                Pista = SeresClave[j];
                Temp = new char[Palabra.length];
                for (int i = 0; i < Temp.length; i++) {
                    Temp[i] = '_';
                }
                break;
            case 3:
                Nombre = "Peliculas";
                while (j > 8) {
                    j = (int) (R.nextFloat() * 10);
                }
                Palabra = PalabraPel[j].toCharArray();
                Pista = PeliClave[j];
                Temp = new char[Palabra.length];
                for (int i = 0; i < Temp.length; i++) {
                    Temp[i] = '_';
                }
                break;
            case 4:
                Nombre = "Verbos";
                while (j > 8) {
                    j = (int) (R.nextFloat() * 10);
                }
                Palabra = PalabraVer[j].toCharArray();
                Pista = "No hay Pista";
                Temp = new char[Palabra.length];
                for (int i = 0; i < Temp.length; i++) {
                    Temp[i] = '_';
                }
                break;
            case 5:
                Nombre = "Personajes Famosos";
                while (j > 8) {
                    j = (int) (R.nextFloat() * 10);
                }
                Palabra = PalabraPer[j].toCharArray();
                Pista = PersoClave[j];
                Temp = new char[Palabra.length];
                for (int i = 0; i < Temp.length; i++) {
                    Temp[i] = '_';
                }
                break;
        }
        int o = 0;
        for (int i = 0; i < Temp.length; i++) {
            if (Palabra[i] == ' ') {
                Temp[i] = ' ';
                o++;
            }
        }
        char Letra1 = ' ';
        String Letra = "";
        String T10 = "";
        String T11 = "";
        String T20 = "";
        String T21 = "";
        String T30 = "";
        String T31 = "";
        String T40 = "";
        String T41 = "";
        String T50 = "";
        String T51 = "";
        String T60 = "";
        String T61 = "";
        String T70 = "";
        String T71 = "";
        int n = 0;
        while (intentos > 0 && n != Palabra.length) {
            switch (intentos) {
                case 1:
                    T10 = "             |";
                    break;
                case 2:
                    T20 = "            _|_";
                    T21 = "           (@°°)";
                    break;
                case 3:
                    T30 = "             ||";
                    T31 = "           //||\\ ";
                    break;
                case 4:
                    T40 = "          // || \\ ";
                    T41 = "             ||";
                    break;
                case 5:
                    T50 = "            //\\ ";
                    T51 = "           //  \\ ";
                    break;
            }
            System.out.println("________________________________\n\n"
                    + "    ||=============H\n"
                    + "    ||" + T10 + "\n"
                    + "    ||" + T11 + "\n"
                    + "    ||" + T20 + "\n"
                    + "    ||" + T21 + "\n"
                    + "    ||" + T30 + "\n"
                    + "    ||" + T31 + "\n"
                    + "    ||" + T40 + "\n"
                    + "    ||" + T41 + "\n"
                    + "    ||" + T50 + "\n"
                    + "    ||" + T51 + "\n"
                    + "    ||\n"
                    + "    ||\n"
                    + ",.======,.,.,.,.,.,.,.,.,.,.,.,\n"
                    + "________________________________\n");
            System.out.print("Categoria: " + Nombre
                    + "\nPista: " + Pista + "\nIntentos: ");
            for (int i = 0; i < intentos; i++) {
                System.out.print(" O ");
            }
            int p = 7 - intentos;
            for (int i = 0; i < p; i++) {
                System.out.print(" X ");
            }
            System.out.print("\nPalabra: ");
            for (int i = 0; i < Temp.length; i++) {
                System.out.print(" " + Temp[i]);
            }
            System.out.println("\n");
            Letra = "";
            while (Letra.length() != 1 && Letra.length() != Palabra.length) {
                System.out.println("Ingrese una letra o intente adivinar la palabra:" + n);
                Letra = leer.nextLine().toUpperCase();
                if (Letra.length() != 1 && Letra.length() != Palabra.length) {
                    System.out.println("Solo puede ingresar una letra o adivinar la palabra completa");
                } else {
                    if (Letra.length() == 1) {
                        Letra1 = Letra.charAt(0);
                    }
                }
            }
            int k = 0;
            int y;
            if (Letra.length() == 1) {
                y = 0;
                for (int i = 0; i < Temp.length; i++) {
                    if (Temp[i] == Palabra[i]) {
                        y++;
                    }
                }
                if (y == Temp.length) {
                    n = Palabra.length;
                } else {
                    for (int i = 0; i < Palabra.length; i++) {
                        if (Letra1 == Palabra[i] && Palabra[i] != Temp[i]) {
                            Temp[i] = Palabra[i];
                            k++;
                            n++;
                        }
                    }
                    if (k == 0) {
                        intentos--;
                    }
                }
                y = 0;
                for (int i = 0; i < Temp.length; i++) {
                    if (Temp[i] == Palabra[i]) {
                        y++;
                    }
                }
                if (y == Temp.length) {
                    n = Palabra.length;
                }
            } else {
                if (Letra.length() == Palabra.length) {
                    Temp1 = Letra.toCharArray();
                    char m;
                    y = 0;
                    for (int i = 0; i < Temp1.length; i++) {
                        if (Temp1[i] == Palabra[i]) {
                            y++;
                        }
                    }
                    if (y == Temp1.length) {
                        n = Palabra.length;
                    } else {
                        for (int i = 0; i < Palabra.length; i++) {
                            m = Letra.charAt(i);
                            if (m == Palabra[i] && Palabra[i] != Temp[i]) {
                                Temp[i] = m;
                                k++;
                                n++;
                            }
                        }
                        if (k == 0) {
                            intentos--;
                        }
                    }
                    for (int i = 0; i < Temp1.length; i++) {
                        if (Temp1[i] == Palabra[i]) {
                            y++;
                        }
                    }
                    if (y == Temp1.length) {
                        n = Palabra.length;
                    }
                }
            }
            if (k == Palabra.length - o) {
                n = Palabra.length;
            }
        }
        T11 = "             |";
        System.out.println("________________________________\n\n"
                + "    ||=============H\n"
                + "    ||" + T10 + "\n"
                + "    ||" + T11 + "\n"
                + "    ||" + T20 + "\n"
                + "    ||" + T21 + "\n"
                + "    ||" + T30 + "\n"
                + "    ||" + T31 + "\n"
                + "    ||" + T40 + "\n"
                + "    ||" + T41 + "\n"
                + "    ||" + T50 + "\n"
                + "    ||" + T51 + "\n"
                + "    ||\n"
                + "    ||\n"
                + ",.======,.,.,.,.,.,.,.,.,.,.,.,\n"
                + "________________________________\n");
        System.out.print("Categoria: " + Nombre
                + "\nPista: " + Pista + "\nIntentos: ");
        for (int i = 0; i < intentos; i++) {
            System.out.print(" O ");
        }
        int p = 7 - intentos;
        for (int i = 0; i < p; i++) {
            System.out.print(" X ");
        }
        System.out.print("\nPalabra: ");
        for (int i = 0; i < Temp.length; i++) {
            System.out.print(" " + Temp[i]);
        }
        System.out.println("\n");
        System.out.println("--------------------------------");
        if (n < Palabra.length) {
            System.out.println("|           Perdio :(          |");
            System.out.println("--------------------------------");
            System.out.print("La palabra era: ");
        } else {
            System.out.println("|    ¡¡¡ Felicidades Ganó !!!  |\n"
                    + "|              ☺☺☺☺             |");
            System.out.println("--------------------------------");
        }
        for (int i = 0; i < Palabra.length; i++) {
            System.out.print(" " + Palabra[i]);
        }
        System.out.println();
    }
}
