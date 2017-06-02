/**
 *
 * @author Michael Daniel Murillo López
 * iD;534830
 * Corporacion Universitaria Minuto de Dios
 */
public class Main {
	public static void main(String[] args) {
            System.out.println("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18");
		Maze m = new Maze();
                
		//Salida
		m.getMaze()[1][1] = "X";
		// Posicion inicial
		m.solve(14, 1);
                
		System.out.println(m);
		System.out.print("\n\n\n Michael Daniel Murillo López");
		System.out.print("\n ID:534830");
		System.out.print("\n Corporacion Universitaria Minuto de Dios");
		
		
		
	}
}
