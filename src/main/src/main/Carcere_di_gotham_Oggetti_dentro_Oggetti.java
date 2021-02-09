package src.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Carcere_di_gotham_Oggetti_dentro_Oggetti {

public static String[] scannerNewMember() {
	Scanner s = new Scanner(System.in);
	System.out.println("Vuoi inserire un nuovo detenuto[1] o una guardia[2]: ");

	String nome = "";
	if(s.nextLine().equals("1")) {
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

	String[] newMember = {nome, cognome, dataNascita, luogoNascita, residenza};

	return newMember;
}



	public static void main(String[] args) {

		ArrayList<Detenuti1> listaDetenuti = new ArrayList<Detenuti1>();
		ArrayList<Guardie1> listaGuardie = new ArrayList<Guardie1>();

		Archivio1 archive = new Archivio1(listaDetenuti, listaGuardie);
		AddObj obj = new AddObj(listaDetenuti, listaGuardie);


		//markFisher.getFascicoloDetenuto().displayFascicoloDetenuto();  
		//batMan.getFascicoloGuardia().displayFascicoloGuardia();
		//archivio.searchPrisoner("Jesus", "Christ");
		//archivio.searchGuard("Bat", "Man");

		//archivio.addNewPrisoner(scannerNewMember());
		//archivio.addNewGuard(scannerNewMember());

		/*Write prisoners = new Write();
		Write guards = new Write();
		guards.writeGuardie();
		prisoners.writeDetenuti();*/

		/*
		Read read = new Read();
		read.readPrisoners();
		read.readGuards();
		*/

		archive.displayPrisonersList(obj.addObjectsPrisoners());
		archive.displayGuardsList(obj.addObjectsGuards());
		archive.displayFascicoliPrisonersList();
		//archivio.displayFascicoliGuardsList();
		//archivio.riepilogoCarcere();
		
		
		
		//Inserimento nuovi detenuti e guardie da tastiera
		//Detenuti1 Freezer = new Detenuti1();
		//archivio.addNewPrisoner(Freezer);
		//Guardie1 waterMan = new Guardie1();
		//archivio.addNewGuard(waterMan);
		//archivio.displayPrisonersList();
		//archivio.displayGuardsList();
		
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