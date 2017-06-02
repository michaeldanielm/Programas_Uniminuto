/**
 *
 * @author Michael Daniel Murillo López
 * iD;534830
 * Corporacion Universitaria Minuto de Dios
 */
public class Maze {

 
	// Matriz
	private String[][] maze =
		   {
                       
                        {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#","#", "#", "#", "#", "#", "#", "#", "#"},
			{"#", " ", " ", "#", "#", " ", "#", " ", " ", " "," ", "#", "#", "#", "#", "#", "#", "#"},
			{"#", "#", " ", "#", "#", " ", "#", " ", "#", "#"," ", "#", "#", "#", "#", " ", " ", "#"},
			{"#", "#", " ", "#", " ", " ", " ", " ", "#", "#"," ", "#", "#", "#", "#", " ", "#", "#"},
			{"#", "#", " ", " ", "#", "#", "#", " ", "#", "#"," ", "#", "#", "#", "#", " ", "#", "#"},
			{"#", "#", "#", " ", " ", " ", " ", " ", "#", "#"," ", "#", "#", "#", "#", " ", "#", "#"},
			{"#", "#", "#", " ", "#", "#", "#", "#", "#", "#"," ", "#", " ", " ", " ", " ", " ", "#"},
			{"#", " ", "#", " ", "#", "#", "#", "#", "#", "#"," ", "#", " ", "#", " ", "#", "#", "#"},
			{"#", " ", " ", " ", " ", " ", " ", " ", " ", " "," ", "#", " ", "#", " ", "#", "#", "#"},
			{"#", "#", " ", "#", "#", " ", "#", " ", "#", "#"," ", "#", " ", "#", " ", "#", "#", "#"},
			{"#", "#", " ", "#", " ", " ", " ", " ", "#", "#"," ", "#", " ", "#", " ", "#", "#", "#"},
			{"#", "#", " ", " ", "#", "#", "#", " ", "#", "#"," ", " ", " ", "#", " ", "#", "#", "#"},
			{"#", "#", "#", " ", " ", " ", " ", " ", "#", "#","#", "#", "#", "#", " ", "#", "#", "#"},
			{"#", "#", "#", " ", " ", "#", "#", "#", "#", "#","#", "#", "#", " ", " ", " ", " ", "#"},
			{"#", " ", " ", " ", "#", "#", "#", "#", "#", "#","#", "#", "#", " ", "#", "#", "#", "#"},
			{"#", "#", "#", "#", "#", "#", "#", "#", "#", "#","#", "#", "#", "#", "#", "#", "#", "#"},};
	
	public String[][] getMaze(){
		return this.maze;
	}

	// Obtiene la posicion inicial y empieza a resolver
	public void solve(int x, int y) {
		if (step(x,y)) {
			maze [x][y] = "S";
		}
	}
	
	// Recursividad
	public boolean step (int x, int y) {
		
		
		
		
		
		//Encontramos la salida
		if (maze[x][y] == "X") {
			return true;
		}
		
		//Chocamos con un muro o con el camino que ya pasamos
		if (maze[x][y] == "#" || maze[x][y] == "♥") {
			return false;
		}
		
		/** Backtracking Step **/
		
		// Marca el camino
		maze[x][y] = "♥";
		boolean result;	
		
		// Intenta ir a la derecha
		result = step(x, y+1);
		if (result) { return true;}
		
		// Intenta ir hacia arriba
		result = step(x-1, y);
		if (result) { return true;}
		
		// Intenta ir a la izquierda
		result = step(x, y-1);
		if (result) { return true;}		
		
		//// Intenta ir abajo
		result = step(x+1, y);
		if (result) { return true;}		
		
		
		/** Deadend - Esta posicion no puede estar en la solucion **/
		
		// La marcamos como ya recorrida
		maze[x][y] = "◘";
		
		// Regresa
		return false;
	}
	
	//Impresion
	public String toString() {
		String output = "";
		for (int x=0; x<maze.length; x++) {
			for (int y=0; y<maze[x].length; y++) {
				output += maze[x][y] + " ";
			}
			output += "\n";
		}
		return output;
	}

    void imprimirMatriz(String[][] Laberinto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String[][] escenarioUno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
}