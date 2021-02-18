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


//Inserimento e scrittura su file del DB di guardie e detenuti dal metodo 'addObjectsPrisoners' e 'addObjectsGuards'
		Write prisoners = new Write(listaDetenuti, listaGuardie);
		Write guards = new Write(listaDetenuti, listaGuardie);
		//guards.writeGuardie(archive.addObjectsGuards());
		//prisoners.writeDetenuti(archive.addObjectsPrisoners());
		//prisoners.writeFascicoloDetenuti(archive.addObjectsPrisoners());
		//guards.writeFascicoloGuardie(archive.addObjectsGuards());

//ricerca fascicoli x nome
		Detenuti1 detenuto = new Detenuti1();
		Guardie1 guardia = new Guardie1();
		//detenuto.getFascicoloDetenuto(archive.addObjectsPrisoners(), "Joker");
		//guardia.getFascicoloGuardia(archive.addObjectsGuards(), "Bat");
		//archive.searchPrisoner(archive.addObjectsPrisoners(), "Jesus", "Christ");
		//archive.searchGuard(archive.addObjectsGuards(), "Bat", "Man");

//Inserimento e scrittura su file nuovi detenuti e guardie da tastiera
		//archive.addNewPrisoner(scannerNewMember());
		//archive.addNewGuard(scannerNewMember());

//Lettura da file

		Read read = new Read();
		//read.readPrisoners();
		//read.readGuards();

//Displaying di liste dati anagrafici e fascicoli
		//archive.displayPrisonersList(archive.addObjectsPrisoners());
		//archive.displayGuardsList(archive.addObjectsGuards());
		//archive.displayFascicoliPrisonersList(archive.addObjectsPrisoners());
		//archive.displayFascicoliGuardsList(archive.addObjectsGuards());
		//archive.riepilogoCarcere(archive.addObjectsPrisoners(), archive.addObjectsGuards());

	}

}
/*
Il carcere di Gotham City
Sei appena stato nominato direttore presso il carcere di Gotham City.
Hai l'arduo compito di scrivere un programma che gestisca:
- I dati anagrafici delle guardie
- I dati anagrafici dei detenuti
- I fascicoli personali dei detenuti, che devono contenere almeno queste informazioni:
    - Un identificativo del criminale
    - La data di carcerazione
    - La data di scarcerazione
    - Il crimine commesso
Visto che sei tu il capo, decidi se usare lo stesso oggetto per gestire sia le guardie che i criminali.
In ogni caso dovrai definire la banca dati della prigione: crea un array di guardie, uno di detenuti e uno per i fascicoli.
Prevedi la possibilià di:
  - Assumere nuove guardie
  - Schedare nuovi carcerati
  - Aggiungere nuovi fascicoli
  - Visualizzare l'elenco per ciascuna categoria (guardie, criminali, fascicoli)
  - Effettuare ricerche nei fascicoli per nome del detenuto
Nel carcere di Gothma City non tutti i detenuti arrivano alla data di scarcerazione,
gestisci l’eventualità in cui un detenuto sia evaso e quella in cui sia deceduto.
Scrivi una funzione di riepilogo dell'andamento del carcere e che stampi:
  - il numero delle guardie,
  - il numero di detenuti totali,
  - il numero di detenuti evasi,
  - il numero di detenuti deceduti all’interno della struttura.

*/