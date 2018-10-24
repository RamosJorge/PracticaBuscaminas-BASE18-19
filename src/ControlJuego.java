import java.util.ArrayList;
import java.util.Random;

/**
 * Clase gestora del tablero de juego.
 * Guarda una matriz de enteros representado el tablero.
 * Si hay una mina en una posici贸n guarda el n煤mero -1
 * Si no hay una mina, se guarda cu谩ntas minas hay alrededor.
 * Almacena la puntuaci贸n de la partida
 * @author jorgeramosgil
 *
 */
public class ControlJuego {
	
	private final static int MINA = -1;
	final int MINAS_INICIALES = 20;
	final int LADO_TABLERO = 10;

	private int [][] tablero;
	private int puntuacion;
	
	
	public ControlJuego() {
		//Creamos el tablero:
		tablero = new int[LADO_TABLERO][LADO_TABLERO];
		
		//Inicializamos una nueva partida
		inicializarPartida();
	}
	
	
	/**M茅todo para generar un nuevo tablero de partida:
	 * @pre: La estructura tablero debe existir. 
	 * @post: Al final el tablero se habr谩 inicializado con tantas minas como marque la variable MINAS_INICIALES. 
	 * 			El resto de posiciones que no son minas guardan en el entero cu谩ntas minas hay alrededor de la celda
	 */
	public void inicializarPartida(){

		//TODO: Repartir minas e inicializar puntaci髇. Si hubiese un tablero anterior, lo pongo todo a cero para inicializarlo.
		
		
		
		//Al final del m閠odo hay que guardar el n鷐ero de minas para las casillas que no son mina:
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] != MINA){
					tablero[i][j] = calculoMinasAdjuntas(i,j);
				}
			}
		}
	}
	
	/**C谩lculo de las minas adjuntas: 
	 * Para calcular el n煤mero de minas tenemos que tener en cuenta que no nos salimos nunca del tablero.
	 * Por lo tanto, como mucho la i y la j valdr谩n LADO_TABLERO-1.
	 * Por lo tanto, como poco la i y la j valdr谩n 0.
	 * @param i: posici贸n vertical de la casilla a rellenar
	 * @param j: posici贸n horizontal de la casilla a rellenar
	 * @return : El n煤mero de minas que hay alrededor de la casilla [i][j]
	 **/
	private int calculoMinasAdjuntas(int i, int j){

	}
	
	/**
	 * M茅todo que nos permite 
	 * @pre : La casilla nunca debe haber sido abierta antes, no es controlado por el ControlJuego. Por lo tanto siempre sumaremos puntos
	 * @param i: posici贸n verticalmente de la casilla a abrir
	 * @param j: posici贸n horizontalmente de la casilla a abrir
	 * @return : Verdadero si no ha explotado una mina. Falso en caso contrario.
	 */
	public boolean abrirCasilla(int i, int j){

	}
	
	
	
	/**
	 * M茅todo que checkea si se ha terminado el juego porque se han abierto todas las casillas.
	 * @return Devuelve verdadero si se han abierto todas las celdas que no son minas.
	 **/
	public boolean esFinJuego(){
	}
	
	
	/**
	 * M茅todo que pinta por pantalla toda la informaci贸n del tablero, se utiliza para depurar
	 */
	public void depurarTablero(){
		System.out.println("---------TABLERO--------------");
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\nPuntuaci贸n: "+puntuacion);
	}

	/**
	 * M茅todo que se utiliza para obtener las minas que hay alrededor de una celda
	 * @pre : El tablero tiene que estar ya inicializado, por lo tanto no hace falta calcularlo, s铆mplemente consultarlo
	 * @param i : posici贸n vertical de la celda.
	 * @param j : posici贸n horizontal de la cela.
	 * @return Un entero que representa el n煤mero de minas alrededor de la celda
	 */
	public int getMinasAlrededor(int i, int j) {
	}

	/**
	 * M茅todo que devuelve la puntuaci贸n actual
	 * @return Un entero con la puntuaci贸n actual
	 */
	public int getPuntuacion() {
	}
	
}
