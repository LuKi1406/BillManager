import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// TODO: Auto-generated Javadoc
/**
 * <h1>Bill Manager</h1>
 * Class:ReadFileFrame
 * Third Frame.
 *
 * @author  Josipa Gligiæ
 * @version 1.0
 * @since   2019-11-22
 */

public class ReadFileFrame extends JFrame {
	
	/**  poziv klase. */
	private TextPanel txtPanel;
	
	/**  poziv klase. */
	private ToolBar toolBr;
	
	/**  poziv interfacea. */
	private ToolBarListener tlbLst;
	
	/**  panel za smjestaj komponenti trazilice. */
	private JPanel searchPanel;
	
	/** The upis. */
	private JLabel upis;
	
	/** The search field. */
	private JTextField searchField;
	
	/** The biraj rac. */
	private JLabel birajRac;
	
	/** The racun select. */
	private JTextField racunSelect;
	
	/** The search. */
	private JButton search;
	
	/**  String koji sadrzi tekst iz polja unosa. */
	String fileStr;
	
	/** The search str. */
	String searchStr;
	
	/**
	 *  konstruktor klase.
	 */
	public ReadFileFrame() {
		
		setLayout(new BorderLayout());
		createComps();
		
		add(toolBr,BorderLayout.SOUTH);
		add(txtPanel,BorderLayout.CENTER);
		add(searchPanel,BorderLayout.NORTH);
		toolBr.setToolBarListener(tlbLst);
		
		setSize(800,600);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	/**
	 *  kreiranje komponenti klase(framea).
	 */
	private void createComps() {
		toolBr=new ToolBar();
		
		txtPanel=new TextPanel();
		
		/** panel u koji smjestamo komponente trazilice */
		searchPanel=new JPanel();
		upis=new JLabel("Insert keywords:");
		searchField=new JTextField(10);
		birajRac=new JLabel("Insert bill file you want to search from:");
		racunSelect=new JTextField(10);
		search=new JButton("Search");
		
		searchPanel.add(upis);
		searchPanel.add(searchField);
		searchPanel.add(birajRac);
		searchPanel.add(racunSelect);
		searchPanel.add(search);
		
		/** botun koji omogucuje pretragu teksta unutar datoteke te prikaz rezultata  */
		search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String firstStr= searchField.getText();
				String secondStr=racunSelect.getText();
				
				/** ukoliko unos u polja nije dobar izbacuje gresku */
				try {
					parseFile(secondStr, firstStr);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
			
		});
		
		
		/** interface i implementacija metoda interfacea */
		tlbLst=new ToolBarListener() {

			@Override
			public void setTextFromFile(String text) {
				txtPanel.writeText(text);
				
			}

			@Override
			public void clearAllText() {
				txtPanel.clearTextArea();
				
			}
			
		};
		
	}
	
	/**
	 *  metoda koja nam omogucava pretrazivanje teksta unutar datoteke,
	 * pretrazuje po kljucnoj rijeci te izbacuje sve linije unutar datoteke koje sadrze navedenu rijec.
	 *
	 * @param fileName the file name
	 * @param searchStr the search str
	 * @throws FileNotFoundException the file not found exception
	 */
	public void parseFile(String fileName,String searchStr) throws FileNotFoundException{
		  this.fileStr=fileName;
		  this.searchStr=searchStr;
	        Scanner scan = new Scanner(new File(fileName));
	        while(scan.hasNext()){
	            String line = scan.nextLine().toLowerCase().toString();
	            if(line.contains(searchStr)){
	                txtPanel.writeText(line);
	            }
	        }
	    }
	

}
