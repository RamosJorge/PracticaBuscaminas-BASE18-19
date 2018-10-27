import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

/**
 * Clase que implementa el listener de los botones del Buscaminas.
 * De alguna manera tendrá que poder acceder a la ventana principal.
 * Se puede lograr pasando en el constructor la referencia a la ventana.
 * Recuerda que desde la ventana, se puede acceder a la variable de tipo ControlJuego
 * @author jorgeramosgil
 **
 */
public class ActionBoton implements ActionListener{

	private VentanaPrincipal ventana;
	private int x;
	private int y;
	
	public ActionBoton(VentanaPrincipal ventana, int x, int y) {
		//TODO
		super();
		this.ventana = ventana;
		this.x = x;
		this.y = y;
	}
	
	/**
	 *Acción que ocurrirá cuando pulsamos uno de los botones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		ventana.botonesJuego[x][y].setVisible(false);
		ventana.panelesJuego[x][y].remove(ventana.botonesJuego[x][y]);
		JLabel jlabel = new JLabel(Integer.toString(ventana.juego.getMinasAlrededor(x, y)));
		jlabel.setHorizontalAlignment(JLabel.CENTER);
		ventana.panelesJuego[x][y].add(jlabel);
	}

}
