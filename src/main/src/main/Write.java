package src.main;

import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

public class Write {

	public static void writeDetenuti() {
		//aggiungiamo i detenuti al file di testo per creare un database
		Detenuti1 markFisher = new Detenuti1("Mark", "Fisher", "13/7/67", "Gotham", "Gotham");
		Detenuti1 philipMiller = new Detenuti1("Philip", "Miller", "13/7/69", "Gotham", "Gotham");
		Detenuti1 jesusChrist = new Detenuti1("Jesus", "Christ", "0/0/00", "Gotham", "Gotham");
		Detenuti1 jokerJoker = new Detenuti1("Joker", "Joker", "1/1/70", "Gotham", "Gotham");
		Detenuti1 arleyQueen = new Detenuti1("Arley", "Queen", "13/11/75", "Gotham", "Gotham");


		try (FileWriter fas = new FileWriter("detenuti.txt", true);
			 PrintWriter fos = new PrintWriter(fas)) {
			fos.println(markFisher.toString());
			fos.println(philipMiller.toString());
			fos.println(jesusChrist.toString());
			fos.println(jokerJoker.toString());
			fos.println(arleyQueen.toString());

			System.out.println("Object written onto the file");

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
		/*
		ArrayList<String> nomeDetenuto = new ArrayList<String>();
		ArrayList<String> cognomeDetenuto = new ArrayList<String>();

		try(FileReader reader = new FileReader("detenuti.txt");
				Scanner c = new Scanner(reader)){
			while(c.hasNext()) {
				if(c.next().equals("nome")) {
					nomeDetenuto.add(c.next());
				}
				if(c.next().equals("cognome")) {
					cognomeDetenuto.add(c.next());
				}
				else {
					System.out.println();
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(nomeDetenuto.toString());
		System.out.println(cognomeDetenuto.toString());
*/
		//aggiungiamo le guardie al file di testo per creare un database
		public static void writeGuardie () {

			Guardie1 batMan = new Guardie1("Bat", "Man", "12/4/73", "Gotham", "Gotham");
			Guardie1 batGirl = new Guardie1("Bat", "Girl", "11/5/90", "Gotham", "Gotham");
			Guardie1 robinRobin = new Guardie1("Robin", "Robin", "12/11/80", "Gotham", "Gotham");
			Guardie1 joshStiller = new Guardie1("Josh", "Stiller", "1/1/72", "Gotham", "Gotham");
			Guardie1 matFooler = new Guardie1("Mat", "Fooler", "2/8/71", "Gotham", "Gotham");


			try (FileWriter fas = new FileWriter("guardie.txt", true);
				 PrintWriter fos = new PrintWriter(fas)) {
				fos.println(batMan.toString());
				fos.println(batGirl.toString());
				fos.println(robinRobin.toString());
				fos.println(joshStiller.toString());
				fos.println(matFooler.toString());

				System.out.println("Object written onto the file");

			} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException");
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}

/*
		ArrayList<String> nomeGuardia = new ArrayList<String>();
		ArrayList<String> cognomeGuardia = new ArrayList<String>();

		try(FileReader reader = new FileReader("detenuti.txt");
			Scanner c = new Scanner(reader)){
			while(c.hasNext()) {
				if(c.next().equals("nome")) {
					nomeGuardia.add(c.next());
				}
				if(c.next().equals("cognome")) {
					cognomeGuardia.add(c.next());
				}
				else {
					System.out.println();
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(nomeGuardia.toString());
		System.out.println(cognomeGuardia.toString());
		/*
		try(FileOutputStream fos = new FileOutputStream("archivio/detenuti.dat")){
			try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
				obj.writeObject(markFisher);
				obj.writeObject(philipMiller);
				System.out.println("Object written onto the file");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}*/
}

