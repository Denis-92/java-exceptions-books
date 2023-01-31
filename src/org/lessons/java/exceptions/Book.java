package org.lessons.java.exceptions;

public class Book {
	
	private String titolo;
	private int numeroPagine;
	private String autore;
	private String editore;
	
	public Book(String titolo, int numeroPagine, String autore, String editore) {
		this.titolo = titolo;
		this.numeroPagine = numeroPagine;
		this.autore = autore;
		this.editore = editore;
	}
	
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", numeroPagine=" + numeroPagine + ", autore=" + autore + ", editore=" + editore + "]";
	}
	
	// START REGION GETTERS - SETTERS
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}
	// END REGION GETTERS - SETTERS
}
