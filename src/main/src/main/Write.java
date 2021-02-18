package src.main;

import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

public class Write extends Archivio1{

	public Write(ArrayList<Detenuti1> listaDetenuti, ArrayList<Guardie1> listaGuardie) {
		super(listaDetenuti, listaGuardie);
	}

	public static void writeDetenuti(ArrayList<Detenuti1> listaDetenuti) {

		//aggiungiamo i detenuti al file di testo per creare un database
		for (Detenuti1 detenuto : listaDetenuti) {
			try (FileWriter fas = new FileWriter("detenuti.txt", true);
				 PrintWriter fos = new PrintWriter(fas)) {
				fos.println(detenuto.toString());

				System.out.println("Object written onto the file");

			} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException");
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}

		//aggiungiamo le guardie al file di testo per creare un database
	public static void writeGuardie(ArrayList<Guardie1> listaGuardie) {

		for (Guardie1 guardia : listaGuardie) {

			try (FileWriter fas = new FileWriter("guardie.txt", true);
				 PrintWriter fos = new PrintWriter(fas)) {
				fos.println(guardia.toString());

				System.out.println("Object written onto the file");

			} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException");
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}

	public static void writeFascicoloDetenuti(ArrayList<Detenuti1> listaDetenuti) {

		//aggiungiamo i Fascicoli detenuti al file di testo per creare un database
		for (Detenuti1 detenuto : listaDetenuti) {
			try (FileWriter fas = new FileWriter("FascicoliDetenuti.txt", true);
				 PrintWriter fos = new PrintWriter(fas)) {
				fos.println(detenuto.getFascicoloDetenuto().toString());

				System.out.println("Object written onto the file");

			} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException");
			} catch (IOException e) {
				System.out.println("IOException");
			}
		}
	}

	public static void writeFascicoloGuardie(ArrayList<Guardie1> listaGuardie) {

		//aggiungiamo i fascicoli delle guardie al file di testo per creare un database
		for (Guardie1 guardia : listaGuardie) {
			try (FileWriter fas = new FileWriter("FascicoliGuardie.txt", true);
				 PrintWriter fos = new PrintWriter(fas)) {
				fos.println(guardia.getFascicoloGuardia().toString());

				System.out.println("Object written onto the file");

			} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException");
			} catch (IOException e) {
				System.out.println("IOException");
			}
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

