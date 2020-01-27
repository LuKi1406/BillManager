import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

// TODO: Auto-generated Javadoc
/**
 * <h1>Bill Manager</h1>
 * Class:FirstFramePanel
 * <br><b>Info:</b> Components added in FirstFrame class.
 *
 * @author  Josipa Gligiæ
 * @version 1.0
 * @since   2019-11-22
 */

public class FirstFramePanel extends JPanel {
	
	/**  kreiranje dva panela za smjestaj komponenti. */
	JPanel panel1=new JPanel();
	
	/** The panel. */
	JPanel panel=new JPanel();
	
	/**  kreiranje botuna. */
	private JButton racun1;
	
	/** The racun 2. */
	private JButton racun2;
	
	/** The racun 3. */
	private JButton racun3;
    
    /** The racun 4. */
    private JButton racun4;
    
    /** The racun 5. */
    private JButton racun5;
    
    /** The racun 6. */
    private JButton racun6;
    
    /** The open bills. */
    private JButton openBills;
    
    /** The suma. */
    private JButton suma;
   
    /**  liste za smjestaj unesenih vrijednosti. */
    private ArrayList<Double> values1 = new ArrayList<Double>();
    
    /** The values 2. */
    private ArrayList<Double> values2=new ArrayList<Double>();
    
    /** The values 3. */
    private ArrayList<Double> values3=new ArrayList<Double>();
    
    /** The values 4. */
    private ArrayList<Double> values4=new ArrayList<Double>();
    
    /** The values 5. */
    private ArrayList<Double> values5=new ArrayList<Double>();
    
    /** The values 6. */
    private ArrayList<Double> values6=new ArrayList<Double>();
   
    
    /**  varijable unutar kojih se sprema parsirani String dobiven iz unosa vrijednosti racuna. */
    private double result1;
    
    /** The result 2. */
    private double result2;
    
    /** The result 3. */
    private double result3;
    
    /** The result 4. */
    private double result4;
    
    /** The result 5. */
    private double result5;
    
    /** The result 6. */
    private double result6;
    
    /** The result. */
    private double result;
    
    /** label..opis polja za unos teksta*/
    JLabel imeRacuna=new JLabel("Bill name:");
    
    /**  polje za unos podataka. */
	JTextField imeField=new JTextField(20);
	
	/** The datum racuna. */
	JLabel datumRacuna=new JLabel("Insert for what date is your bill(ex. MONTH/YEAR):");
	
	/** The datum field. */
	JTextField datumField=new JTextField(20);
	
	/** The iznos. */
	JLabel iznos=new JLabel("The amount of the bill:(ex.334.7)");
	
	/** The iznos field. */
	JTextField iznosField=new JTextField(20);
	
	/** The datum placanja. */
	JLabel datumPlacanja=new JLabel("Insert a date when you payed your bill(ex. DD/MM/YYYY): ");
	
	/** The datum placanja field. */
	JTextField datumPlacanjaField=new JTextField(20);
	
    
	/**
	 *  konstruktor za poziv klase i njenih metoda.
	 */
    public FirstFramePanel() {
    	Dimension dim = getPreferredSize();
		dim.width = 800;
		setPreferredSize(dim);
		
    	createComps();
    	
    	setPanelLayout();
    	
    	
    	
    	
    }
    
