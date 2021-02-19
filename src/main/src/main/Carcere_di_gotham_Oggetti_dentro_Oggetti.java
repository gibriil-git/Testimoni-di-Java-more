package src.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Carcere_di_gotham_Oggetti_dentro_Oggetti {

public static String[] scannerNewMember() {
	Scanner s = new Scanner(System.in);
	String nome = "";
	String dataCarcerazione = "";
	String dataRilascio = "";
	String ragioniCarcerazione = "";
	String evasione = "";
	String deceduto = "";
	String dataAssunzione = "";
	String dataFineRapporto = "";
	String mansione = "";

	System.out.println("Vuoi inserire un nuovo detenuto[1] o una guardia[2]: ");
	String a = s.nextLine();
	if(a.equals("1")) {
		System.out.println("Inserisci il nome del detenuto: ");
		nome = s.nextLine();
	}
	else{
		System.out.println("Inserisci il nome della guardia: ");
		nome = s.nextLine();
	}

	System.out.println("Inserisci il cognome: ");
	String cognome = s.nextLine();
	System.out.println("Inserisci la data di nascita: ");
	String dataNascita = s.nextLine();
	System.out.println("Inserisci il luogo di nascita: ");
	String luogoNascita = s.nextLine();
	System.out.println("Inserisci la residenza: ");
	String residenza = s.nextLine();
	System.out.println("Ora inserisci i dati per il fascicolo. \nInserisci il nome: ");
	String nomeF = s.nextLine();
	System.out.println("Inserisci il cognome");
	String cognomeF = s.nextLine();
	System.out.println("Inserisci numero ID: ");
	String idNumber = s.nextLine();

	if(a.equals("1")){
		System.out.println("Inserisci la data di carcerazione");
		dataCarcerazione = s.nextLine();
		System.out.println("Inserisci la data di rilascio");
		dataRilascio = s.nextLine();
		System.out.println("Inserisci le ragioni di carcerazione");
		ragioniCarcerazione = s.nextLine();
		System.out.println("Il detenuto e' evaso? [true] [false]");
		evasione = s.nextLine();
		System.out.println("Il detenuto e' deceduto? [true] [false]");
		deceduto = s.nextLine();
	}
	else{
		System.out.println("Inserisci data assunzione: ");
		dataAssunzione = s.nextLine();
		System.out.println("Inserisci data fine contratto: ");
		dataFineRapporto = s.nextLine();
		System.out.println("Inserisci la mansione: ");
		mansione = s.nextLine();
	}


	String[] newMember = {nome, cognome, dataNascita, luogoNascita, residenza,
	nomeF, cognomeF, idNumber, dataCarcerazione, dataRilascio, ragioniCarcerazione, evasione, deceduto,
	dataAssunzione, dataFineRapporto, mansione};

	return newMember;
}



	public static void main(String[] args) {

		ArrayList<Detenuti1> listaDetenuti = new ArrayList<Detenuti1>();
		ArrayList<Guardie1> listaGuardie = new ArrayList<Guardie1>();

		Archivio1 archive = new Archivio1(listaDetenuti, listaGuardie);
		AddObj obj = new AddObj(listaDetenuti, listaGuardie);
		Detenuti1 detenuto = new Detenuti1();
		Guardie1 guardia = new Guardie1();
		Write prisoners = new Write(listaDetenuti, listaGuardie);
		Write guards = new Write(listaDetenuti, listaGuardie);
		Read read = new Read();

//aggiunge gli oggetti alle liste guardie e detenuti
		archive.addObjectsGuards();
		archive.addObjectsPrisoners();

//modifica gli elementi di un oggetto
		//archive.getListaGuardie().set(1, new Guardie1("Bit", "woman", "13-6-78", "Gotham", "Gotham"));

//scrittura su file del DB di guardie e detenuti dal metodo 'addObjectsPrisoners' e 'addObjectsGuards'
		//guards.writeGuardie();
		//prisoners.writeDetenuti();
		//prisoners.writeFascicoloDetenuti();
		//guards.writeFascicoloGuardie();

//ricerca fascicoli x nome
		//detenuto.getFascicoloDetenuto(listaDetenuti, "Joker");
		//guardia.getFascicoloGuardia(listaGuardie, "Bat");

//ricerca dati anagrafici x nome e cognome o solo x cognome
		//archive.searchPrisoner(listaDetenuti, "Jesus", "Christ");
		//archive.searchGuard(listaGuardie, "Bat", "Man");
		//archive.searchPrisoner(listaDetenuti, "Queen")

//Inserimento e scrittura su file nuovi detenuti e guardie da tastiera
		//archive.addNewPrisoner(scannerNewMember());
		//archive.addNewGuard(scannerNewMember());

//Lettura da file
		//read.readPrisoners();
		//read.readGuards();

//Displaying di liste dati anagrafici e fascicoli
		//archive.displayPrisonersList();
		//archive.displayGuardsList();
		//archive.displayFascicoliPrisonersList();
		archive.displayFascicoliGuardsList();
		//archive.riepilogoCarcere(archive.addObjectsPrisoners(), archive.addObjectsGuards());

	}

}
