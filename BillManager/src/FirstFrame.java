
import java.awt.BorderLayout;

/**
 * <h1>Bill Manager</h1>
 * Class:FirstFrame
 * Second Frame
 *  @author  Josipa Gligiæ
 * @version 1.0
 * @since   2019-11-22
 */

import javax.swing.JFrame;


public class FirstFrame extends JFrame{
	
	/**  klasa panela. */
	private FirstFramePanel fstFrmPan;
	
	/**
	 *  konstruktor.
	 */
	public FirstFrame() {
		createComps();
		setLayout(new BorderLayout());
		
		add(fstFrmPan,BorderLayout.CENTER);
		
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	/**
	 *  kreiranje komponenti klase.
	 */
	private void createComps() {
		fstFrmPan=new FirstFramePanel();
	}
	
	

}
