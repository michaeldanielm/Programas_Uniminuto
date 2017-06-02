/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Daniel Murillo López
 * iD;534830
 * Corporacion Universitaria Minuto de Dios
 */
public class Robot {
    
	private int x = 0;
	private int y = 0;
	private String[][] Laberinto;
	private Maze Maze= new Maze();
	
	public Robot(){
		x = 0;
		y = 0;
		Laberinto = Maze.escenarioUno(); 
	}
	
	
	public void revisarAdelante( int posy){
            for (int j = 0; j < Laberinto[posy].length; j++) {
               
            	if(Laberinto[posy][j].equals(" ")){
            		avanzar(posy,j);
            	    }else
            	    {
            			
            		}
            	
            		
              
	
		   }
	    }
	
	
	public void avanzar(int x, int y){
		
		Laberinto[y][x]="♥";
		Maze.imprimirMatriz(Laberinto);
		
	}
	
////	public void girarDerecha(){
////		
////	}
////	
////	public void girarIzquierda(){
////		
////	}
////	
////	public void regresar(){
////            return;
		
//	}
	
	public void revisarLados(int posx, int posy){
		for (int j = 0; j < Laberinto[posy].length; j++) {
            
        	if(Laberinto[posy][j].equals(" ")){
        		avanzar(posx,j);
        	}
	}

 }
    
    
}
