
// TODO: Auto-generated Javadoc
/**
 * <h1>Bill Manager</h1>
 * Interface:ToolBarListener.
 *
 * @author  Josipa Gligiæ
 * @version 1.0
 * @since   2019-11-22
 */

public interface ToolBarListener {
	
	/**
	 * kreiranje metoda interfacea
	 * metoda koja dohvaca tekst iz odabrane datoteke
	 * omogucuje pozivom funkcije za ispis teksta na povrsinu teksta
	 *  da se odabrani tekst iz datotke ispise na povrisini za tekst.
	 *
	 * @param text the new text from file
	 */
	public void setTextFromFile(String text);
	
    /**
     * metoda cijim pozivom omogucujemo brisanje teksta sa povrsine za tekst
     * kada se unutar metode pozove funckija za brisanje teksta.
     */
	public void clearAllText();

}