    /**
     *  metoda za kreiranje rasporeda komponenti panela.
     */
    private void setPanelLayout() {
    	setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		
		gbc.weightx = 0;
		gbc.weighty = 0.25;

		gbc.gridx = 0;
		gbc.gridy = 0;
		
		add(imeRacuna, gbc);

		gbc.gridx = 0;
		gbc.gridy=1;
		add(imeField, gbc);
		
		

		gbc.gridx = 0;
		gbc.gridy = 2;
		add(datumRacuna, gbc);

		gbc.gridx = 0;
		gbc.gridy=3;
		add(datumField, gbc);
		
		gbc.gridx=0;
		gbc.gridy=4;
		add(iznos,gbc);
		
		gbc.gridx=0;
		gbc.gridy=5;
		add(iznosField,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 6;
		add(datumPlacanja, gbc);

		gbc.gridx = 0;
		gbc.gridy=7;
		add(datumPlacanjaField, gbc);
		//panel1
		gbc.gridx=4;
		gbc.gridy=0;
		add(racun1,gbc);
		
		gbc.gridx=4;
		gbc.gridy=1;
		add(racun2,gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 2;
		add(racun3, gbc);

		gbc.gridx = 4;
		gbc.gridy=3;
		add(racun4, gbc);
		
		
		gbc.gridx=4;
		gbc.gridy=4;
		add(racun5,gbc);
		
		gbc.gridx=4;
		gbc.gridy=5;
		add(racun6,gbc);
		
		gbc.gridx=4;
		gbc.gridy=6;
		add(suma,gbc);
		
		gbc.gridx=4;
		gbc.gridy=7;
		add(openBills,gbc);
		
		
    }
    
 
    /**
     *  metoda za kreiranje komponenti unutar framea.
     */
    private void createComps() {
    	
    	
    	racun1= new JButton("SAVE HRT");
    	racun2=new JButton("SAVE HEP");
    	racun3=new JButton("SAVE ÈISTOÆA");
    	racun4=new JButton("SAVE VODOVOD");
    	racun5=new JButton("SAVE A1");
    	racun6=new JButton("SAVE SIXTH BILL");
    	
    	openBills=new JButton("OPEN SAVED BILL DATA");
    	suma=new JButton("SUM OF BILLS IN A MONTH");
    	
    	/** smjestaj komponenti na panel1 */
    	panel1.add(racun1);
    	panel1.add(racun2);
    	panel1.add(racun3);
    	panel1.add(racun4);
    	panel1.add(racun5);
    	panel1.add(racun6);
    	panel1.add(suma);
    	panel1.add(openBills);
    	
    	
		
    	/** smjestaj komponenti na panel */
		panel.add(imeRacuna);
		panel.add(imeField);
		panel.add(datumRacuna);
		panel.add(datumField);
		panel.add(iznos);
		panel.add(iznosField);
		panel.add(datumPlacanja);
		panel.add(datumPlacanjaField);
		
    	
    	
		/** aktivacija botuna */
    	racun1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				/** kreiranje stringova koji sadrze tekst unesen u polje za unos */
				String ime1=imeField.getText();
				String datum1=datumField.getText();
				String iz=iznosField.getText();
				String datumPl=datumPlacanjaField.getText();
				
				imeField.setText(" ");
				datumField.setText(" ");
				iznosField.setText(" ");
				datumPlacanjaField.setText(" ");
				/** pretvorba String u double */
				result1 = Double.parseDouble(iz);
				values1.add(result1);
				
				/** pop up poruka kada korisnik aktivira botun */
				String titleBar ="Success";
				String infoMessage = "Data transported to file";
				FirstFramePanel.infoBox(infoMessage, titleBar);
				
				
				
				/** Kreiranje novog serijaliziranog dokumenta unutar kojeg se unose podaci iz forme i spremaju */
				 try {
			         FileOutputStream fileOut =
			         new FileOutputStream("Bill_1.ser",true);
			         ObjectOutputStream out = new ObjectOutputStream(fileOut);
			         out.writeObject(ime1+"\n"+"Date of the bill:"+datum1+"\n"+"Total amount:"+iz+"\n"+"Date of payment:"+datumPl+"\n"+"<<--"+ime1+" /Date of the bill: "+datum1+" /Total amount: "+iz+" /Date of payment:"+datumPl+"-->"+"\n __________________________> \n \n \n");
			         out.close();
			         fileOut.close();
			         System.out.printf("Serialized data is saved in Bill_1.ser");
			      } catch (IOException i) {
			         i.printStackTrace();
			      }
			   }
			
			
			
    	});
    	
