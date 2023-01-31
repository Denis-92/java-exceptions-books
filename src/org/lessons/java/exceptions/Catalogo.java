package org.lessons.java.exceptions;

import java.util.Scanner;

public class Catalogo {
	public static void main(String[] args) {
		// Vogliamo gestire il catalogo di libri di una biblioteca.
		// Un libro è composto da :
		//	- titolo
		//	- numero pagine
		//	- autore
		//	- editore
		//	Scrivere un programma che inserisce n libri in un array.
		
		//	Chiede i dati di un libro (titolo, numero pagine, autore, editore),
		//		istanzia un nuovo oggetto della classe Book e lo inserisce nell’array.
		
		//	Lo fa per il numero di elementi previsti nell’array.
		
		//	Quando vengono inseriti i dati, verificare che siano corretti (es. non accettare titolo o autore o editore vuoto,
		//		numero pagine ≤ 0). Se ci sono errori, lanciare un’eccezione e gestirla mostrando a video il tipo di errore.
		
		//	Implementare i getter e setter di tutti gli attributi del libro gestendo anche in questo caso
		//		eventuali errori di dati non corretti (che generano quindi eccezione).
	
		
		// Aperto inputContainer
		Scanner inputContainer = new Scanner(System.in);
		
		int numeroLibri = 0;
		
		do {
			try {
				System.out.print("Quanti libri vuoi inserire? (max.5) ");
				numeroLibri = Integer.parseInt(inputContainer.nextLine());
				if (numeroLibri < 1 || numeroLibri > 5)
					System.out.println("Numero non valido, intervallo accettato da 1 a 5 compresi...");
			} catch (Exception error) {
				System.out.println("Input non valido. Inserire solo un numero intero!");
			}
			
		} while (numeroLibri < 1 || numeroLibri > 5);
		
		
		Book [] collezioneLibri = new Book[numeroLibri];
		
		try {			
			for (int i = 0; i < numeroLibri; i++) {
				System.out.print("Inserisci titolo del libro: ");
				String titolo = inputContainer.nextLine();
				
				System.out.print("Inserisci numero delle pagina del libro: ");
				int numeroPagine = Integer.parseInt(inputContainer.nextLine());
				
				System.out.print("Inserisci nome dell'autore: ");
				String autore = inputContainer.nextLine();
				
				System.out.print("Inserisci nome dell'editore: ");
				String editore = inputContainer.nextLine();
				
				Book libro = new Book(titolo, numeroPagine, autore, editore);
				collezioneLibri[i] = libro;
				
				
			}		
		} catch (Exception error) {
			System.out.println("Errore: uno o più campi non sono stati inseriti o non sono validi!");
		}
		
//		for (int i = 0; i < numeroLibri; i++) {
//			boolean tuttoValido = isEverythingValid(collezioneLibri[i].getTitolo(), collezioneLibri[i].getAutore(), collezioneLibri[i].getEditore());
//			if ()
//			System.out.println("Fa parte della tua collezione: " + collezioneLibri[i].toString());
//		}
		
		inputContainer.close();
		// Chiuso inputContainer
	
	}
		
}
