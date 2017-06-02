/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Michael Daniel Murillo López
 * iD;534830
 * Corporacion Universitaria Minuto de Dios
 */
public class Laberinto {

   char[][] laberinto = {{'|', '|', '|', '|', '|', '|', '|', '|', '|', '|'},
			{'|', ' ', ' ', ' ', '|', ' ', '|', ' ', ' ', '|'},
			{'|', ' ', ' ', ' ', '|', ' ', '|', ' ', '|', '|'},
			{'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
			{'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
			{'|', '|', '|', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
			{'|', ' ', ' ', ' ', ' ', '|', '|', '|', '|', '|'},
			{'|', ' ', ' ', ' ', ' ', ' ', '|', ' ', '|', '|'},
			{'|', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
			{'|', '|', '|', '|', '|', '|', '|', '|', '|', '|'},};
    
    public void resolver(int x, int y){
        if(recorrer(x,y))
            laberinto[x][y] = 'I';
    }
    
    private Boolean recorrer(int x, int y){
        boolean camino;
        if(laberinto[x][y]=='S')
            return true;
        if(laberinto[x][y]=='|' || laberinto[x][y] =='*')
            return false;
        
        laberinto[x][y] = '*';
        
        //busca derecha
        camino = recorrer(x,y+1);
        if(camino)
            return true;
        
        //busca abajo
        camino = recorrer(x+1,y);
        if(camino)
            return true;
        
        //busca izquierda
        camino = recorrer(x,y-1);
        if(camino)
            return true;
        
        //busca arriba
        camino = recorrer(x-1,y);
        if(camino)
            return true;
        
        laberinto[x][y] = ' ';
        return false;
    }
    
    public String imprime(){
        String labe = "";
        for(int i =0;i<10;i++){
            for(int j=0;j<10;j++){
                labe = labe + laberinto[i][j] + " ";
            }
            labe = labe + "\n";
        }
        return labe;
    }
    
    public static void main(String args[]){
        Laberinto laberinto = new Laberinto();
        Random inicio = new Random();
        Random salida = new Random();
        laberinto.laberinto[salida.nextInt(10)][salida.nextInt(10)] = 'S';
        laberinto.resolver(inicio.nextInt(10),inicio.nextInt(10));
        System.out.println(laberinto.imprime());
        System.out.print("\n\n\n Michael Daniel Murillo López");
        System.out.print("\n ID:534830");
	System.out.print("\n Corporacion Universitaria Minuto de Dios");
    }
}
    

