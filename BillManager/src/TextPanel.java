import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

// TODO: Auto-generated Javadoc
/**
 * <h1>Bill Manager</h1>
 * Class:TextPanel.
 *
 * @author  Josipa Gligiæ
 * @version 1.0
 * @since   2019-11-22
 */

public class TextPanel extends JPanel {
	
	/**  prostora za tekst. */
	private JTextArea tArea;
	
	/**
	 *  konstruktor.
	 */
	public TextPanel() {
		/**kreiranje prostora za tekst */
		tArea = new JTextArea();

		setLayout(new BorderLayout());
		/** dodaje prostor za tekst na panel i zadaje mu funkcionalnosti i layout */
		add(new JScrollPane(tArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED),
				BorderLayout.CENTER);
		/** velicina prostora za tekst */
		setSize(800,300);
	}
    
	/**
	 *  metoda koja omogucuje unos teksta na prostor za tekst.
	 *
	 * @param str the str
	 */
	public void writeText(String str) {

		tArea.append(str + "\n");
	}
	
	/**
	 *  metoda koja omogucuje brisanje unesenog tekst sa prostora za tekst.
	 */
	public void clearTextArea() {
		
		tArea.selectAll();
		tArea.replaceSelection("");
	}
	
	

}