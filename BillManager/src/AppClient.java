import javax.swing.SwingUtilities;

// TODO: Auto-generated Javadoc
/**
 * <h1>Bill Manager</h1>
 * Class:AppClient
 * <br><b>Info:</b> Application helps you manage and take control of all of your bills.
 * @author  Josipa Gligiæ
 * @version 1.0
 * @since   2019-11-22
 */

public class AppClient {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		
		SwingUtilities.invokeLater(new Runnable() {
			
			/** poziv klase za pokretanje aplikacije*/
			@Override
			public void run() {
				
				new MainFrame();
				
			}
			
		});

	}

}
