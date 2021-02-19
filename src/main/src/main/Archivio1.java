package src.main;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Archivio1 {

	protected ArrayList<Detenuti1> listaDetenuti;
	protected ArrayList<Guardie1> listaGuardie;


	public Archivio1(ArrayList<Detenuti1> listaDetenuti, ArrayList<Guardie1> listaGuardie) {
		this.listaDetenuti = listaDetenuti;
		this.listaGuardie = listaGuardie;

	}

	public Archivio1() {

	}

	public ArrayList<Detenuti1> getListaDetenuti() {
		return listaDetenuti;
	}

	public ArrayList<Guardie1> getListaGuardie() {
		return listaGuardie;
	}

	public void setListaDetenuti(ArrayList<Detenuti1> listaDetenuti) {
		this.listaDetenuti = listaDetenuti;
	}

	public void setListaGuardie(ArrayList<Guardie1> listaGuardie) {
		this.listaGuardie = listaGuardie;
	}

	//aggiunge e scrive su file dati anagrafici e fascicoli nuovi detenuti da tastiera
	public void addNewPrisoner(String[] newMember) {
		Detenuti1 detenuto = new Detenuti1();
		int id = Integer.parseInt(newMember[7]);
		boolean evasione = Boolean.parseBoolean(newMember[11]);
		boolean deceduto = Boolean.parseBoolean(newMember[12]);

		try (FileWriter fas = new FileWriter("detenuti.txt", true);
			PrintWriter fos = new PrintWriter(fas)) {

			detenuto = new Detenuti1(newMember[0], newMember[1],
					newMember[2], newMember[3], newMember[4]);
			this.listaDetenuti.add(detenuto);
			fos.println(detenuto.toString());
			System.out.println("Object written onto the file");

		} catch (NoSuchElementException | IOException e) {
			System.out.println("ops");
		}

		try (FileWriter fas = new FileWriter("FascicoliDetenuti.txt", true);
			 PrintWriter fos = new PrintWriter(fas)) {

			detenuto.setFascicoloDetenuto(new FascicoloDetenuti1(newMember[5], newMember[6], id,
					newMember[8], newMember[9], newMember[10], evasione, deceduto));
			fos.println(detenuto.getFascicoloDetenuto().toString());

			System.out.println("Object written onto the file");

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}


	//aggiunge e scrive su file dati anagrafici e fascicoli nuove guardie da tastiera
	public void addNewGuard(String[] newMember) {
		Guardie1 guardia = new Guardie1();
		int id = Integer.parseInt(newMember[7]);
		try (FileWriter fas = new FileWriter("guardie.txt", true);
			PrintWriter fos = new PrintWriter(fas)) {

			guardia = new Guardie1(newMember[0], newMember[1],
					newMember[2], newMember[3], newMember[4]);

			this.listaGuardie.add(guardia);

			fos.println(guardia.toString());
			System.out.println("Object written onto the file");

		} catch (NoSuchElementException | IOException ex) {
			System.out.println("ops");
		}

		try (FileWriter fas = new FileWriter("FascicoliGuardie.txt", true);
			 PrintWriter fos = new PrintWriter(fas)) {
			guardia.setFascicoloGuardia(new FascicoloGuardie1(newMember[5], newMember[6], id,
					newMember[13], newMember[14], newMember[15]));
			fos.println(guardia.getFascicoloGuardia().toString());

			System.out.println("Object written onto the file");

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}


	//aggiunge dati anagrafici prigionieri alla lista
	public void addPrisoner(Detenuti1 detenuto) {
		this.listaDetenuti.add(detenuto);
	}

	//aggiunge dati anagrafici guardie alla lista
	public void addGuard(Guardie1 guardia) {
		this.listaGuardie.add(guardia);
	}

	// ricerca dati anagrafici x nome e cognome
	public void searchPrisoner(ArrayList<Detenuti1> listaDetenuti, String nome, String cognome) {
		for (Detenuti1 detenuti : listaDetenuti) {
			if (detenuti.getNome().equals(nome) & detenuti.getCognome().equals(cognome)) {
				detenuti.displayDetenuto();
			}
		}
	}

	public void searchGuard(ArrayList<Guardie1> listaGuardie, String nome, String cognome) {
		for (Guardie1 guardie : listaGuardie) {
			if (guardie.getNome().equals(nome) & guardie.getCognome().equals(cognome)) {
				guardie.displayGuardia();
			}
		}
	}

	// ricerca dati anagrafici x cognome
	public void searchPrisoner(String cognome) {
		for (Detenuti1 detenuti : listaDetenuti) {
			if (detenuti.getCognome().equals(cognome)) {
				detenuti.displayDetenuto();
			}
		}
	}

	public void searchGuard(String cognome) {
		for (Guardie1 guardie : listaGuardie) {
			if (guardie.getCognome().equals(cognome)) {
				guardie.displayGuardia();
			}
		}
	}

	public void displayPrisonersList() {
		for (Detenuti1 detenuti : listaDetenuti) {
			detenuti.displayDetenuto();
		}
	}

	public void displayGuardsList() {
		for (Guardie1 guardie : listaGuardie) {
			guardie.displayGuardia();
		}
	}

	public void displayFascicoliPrisonersList() {
		for (Detenuti1 detenuti : listaDetenuti) {
			detenuti.getFascicoloDetenuto().displayFascicoloDetenuto();
			;
		}
	}

	public void displayFascicoliGuardsList() {
		for (Guardie1 guardie : listaGuardie) {
			guardie.getFascicoloGuardia().displayFascicoloGuardia();
		}
	}


	public void riepilogoCarcere(ArrayList<Detenuti1> listaDetenuti, ArrayList<Guardie1> listaGuardie) {

		int i = 0, y = 0, z = 0, x = 0;

		for (Detenuti1 fascicoliDetenuti : listaDetenuti) {
			y++;
			if (fascicoliDetenuti.getFascicoloDetenuto().isDeceduto() == true) {
				y--;
				z++;
			}
			if (fascicoliDetenuti.getFascicoloDetenuto().isEvasione() == true) {
				y--;
				x++;
			}
		}
		System.out.println("Totale detenuti presenti: " + y + "\nTotale detenuti deceduti: " + z + "\nTotale evasi: " + x);

		for (Guardie1 fascicoliGuardie : listaGuardie) {
			i++;
			if (!fascicoliGuardie.getFascicoloGuardia().getDataFineRapporto().equals("none")) {
				i--;
			}
		}
		System.out.println("Totale Guardie presenti: " + i);
	}


	public ArrayList<Detenuti1> addObjectsPrisoners() {
		Archivio1 archivio = new Archivio1(listaDetenuti, listaGuardie);

		// inserimento dati anagrafici detenuti nella lista
		Detenuti1 markFisher = new Detenuti1("Mark", "Fisher", "13/7/67", "Gotham", "Gotham");
		archivio.addPrisoner(markFisher);
		Detenuti1 philipMiller = new Detenuti1("Philip", "Miller", "13/7/69", "Gotham", "Gotham");
		archivio.addPrisoner(philipMiller);
		Detenuti1 jesusChrist = new Detenuti1("Jesus", "Christ", "0/0/00", "Gotham", "Gotham");
		archivio.addPrisoner(jesusChrist);
		Detenuti1 jokerJoker = new Detenuti1("Joker", "Joker", "1/1/70", "Gotham", "Gotham");
		archivio.addPrisoner(jokerJoker);
		Detenuti1 arleyQueen = new Detenuti1("Arley", "Queen", "13/11/75", "Gotham", "Gotham");
		archivio.addPrisoner(arleyQueen);


		//inserimento FASCICOLI detenuti nella lista
		markFisher.setFascicoloDetenuto(new FascicoloDetenuti1("Mark", "Fisher", 001, "12/12/19", "none", "Aggressione", false, false));
		philipMiller.setFascicoloDetenuto(new FascicoloDetenuti1("Philip", "Miller", 002, "12/12/19", "none", "Aggressione", false, true));
		jesusChrist.setFascicoloDetenuto(new FascicoloDetenuti1("Jesus", "Christ", 003, "12/12/19", "none", "Aggressione", true, false));
		jokerJoker.setFascicoloDetenuto(new FascicoloDetenuti1("Joker", "Joker", 004, "12/12/19", "none", "Aggressione", false, false));
		arleyQueen.setFascicoloDetenuto(new FascicoloDetenuti1("Arley", "Queen", 005, "12/12/19", "none", "Aggressione", false, false));

		return listaDetenuti;
	}

	public ArrayList<Guardie1> addObjectsGuards() {
		Archivio1 archivio = new Archivio1(listaDetenuti, listaGuardie);

		//  inserimento dati anagrafici guardie nella lista
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

		//inserimento FASCICOLI guardie nella lista
		batMan.setFascicoloGuardia(new FascicoloGuardie1("Bat", "Man", 001, "12/12/13", "12/12/19", "Secondino"));
		batGirl.setFascicoloGuardia(new FascicoloGuardie1("Bat", "Girl", 002, "12/11/13", "none", "Secondino"));
		robinRobin.setFascicoloGuardia(new FascicoloGuardie1("Robin", "Robin", 003, "12/11/13", "none", "Secondino"));
		joshStiller.setFascicoloGuardia(new FascicoloGuardie1("Josh", "Stiller", 004, "12/11/13", "none", "Secondino"));
		matFooler.setFascicoloGuardia(new FascicoloGuardie1("Mat", "Fooler", 005, "12/11/13", "none", "Secondino"));

		return listaGuardie;
	}
}


/*- il numero delle guardie,
- il numero di detenuti totali,
- il numero di detenuti evasi,
- il numero di detenuti deceduti all’interno della struttura.
*/