/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Michael Daniel Murillo López
 * Id 534830
 * Corporación Universitaria Minuto de Dios
 */
public class Tablero {

    char[][] fichas = new char[3][3];

    public Tablero() {
        
        limpiarTablero();
    }
    
    

    int calcularTriqui() {

        //Filas
        for (int i = 0; i < 3; i++) {
            if (fichas[i][0]!='a'&& fichas[i][0] == fichas[i][1] && fichas[i][0] == fichas[i][2]) {
                return 1;
            }
        }

        //Columnas
        for (int i = 0; i < 3; i++) {
            if (fichas[0][i]!='a'&&fichas[0][i] == fichas[1][i] && fichas[0][i] == fichas[2][i]) {
                return 1;
            }
        }

        //Diagonales
        if (fichas[0][0]!='a'&&fichas[0][0] == fichas[1][1] && fichas[0][0] == fichas[2][2]) {
            return 1;
        }

        if (fichas[1][1]!='a'&&fichas[2][0] == fichas[1][1] && fichas[2][0] == fichas[0][2]) {
            return 1;
        }

        return 0;
    }

    void limpiarTablero() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fichas[i][j]='a';
            }
        }
    }

}
