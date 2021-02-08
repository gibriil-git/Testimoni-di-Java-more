package src.main;

import java.util.Scanner;

public class Carcere_di_gotham_Oggetti_dentro_Oggetti {

public static String[] scannerNewMember(Boolean prisoner) {
	Scanner s = new Scanner(System.in);
	String nome = "";
	if(prisoner == true) {
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
		Archivio1 archivio = new Archivio1();

		// dati anagrafici
		archivio.addNewPrisoner(scannerNewMember(true));
		archivio.addNewGuard(scannerNewMember(false));
		//Detenuti1 markFisher = new Detenuti1("Mark", "Fisher", "13/7/67", "Gotham", "Gotham");
		//archivio.addPrisoner(markFisher);
		//Detenuti1 philipMiller = new Detenuti1("Philip", "Miller", "13/7/69", "Gotham", "Gotham");
		//archivio.addPrisoner(philipMiller);
		Detenuti1 jesusChrist = new Detenuti1("Jesus", "Christ", "0/0/00", "Gotham", "Gotham");
		archivio.addPrisoner(jesusChrist);
		Detenuti1 jokerJoker = new Detenuti1("Joker", "Joker", "1/1/70", "Gotham", "Gotham");
		archivio.addPrisoner(jokerJoker);
		Detenuti1 arleyQueen = new Detenuti1("Arley", "Queen", "13/11/75", "Gotham", "Gotham");
		archivio.addPrisoner(arleyQueen);
		
		Guardie1 batMan = new Guardie1("Bat", "Man", "12/4/73", "Gotham", "Gotham");
		archivio.addGuard(batMan);
		Guardie1 batGirl = new Guardie1("Bat", "Girl", "11/5/90", "Gotham", "Gotham");
		archivio.addGuard(batGirl);
		Guardie1 robinRobin = new Guardie1("Robin", "Robin", "12/11/80", "Gotham", "Gotham");
		archivio.addGuard(robinRobin);
		Guardie1 joshStiller = new Guardie1("Josh", "Stiller", "1/1/72", "Gotham", "Gotham");
		archivio.addGuard(joshStiller);
		Guardie1 matFooler = new Guardie1("Mat", "Fooler", "2/8/71", "Gotham", "Gotham");
		archivio.addGuard(matFooler);
		
		
		//FASCICOLI 
		//markFisher.setFascicoloDetenuto(new FascicoloDetenuti1("Mark", "Fisher", 001, "12/12/19", "none", "Aggressione", false, false)); 
		//philipMiller.setFascicoloDetenuto(new FascicoloDetenuti1("Philip", "Miller", 002, "12/12/19", "none", "Aggressione", false, true)); 
		jesusChrist.setFascicoloDetenuto(new FascicoloDetenuti1("Jesus", "Christ", 003, "12/12/19", "none", "Aggressione", true, false)); 
		jokerJoker.setFascicoloDetenuto(new FascicoloDetenuti1("Joker", "Joker", 004, "12/12/19", "none", "Aggressione", false, false)); 
		arleyQueen.setFascicoloDetenuto(new FascicoloDetenuti1("Arley", "Queen", 005, "12/12/19", "none", "Aggressione", false, false)); 
		
		batMan.setFascicoloGuardia(new FascicoloGuardie1("Bat", "Man", 001, "12/12/13", "12/12/19", "Secondino")); 
		batGirl.setFascicoloGuardia(new FascicoloGuardie1("Bat", "Girl", 002, "12/11/13", "none", "Secondino")); 
		robinRobin.setFascicoloGuardia(new FascicoloGuardie1("Robin", "Robin", 003, "12/11/13", "none", "Secondino")); 
		joshStiller.setFascicoloGuardia(new FascicoloGuardie1("Josh", "Stiller", 004, "12/11/13", "none", "Secondino")); 
		matFooler.setFascicoloGuardia(new FascicoloGuardie1("Mat", "Fooler", 005, "12/11/13", "none", "Secondino")); 
		
		//markFisher.getFascicoloDetenuto().displayFascicoloDetenuto();  
		//batMan.getFascicoloGuardia().displayFascicoloGuardia();
		//archivio.searchPrisoner("Jesus", "Christ");
		//archivio.searchGuard("Bat", "Man");
		archivio.displayPrisonersList();
		archivio.displayGuardsList();
		//archivio.displayFascicoliPrisonersList();
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