import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

// TODO: Auto-generated Javadoc
/**
 * <h1>Bill Manager</h1>
 * Class:RightPanel
 * <br><b>Info:</b> Components on a right in MainFrame.
 *
 * @author  Josipa Gligiæ
 * @version 1.0
 * @since   2019-11-22
 */

public class RightPanel extends JPanel {
	
	/** The title. */
	private JLabel title;
	
	/** The about. */
	private JTextArea about;
	
	/**
	 *  Konstruktor klase,aktivira metode i omogucuje poziv klase iz druge klase.
	 */
	public RightPanel() {
		Dimension dim = getPreferredSize();
		dim.width = 200;
		setPreferredSize(dim);
		createComps();
		setLayout();
		
		
		
	}
	
	/**
	 *  raspored komponenti panela.
	 */
	private void setLayout() {
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		
		gbc.weightx = 1;
		gbc.weighty = 0.25;

		gbc.gridx = 0;
		gbc.gridy = 0;
		
		add(title, gbc);

		gbc.gridx = 0;
		gbc.gridy=1;
		add(about, gbc);
		
		
	}
	
	/**
	 *  metoda koja kreira komponente klase
	 * na panelu se prikazuje naslov i opis aplikacije.
	 */
	private void createComps() {
		title= new JLabel("What you need to know about Bill Manager");
		about=new JTextArea("Bill Manager \n helps you manage and take control of all of your bills \n"
				+ "You can calculate sum of bill expenses in a month and save your data in a file. \n"
				+ "You just need to log in to your account(which makes your data private) \n"
				+ "to see which bills you have payed and add new bills into your app. \n \n"
				+ "Store your data easily with app wizard. Manage your bills easily. \n \n"
				+ "Calculate your expenses and access them every time you need informations.  ");
	}
	
	
	
	

}
