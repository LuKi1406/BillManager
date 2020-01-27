import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// TODO: Auto-generated Javadoc
/**
 * <h1>Bill Manager</h1>
 * Class:LeftPanel
 * <br><b>Info:</b> Left components on a MainFrame class
 * Form for administrator login in application and get services it provides.
 *
 * @author  Josipa Gligiæ
 * @version 1.0
 * @since   2019-11-22
 */

public class LeftPanel extends JPanel implements ActionListener {
	
	/**  label daje opis polja za unos. */
	private JLabel description;
	
	/** The enter user. */
	private JLabel enterUser;
	
	/**  polje omogucuje unos podataka. */
	private JTextField userField;
	
	/** The enter pass. */
	private JLabel enterPass;
	
	/** The pass field. */
	private JPasswordField passField;
	
	/** The log in. */
	private JButton logIn;
	
	/**
	 *  konstruktor klase,omogucuje poziv klase unutar druge klase.
	 */
	public LeftPanel() {
		Dimension dim = getPreferredSize();
		dim.width = 400;
		setPreferredSize(dim);
		
		createComps();
		layoutLeft();
		
		
		
	}
	
	/**
	 *  metoda za kreiranje rasporeda elemenata na panelu.
	 */
	private void layoutLeft() {
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		
		gbc.weightx = 0;
		gbc.weighty = 0.25;

		gbc.gridx = 0;
		gbc.gridy = 0;
		
		add(description, gbc);

		gbc.gridx = 0;
		gbc.gridy=1;
		add(enterUser, gbc);
		
		gbc.weightx = 1;
		gbc.weighty = 0.25;

		gbc.gridx = 0;
		gbc.gridy = 2;
		add(userField, gbc);

		gbc.gridx = 0;
		gbc.gridy=3;
		add(enterPass, gbc);
		
		gbc.gridx=0;
		gbc.gridy=4;
		add(passField,gbc);
		
		gbc.gridx=0;
		gbc.gridy=5;
		add(logIn,gbc);
		
	}
	
	
	/**
	 *  metoda kojom kreiramo komponente klase.
	 */
	private void createComps() {
		description=new JLabel("Enter your administrator username and password to access app");
		enterUser=new JLabel("Enter your admin username: ");
		userField=new JTextField(20);
		enterPass=new JLabel("Enter your admin password: ");
		passField=new JPasswordField(20);
		logIn=new JButton("Continue");
		
		
		/** aktivacija botuna za pristup aplikaciji */
		logIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				/** varijable kojim dobivamo tekst iz polja unosa */
				String username=userField.getText();
				String password=new String(passField.getText());
				
				/** uvjet kojim ili ukoliko su uneseni tocni podaci u polje omogucujemo pristup aplikaciji
				 * ili iskace pop up poruka ukoliko unos nije tocan */
				if(username.equals("Admin") && password.equals("Admin")) {
					FirstFrame fstFrm=new FirstFrame();
					fstFrm.setVisible(true);
					
				} else {
					
					MainFrame mn=new MainFrame();
					FirstFrame fstFrm=new FirstFrame();
					fstFrm.setVisible(false);
					String titleBar ="Warning";
					String infoMessage = "Wrong username or password";
					LeftPanel.infoBox(infoMessage, titleBar);
					mn.dispose();
					
				}
				
			}
			
			
		});
		
	}
    
	/**
	 *  metoda za kreiranje pop up poruke.
	 *
	 * @param infoMessage the info message
	 * @param titleBar the title bar
	 */
	public static void infoBox(String infoMessage, String titleBar)
    { 
		
    
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

	/**
	 * Action performed.
	 *
	 * @param arg0 the arg 0
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
