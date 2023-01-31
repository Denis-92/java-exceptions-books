package org.lessons.java.exceptions;

public class Book {
	
	private String titolo;
	private int numeroPagine;
	private String autore;
	private String editore;
	
	public Book(String titolo, int numeroPagine, String autore, String editore) throws Exception {
		super();
		this.titolo = titolo;
		validazioneTitolo(titolo);
		this.numeroPagine = numeroPagine;
		validazioneNumeroPagine(numeroPagine);
		this.autore = autore;
		validazioneAutore(autore);
		this.editore = editore;
		validazioneEditore(editore);
	}
	
	public void validazioneTitolo(String titolo) throws Exception {
		if (titolo.length() == 0)
			throw new Exception();
	}
	
	public void validazioneNumeroPagine(int numeroPagine) throws Exception {
		if (numeroPagine < 1)
			throw new Exception();
	}
	
	public void validazioneAutore(String autore) throws Exception {
		if (autore.length() == 0)
			throw new Exception();
	}
	
	public void validazioneEditore(String editore) throws Exception {
		if (editore.length() == 0)
			throw new Exception();
	}
	
//	public boolean isEverythingValid (String titolo, String autore, String editore) {
//		if (titolo.length() > 0 && titolo.length() > 0 && titolo.length() > 0)
//			return true;
//		return false;
//	}
	
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", numeroPagine=" + numeroPagine + ", autore=" + autore + ", editore=" + editore + "]";
	}
	
	// START REGION GETTERS - SETTERS
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) throws Exception {
		this.titolo = titolo;
		validazioneTitolo(titolo);
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) throws Exception {
		this.numeroPagine = numeroPagine;
		validazioneNumeroPagine(numeroPagine);
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws Exception {
		this.autore = autore;
		validazioneAutore(autore);
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) throws Exception {
		this.editore = editore;
		validazioneEditore(editore);
	}
	// END REGION GETTERS - SETTERS
}
