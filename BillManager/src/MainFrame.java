import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

// TODO: Auto-generated Javadoc
/**
 * <h1>Bill Manager</h1>
 * Class:MainFrame
 * First Frame
 * <br><b>Info:</b> When you run application it is the first frame that pops up.
 * MainFrame has login form on a left(LeftPanel) and info about application(RightPanel)
 * @author  Josipa Gligiæ
 * @version 1.0
 * @since   2019-11-22
 */

public class MainFrame extends JFrame{
	
	/**  klasa lijevog panela. */
	private LeftPanel leftPan;
	
	/**  klasa desnog panela. */
	private RightPanel rightPan;
	
	
	/**
	 *  konstruktor koji omogucuje poziv klase u nekoj drugoj klasi.
	 */
	public MainFrame() {
		
		super("Bill Manager");
		createComps();
		setLayout(new BorderLayout());
		
		
		add(leftPan,BorderLayout.WEST);
		add(rightPan,BorderLayout.CENTER);
		
		
		setSize(1000, 600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	/**
	 *  metoda za kreiranje komponenti framea.
	 */
	
	private void createComps() {
		leftPan=new LeftPanel();
		rightPan=new RightPanel();
		
	}
	

}
