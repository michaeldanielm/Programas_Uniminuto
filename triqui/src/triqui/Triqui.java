package triqui;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Michael Daniel Murillo López 
 * Primer Triqui 
 * Este Triqui juega Usuario Con la Maquina 
 * id: 534830
 */
import java.util.Random;
import java.util.Scanner;

public class Triqui {

    String tablero[][];
    Scanner leer = new Scanner(System.in);
    int x;
    int y;
    String jugadoruno = "X ";
    String jugadordos = "O ";
    int fila, columna;
    int aux;

    public Triqui() {

        tablero = new String[3][3];
    }

    public void imprimirTablero() {

        System.out.printf("__________________");
        System.out.printf("\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("|%4s|", tablero[i][j]);

            }

            System.out.printf("\n");
            System.out.printf("__________________");
            System.out.printf("\n");
        }

    }

    public void solitarJugada() {
        int auxrepetido = 0;
        do {
            System.out.println("Ingrese cordenadas en la fila 0, 1 o 2:");
            x = leer.nextInt();
            System.out.println("Ingrese cordenadas en la columna 0, 1 o 2:");
            y = leer.nextInt();
            if (tablero[x][y] == null) {
                tablero[x][y] = jugadoruno;
                auxrepetido = 1;
            }
        } while (auxrepetido == 0);
        imprimirTablero();
        if (tablero[x][y] != null) {
            aux = aux + 2;
            if (aux > 9) {
                System.out.println("juego empatado");

                System.exit(0);
            }
        }
        System.out.println("               ");
        System.out.println("               ");  
        System.out.println("Turno jugador 2");
        System.out.println("               ");
        System.out.println("               ");
        if (turnoJugador2() != true) {
            jugador2();
        }
        imprimirTablero();

    }

    public void verificarColumnaIzquierda() {

        int aux1 = 0;
        int aux2 = 0;

        for (int f = 0; f < 3; f++) {

            if (tablero[f][0] != null) {
                if (tablero[f][0].equals(jugadoruno)) {

                    aux1++;
                    if (aux1 == 3) {
                        System.out.println("Columna Izquierda en X Gana jugador");

                        fila = 2;
                        columna = 2;
                    }
                } else if (tablero[f][0].equals(jugadordos)) {
                    aux2++;
                    if (aux2 == 3) {
                        System.out.println("Columna Izquierda en O Gana sistema");

                        fila = 2;
                        columna = 2;
                    }
                }
            }
        }
    }

    public void verificarColumnaCentral() {

        int aux1 = 0;
        int aux2 = 0;

        for (int f = 0; f < 3; f++) {

            if (tablero[f][1] != null) {
                if (tablero[f][1].equals(jugadoruno)) {

                    aux1++;
                    if (aux1 == 3) {
                        System.out.println("Columna central en X Gana jugador");

                        fila = 2;
                        columna = 2;
                    }
                } else if (tablero[f][1].equals(jugadordos)) {
                    aux2++;
                    if (aux2 == 3) {
                        System.out.println("Columna central en O Gana sistema");

                        fila = 2;
                        columna = 2;
                    }
                }
            }
        }
    }

    public void verificarColumnaDerecha() {

        int aux1 = 0;
        int aux2 = 0;

        for (int f = 0; f < 3; f++) {

            if (tablero[f][2] != null) {
                if (tablero[f][2].equals(jugadoruno)) {

                    aux1++;
                    if (aux1 == 3) {
                        System.out.println("Columna Derecha en X Gana jugador");

                        fila = 2;
                        columna = 2;
                    }
                } else if (tablero[f][2].equals(jugadordos)) {
                    aux2++;
                    if (aux2 == 3) {
                        System.out.println("Columna Derecha en O Gana sistema");

                        fila = 2;
                        columna = 2;
                    }
                }
            }
        }
    }

    public void verificarfilaArriba() {

        int aux1 = 0;
        int aux2 = 0;

        for (int f = 0; f < 3; f++) {

            if (tablero[0][f] != null) {
                if (tablero[0][f].equals(jugadoruno)) {

                    aux1++;
                    if (aux1 == 3) {
                        System.out.println("Fila de Arriba en X Gana jugador");

                        fila = 2;
                        columna = 2;
                    }
                } else if (tablero[0][f].equals(jugadordos)) {
                    aux2++;
                    if (aux2 == 3) {
                        System.out.println("Fila de Arriba en O Gana sistema");

                        fila = 2;
                        columna = 2;
                    }
                }
            }
        }
    }

    public void verificarfilaCentral() {

        int aux1 = 0;
        int aux2 = 0;

        for (int f = 0; f < 3; f++) {

            if (tablero[1][f] != null) {
                if (tablero[1][f].equals(jugadoruno)) {

                    aux1++;
                    if (aux1 == 3) {
                        System.out.println("Fila Central en X Gana jugador");

                        fila = 2;
                        columna = 2;
                    }
                } else if (tablero[1][f].equals(jugadordos)) {
                    aux2++;
                    if (aux2 == 3) {
                        System.out.println("Fila de Central en O Gana sistema");

                        fila = 2;
                        columna = 2;
                    }
                }
            }
        }
    }

    public void verificarfilaInferior() {

        int aux1 = 0;
        int aux2 = 0;

        for (int f = 0; f < 3; f++) {

            if (tablero[2][f] != null) {
                if (tablero[2][f].equals(jugadoruno)) {

                    aux1++;
                    if (aux1 == 3) {
                        System.out.println("Fila de Abajo en X Gana jugador");

                        fila = 2;
                        columna = 2;
                    }
                } else if (tablero[2][f].equals(jugadordos)) {
                    aux2++;
                    if (aux2 == 3) {
                        System.out.println("Fila de Abajo en O Gana sistema");

                        fila = 2;
                        columna = 2;
                    }
                }
            }
        }
    }

    public void verificarDiagonalDerecha() {

        int aux1 = 0;
        int aux2 = 0;

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                if (f == c) {
                    if (tablero[f][c] != null) {

                        if (tablero[f][c].equals(jugadoruno)) {
                            aux1++;
                            if (aux1 == 3) {
                                System.out.println("Diagonal derecha X Gana jugador");
                                fila = 2;
                                columna = 2;
                            }
                        } else if (tablero[f][c].equals(jugadordos)) {
                            aux2++;
                            if (aux2 == 3) {
                                System.out.println("Diagonal derecha O Gana sistema");
                                fila = 2;
                                columna = 2;
                            }
                        }
                    }
                }
            }
        }
    }

    public void verificarDiagonalIzquierda() {

        int aux1 = 0;
        int aux2 = 0;
        int numFilas = 3;
        int numColumn = 3;

        for (int f = 0; f < numFilas; f++) {
            for (int c = 0; c < numColumn; c++) {
                if ((f + c) == (numFilas - 1)) {
                    if (tablero[f][c] != null) {

                        if (tablero[f][c].equals(jugadoruno)) {
                            aux1++;
                            if (aux1 == 3) {
                                System.out.println("Diagonal izquierda X Gana jugador");
                                fila = 2;
                                columna = 2;
                            }
                        } else if (tablero[f][c].equals(jugadordos)) {
                            aux2++;
                            if (aux2 == 3) {
                                System.out.println("Diagonal izquierda X Gana sistema");
                                fila = 2;
                                columna = 2;
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean turnoJugador2() {
        boolean estado = false;

        String pos1 = "" + tablero[0][0];
        String pos2 = "" + tablero[0][1];
        String pos3 = "" + tablero[0][2];
        String pos4 = "" + tablero[1][0];
        String pos5 = "" + tablero[1][1];
        String pos6 = "" + tablero[1][2];
        String pos7 = "" + tablero[2][0];
        String pos8 = "" + tablero[2][1];
        String pos9 = "" + tablero[2][2];

        if (pos1.equals(jugadordos) && pos2.equals(jugadordos) && pos3.equals("null")) {
            tablero[0][2] = jugadordos;
            estado = true;
        }
        if (pos1.equals(jugadordos) && pos2.equals("null") && pos3.equals(jugadordos)) {
            tablero[0][1] = jugadordos;
            estado = true;
        }
        if (pos1.equals("null") && pos2.equals(jugadordos) && pos3.equals(jugadordos)) {
            tablero[0][0] = jugadordos;
            estado = true;
        }

        if (pos4.equals(jugadordos) && pos5.equals(jugadordos) && pos6.equals("null")) {
            tablero[1][2] = jugadordos;
            estado = true;
        }
        if (pos4.equals(jugadordos) && pos5.equals("null") && pos6.equals(jugadordos)) {
            tablero[1][1] = jugadordos;
            estado = true;
        }
        if (pos4.equals("null") && pos5.equals(jugadordos) && pos6.equals(jugadordos)) {
            tablero[1][0] = jugadordos;
            estado = true;
        }

        if (pos7.equals(jugadordos) && pos8.equals(jugadordos) && pos9.equals("null")) {
            tablero[2][2] = jugadordos;
            estado = true;
        }
        if (pos7.equals(jugadordos) && pos8.equals("null") && pos9.equals(jugadordos)) {
            tablero[2][1] = jugadordos;
            estado = true;
        }
        if (pos7.equals("null") && pos8.equals(jugadordos) && pos9.equals(jugadordos)) {
            tablero[2][0] = jugadordos;
            estado = true;
        }
        if (pos1.equals(jugadordos) && pos4.equals(jugadordos) && pos7.equals("null")) {
            tablero[2][0] = jugadordos;
            estado = true;
        }
        if (pos1.equals(jugadordos) && pos4.equals("null") && pos7.equals(jugadordos)) {
            tablero[1][0] = jugadordos;
            estado = true;
        }
        if (pos1.equals("null") && pos4.equals(jugadordos) && pos7.equals(jugadordos)) {
            tablero[0][0] = jugadordos;
            estado = true;
        }
        if (pos2.equals(jugadordos) && pos5.equals(jugadordos) && pos8.equals("null")) {
            tablero[2][1] = jugadordos;
            estado = true;
        }
        if (pos2.equals(jugadordos) && pos5.equals("null") && pos8.equals(jugadordos)) {
            tablero[1][1] = jugadordos;
            estado = true;
        }
        if (pos2.equals("null") && pos5.equals(jugadordos) && pos8.equals(jugadordos)) {
            tablero[0][1] = jugadordos;
            estado = true;
        }
        if (pos3.equals(jugadordos) && pos6.equals(jugadordos) && pos9.equals("null")) {
            tablero[2][2] = jugadordos;
            estado = true;
        }
        if (pos3.equals(jugadordos) && pos6.equals("null") && pos9.equals(jugadordos)) {
            tablero[1][2] = jugadordos;
            estado = true;
        }
        if (pos3.equals("null") && pos6.equals(jugadordos) && pos9.equals(jugadordos)) {
            tablero[0][2] = jugadordos;
            estado = true;
        }
        if (pos1.equals(jugadordos) && pos5.equals(jugadordos) && pos9.equals("null")) {
            tablero[2][2] = jugadordos;
            estado = true;
        }
        if (pos1.equals(jugadordos) && pos5.equals("null") && pos9.equals(jugadordos)) {
            tablero[1][1] = jugadordos;
            estado = true;
        }
        if (pos1.equals("null") && pos5.equals(jugadordos) && pos9.equals(jugadordos)) {
            tablero[0][0] = jugadordos;
            estado = true;
        }
        if (pos3.equals(jugadordos) && pos5.equals(jugadordos) && pos7.equals("null")) {
            tablero[2][0] = jugadordos;
            estado = true;
        }
        if (pos3.equals(jugadordos) && pos5.equals("null") && pos7.equals(jugadordos)) {
            tablero[1][1] = jugadordos;
            estado = true;
        }
        if (pos3.equals("null") && pos5.equals(jugadordos) && pos7.equals(jugadordos)) {
            tablero[0][2] = jugadordos;
            estado = true;

        }
        if (pos1.equals(jugadoruno) && pos2.equals(jugadoruno) && pos3.equals("null")) {
            tablero[0][2] = jugadordos;
            estado = true;
        } else if (pos1.equals(jugadoruno) && pos2.equals("null") && pos3.equals(jugadoruno)) {
            tablero[0][1] = jugadordos;
            estado = true;
        } else if (pos1.equals("null") && pos2.equals(jugadoruno) && pos3.equals(jugadoruno)) {
            tablero[0][0] = jugadordos;
            estado = true;
        } else if (pos4.equals(jugadoruno) && pos5.equals(jugadoruno) && pos6.equals("null")) {
            tablero[1][2] = jugadordos;
            estado = true;
        } else if (pos4.equals(jugadoruno) && pos5.equals("null") && pos6.equals(jugadoruno)) {
            tablero[1][1] = jugadordos;
            estado = true;
        } else if (pos4.equals("null") && pos5.equals(jugadoruno) && pos6.equals(jugadoruno)) {
            tablero[1][0] = jugadordos;
            estado = true;
        } else if (pos7.equals(jugadoruno) && pos8.equals(jugadoruno) && pos9.equals("null")) {
            tablero[2][2] = jugadordos;
            estado = true;
        } else if (pos7.equals(jugadoruno) && pos8.equals("null") && pos9.equals(jugadoruno)) {
            tablero[2][1] = jugadordos;
            estado = true;
        } else if (pos7.equals("null") && pos8.equals(jugadoruno) && pos9.equals(jugadoruno)) {
            tablero[2][0] = jugadordos;
            estado = true;
        } else if (pos1.equals(jugadoruno) && pos4.equals(jugadoruno) && pos7.equals("null")) {
            tablero[2][0] = jugadordos;
            estado = true;
        } else if (pos1.equals(jugadoruno) && pos4.equals("null") && pos7.equals(jugadoruno)) {
            tablero[1][0] = jugadordos;
            estado = true;
        } else if (pos1.equals("null") && pos4.equals(jugadoruno) && pos7.equals(jugadoruno)) {
            tablero[0][0] = jugadordos;
            estado = true;
        } else if (pos2.equals(jugadoruno) && pos5.equals(jugadoruno) && pos8.equals("null")) {
            tablero[2][1] = jugadordos;
            estado = true;
        } else if (pos2.equals(jugadoruno) && pos5.equals("null") && pos8.equals(jugadoruno)) {
            tablero[1][1] = jugadordos;
            estado = true;
        } else if (pos2.equals("null") && pos5.equals(jugadoruno) && pos8.equals(jugadoruno)) {
            tablero[0][1] = jugadordos;
            estado = true;
        } else if (pos3.equals(jugadoruno) && pos6.equals(jugadoruno) && pos9.equals("null")) {
            tablero[2][2] = jugadordos;
            estado = true;
        } else if (pos3.equals(jugadoruno) && pos6.equals("null") && pos9.equals(jugadoruno)) {
            tablero[1][2] = jugadordos;
            estado = true;
        } else if (pos3.equals("null") && pos6.equals(jugadoruno) && pos9.equals(jugadoruno)) {
            tablero[0][2] = jugadordos;
            estado = true;
        } else if (pos1.equals(jugadoruno) && pos5.equals(jugadoruno) && pos9.equals("null")) {
            tablero[2][2] = jugadordos;
            estado = true;
        } else if (pos1.equals(jugadoruno) && pos5.equals("null") && pos9.equals(jugadoruno)) {
            tablero[1][1] = jugadordos;
            estado = true;
        } else if (pos1.equals("null") && pos5.equals(jugadoruno) && pos9.equals(jugadoruno)) {
            tablero[0][0] = jugadordos;
            estado = true;
        } else if (pos3.equals(jugadoruno) && pos5.equals(jugadoruno) && pos7.equals("null")) {
            tablero[2][0] = jugadordos;
            estado = true;
        } else if (pos3.equals(jugadoruno) && pos5.equals("null") && pos7.equals(jugadoruno)) {
            tablero[1][1] = jugadordos;
            estado = true;
        } else if (pos3.equals("null") && pos5.equals(jugadoruno) && pos7.equals(jugadoruno)) {
            tablero[0][2] = jugadordos;
            estado = true;
        }

        return estado;

    }

    public void jugador2() {
        int aleatoriofila = 0;
        int aleatoriocolumna = 0;
        //aux++;
        do {
            aleatoriofila = (int) (Math.random() * 3 + 0);
            aleatoriocolumna = (int) (Math.random() * 3 + 0);
        } while (tablero[aleatoriofila][aleatoriocolumna] != null);

        if (tablero[aleatoriofila][aleatoriocolumna] == null) {
            tablero[aleatoriofila][aleatoriocolumna] = (jugadordos);

        }

    }

    public void jugar() {

        imprimirTablero();
        for (fila = 0; fila < 3; fila++) {
            for (columna = 0; columna < 3; columna++) {

                solitarJugada();
                verificarColumnaCentral();
                verificarColumnaDerecha();
                verificarColumnaIzquierda();
                verificarDiagonalDerecha();
                verificarDiagonalIzquierda();
                verificarfilaCentral();
                verificarfilaInferior();
                verificarfilaArriba();

            }
        }

    }

    public void verificarEmpate() {

        if (tablero[fila][columna] != null) {
            aux = aux + 2;
            if (aux > 9) {
                System.out.println("juego empatado");
            }
        }
    }
    
            
            

    public static void main(String[] args) {

        Triqui triqui = new Triqui();
        triqui.jugar();
        System.out.println("--------------------------------------");
        System.out.println("Gracias por usar nuestro Triqui");
        System.out.println("Autor :Michael Daniel Murillo ");
        System.out.println("Id:    534830");
        System.out.println("--------------------------------------");

    }

}
