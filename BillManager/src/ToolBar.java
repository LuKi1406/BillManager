import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// TODO: Auto-generated Javadoc
/**
 * <h1>Bill Manager</h1>
 * Class:ToolBar.
 *
 * @author  Josipa Gligiæ
 * @version 1.0
 * @since   2019-11-22
 */

public class ToolBar extends JPanel implements ActionListener {


	/**  botuni za brisanje teksta i citanje datoteke. */
	private JButton clearButton;
	
	/** The read button. */
	private JButton readButton;
	
	/** The too listener. */
	private ToolBarListener tooListener;
	
    
	/**
	 *  konstruktor klase koja sadrzi botune za citanje datoteka i brisanje teksta sa povrsine za tekst
	 * u konstruktoru pozivamo metodu za kreiranje komponenti klase te postavljamo raspored komponenti
	 * sadrzi i metodu za aktivaciju komponenti klase.
	 */
	public ToolBar() {

		createComps();
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(clearButton);
		add(readButton);
		activateComps();

	}
    
	/**
	 *  metoda za kreiranje komponenti
	 * kreiraju se dva botuna.
	 */
	private void createComps() {

		clearButton = new JButton("Clear text");
		readButton = new JButton("Open file");
		
	}
    
	/**
	 *  metoda kojom aktiviramo komponente.
	 */
	private void activateComps() {

		clearButton.addActionListener(this);
		readButton.addActionListener(this);

	}

	/**
	 * Action performed.
	 *
	 * @param ev the ev
	 */
	@Override
	
	/** postavljamo uvjete ovisno koji je botun aktiviran
	 * ukoliko je aktiviran botun za brisanje onda ce se ocistiti tekst sa povrsine za tekst
	 * ukoliko je aktiviran botun za citanje datoteka onda ce se otvoriti prozor za pretrazivanje datoteka
	 * odabrana datoteka ce se otvoriti i prikazati na povrsini za tekst
	 * ukoliko nije odabrana datoteka pojaviti ce se poruka da je radnja otkazana od korisnika aplikacije */
	public void actionPerformed(ActionEvent ev) {
        
		BufferedReader br;
		StringBuilder sb;

		if (ev.getSource() == clearButton) {

			tooListener.clearAllText();

		} else if (ev.getSource() == readButton) {
			
			JFileChooser fc = new JFileChooser();
			int value = fc.showOpenDialog(this);
			
			if(value == JFileChooser.APPROVE_OPTION) {
				
				File file = fc.getSelectedFile();
				
				try {
					br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
					sb = new StringBuilder();
					String line;
					while((line = br.readLine()) != null) {
						sb.append(line);
						sb.append("\n");
					}
					
					br.close();
					
					tooListener.setTextFromFile(sb.toString());
					
				} catch (UnsupportedEncodingException | FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				}
				
			} else {
				System.out.println("Cancelled");
			}
			
			

		}

	}
	
	
    /**
     *  metoda kojom pozivamo metode interfacea kako bi omogucili rad funkcija komponenta unutar framea.
     *
     * @param lst the new tool bar listener
     */
	public void setToolBarListener(ToolBarListener lst) {
		this.tooListener = lst;
	}
	
	  

}