    	/** aktivacija botuna */
    	racun2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {
				
				/** Stringovi koji sadrze tekst dobiven iz unosa u polje unosa */
				String ime1=imeField.getText();
				String datum1=datumField.getText();
				String iz=iznosField.getText();
				String datumPl=datumPlacanjaField.getText();
				
				imeField.setText(" ");
				datumField.setText(" ");
				iznosField.setText(" ");
				datumPlacanjaField.setText(" ");
				
				/** pretvorba String u double*/
				result2 = Double.parseDouble(iz);
				values2.add(result2);
				
				/** pop up poruka kad je botun aktiviran */
				String titleBar ="Success";
				String infoMessage = "Data transported to file";
				FirstFramePanel.infoBox(infoMessage, titleBar);
				
				
				/** kreiranje novog serijaliziranog dokumenta koji omogucuje upis u datoteku i spremanje unosa */
				 try {
			         FileOutputStream fileOut =
			         new FileOutputStream("Bill_2.ser",true);
			         ObjectOutputStream out = new ObjectOutputStream(fileOut);
			         out.writeObject(ime1+"\n"+"Date of the bill:"+datum1+"\n"+"Total amount:"+iz+"\n"+"Date of payment:"+datumPl+"\n"+"<<--"+ime1+" /Date of the bill: "+datum1+" /Total amount: "+iz+" /Date of payment:"+datumPl+"-->"+"\n __________________________> \n \n \n");
			         out.close();
			         fileOut.close();
			         System.out.printf("Serialized data is saved in Bill_2.ser");
			      } catch (IOException i) {
			         i.printStackTrace();
			      }
			   }
    		
    	});
    	
    	/** aktivacija botuna  */
    	racun3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {
				/** pretvorba teksta unesenog u JTextField u String 
				 * omogucuje spremanje teksta u file*/
				String ime1=imeField.getText();
				String datum1=datumField.getText();
				String iz=iznosField.getText();
				String datumPl=datumPlacanjaField.getText();
				
				/** naredba setText brise uneseni tekst nakon pritiska botuna */
				imeField.setText(" ");
				datumField.setText(" ");
				iznosField.setText(" ");
				datumPlacanjaField.setText(" ");
				
				/** pretvorba stringa u double */
				result3 = Double.parseDouble(iz);
				values3.add(result3);
				
				/** pop up prozor s porukom kada je unesno spremljeno u file */
				String titleBar ="Success";
				String infoMessage = "Data transported to file";
				FirstFramePanel.infoBox(infoMessage, titleBar);
				
				/** kreiranje dokumenta u koji se spremaju podaci, serijalizacija i boolean true omogucuju
				 * da sadrzaj ostane spremljen u datoteci i nakon zatvaranja aplikacije
				 * to omogucuje pristup podacima datoteka bilo kada */
				 try {
			         FileOutputStream fileOut =
			         new FileOutputStream("Bill_3.ser",true);
			         ObjectOutputStream out = new ObjectOutputStream(fileOut);
			         out.writeObject(ime1+"\n"+"Date of the bill:"+datum1+"\n"+"Total amount:"+iz+"\n"+"Date of payment:"+datumPl+"\n"+"<<--"+ime1+" /Date of the bill: "+datum1+" /Total amount: "+iz+" /Date of payment:"+datumPl+"-->"+"\n __________________________> \n \n \n");
			         out.close();
			         fileOut.close();
			         System.out.printf("Serialized data is saved in Bill_3.ser");
			      } catch (IOException i) {
			         i.printStackTrace();
			      }
			   }
    		
    	});
    	
    	/** aktivacija botuna */
    	racun4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {
				
				/** dohvacanje unesenog teksta i spremanje u String */
				String ime1=imeField.getText();
				String datum1=datumField.getText();
				String iz=iznosField.getText();
				String datumPl=datumPlacanjaField.getText();
				
				/** brisanje unesenog sadrzaja u polje */
				imeField.setText(" ");
				datumField.setText(" ");
				iznosField.setText(" ");
				datumPlacanjaField.setText(" ");
				
				/** parsiranje String u double */
			    result4 = Double.parseDouble(iz);
				values4.add(result4);
				
				/** pop up prozor s porukom*/
				String titleBar ="Success";
				String infoMessage = "Data transported to file";
				FirstFramePanel.infoBox(infoMessage, titleBar);
				
				
				
				/** kreairanje novog dokumenta,serijalizacija,cuvanje podataka */
				 try {
			         FileOutputStream fileOut =
			         new FileOutputStream("Bill_4.ser",true);
			         ObjectOutputStream out = new ObjectOutputStream(fileOut);
			         out.writeObject(ime1+"\n"+"Date of the bill:"+datum1+"\n"+"Total amount:"+iz+"\n"+"Date of payment:"+datumPl+"\n"+"<<--"+ime1+" /Date of the bill: "+datum1+" /Total amount: "+iz+" /Date of payment:"+datumPl+"-->"+"\n __________________________> \n \n \n");
			         out.close();
			         fileOut.close();
			         System.out.printf("Serialized data is saved in Bill_4.ser");
			      } catch (IOException i) {
			         i.printStackTrace();
			      }
			   }
    		
    	});
    	
    	/** aktivacija botuna */
    	racun5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {
				
				/** dohvacanje unesenog teksta i spremanje u String */
				String ime1=imeField.getText();
				String datum1=datumField.getText();
				String iz=iznosField.getText();
				String datumPl=datumPlacanjaField.getText();
				
				/** brisanje unesenog sadrzaja u polje */
				imeField.setText(" ");
				datumField.setText(" ");
				iznosField.setText(" ");
				datumPlacanjaField.setText(" ");
				
				/** parsiranje String u double */
			    result5 = Double.parseDouble(iz);
				values5.add(result5);
				
				/** pop up prozor s porukom*/
				String titleBar ="Success";
				String infoMessage = "Data transported to file";
				FirstFramePanel.infoBox(infoMessage, titleBar);
				
				
				
				/** kreairanje novog dokumenta,serijalizacija,cuvanje podataka */
				 try {
			         FileOutputStream fileOut =
			         new FileOutputStream("Bill_5.ser",true);
			         ObjectOutputStream out = new ObjectOutputStream(fileOut);
			         out.writeObject(ime1+"\n"+"Date of the bill:"+datum1+"\n"+"Total amount:"+iz+"\n"+"Date of payment:"+datumPl+"\n"+"<<--"+ime1+" /Date of the bill: "+datum1+" /Total amount: "+iz+" /Date of payment:"+datumPl+"-->"+"\n __________________________> \n \n \n");
			         out.close();
			         fileOut.close();
			         System.out.printf("Serialized data is saved in Bill_5.ser");
			      } catch (IOException i) {
			         i.printStackTrace();
			      }
			   }
    		
    	});
    	
    	/** aktivacija botuna */
    	racun6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {
				
				/** dohvacanje unesenog teksta i spremanje u String */
				String ime1=imeField.getText();
				String datum1=datumField.getText();
				String iz=iznosField.getText();
				String datumPl=datumPlacanjaField.getText();
				
				/** brisanje unesenog sadrzaja u polje */
				imeField.setText(" ");
				datumField.setText(" ");
				iznosField.setText(" ");
				datumPlacanjaField.setText(" ");
				
				/** parsiranje String u double */
			    result6 = Double.parseDouble(iz);
				values6.add(result6);
				
				/** pop up prozor s porukom*/
				String titleBar ="Success";
				String infoMessage = "Data transported to file";
				FirstFramePanel.infoBox(infoMessage, titleBar);
				
				
				
				/** kreairanje novog dokumenta,serijalizacija,cuvanje podataka */
				 try {
			         FileOutputStream fileOut =
			         new FileOutputStream("Bill_6.ser",true);
			         ObjectOutputStream out = new ObjectOutputStream(fileOut);
			         out.writeObject(ime1+"\n"+"Date of the bill:"+datum1+"\n"+"Total amount:"+iz+"\n"+"Date of payment:"+datumPl+"\n"+"<<--"+ime1+" /Date of the bill: "+datum1+" /Total amount: "+iz+" /Date of payment:"+datumPl+"-->"+"\n __________________________> \n \n \n");
			         out.close();
			         fileOut.close();
			         System.out.printf("Serialized data is saved in Bill_6.ser");
			      } catch (IOException i) {
			         i.printStackTrace();
			      }
			   }
    		
    	});
    	
    	
    	
    	/** aktivacija botuna */
    	suma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				/** varijabla unutar koje se zbrajaju unosi iznosa racuna */
				double result = result1+result2+result3+result4+result5+result6;
				
				/** dohvacanje teksta iz polja datuma*/
				String date=datumField.getText();
				
				
				/** brisanje unesenih podataka u polje */
				imeField.setText(" ");
				datumField.setText(" ");
				iznosField.setText(" ");
				datumPlacanjaField.setText(" ");
				
				
				

				
				
				/** pop up poruka koja izbacuje sumu elemenata za datum unosa */
				String titleBar ="Total bill sum";
				String infoMessage = "Total sum:"+result+"\n Data transported to file";
				FirstFramePanel.infoBox(infoMessage, titleBar);
				
				
				/** kreiranje nove serijalizirane datoteke koja sprema i omogucuje unos podataka sume */
				 try {
			         FileOutputStream fileOut =
			         new FileOutputStream("Total_Amount.ser");
			         ObjectOutputStream out = new ObjectOutputStream(fileOut);
			         out.writeObject("Total sum: "+result+"Month: "+date);
			         out.close();
			         fileOut.close();
			         System.out.printf("Serialized data is saved in Total_Amount.ser");
			      } catch (IOException i) {
			         i.printStackTrace();
			      }
			   }
    		
    	});
    	
    	/** botun koji otvara novi frame */
    	openBills.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent lst) {
				/** poziv klase */
				ReadFileFrame rff=new ReadFileFrame();
				/** vidljivost klase */
				rff.setVisible(true);
				
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

}
