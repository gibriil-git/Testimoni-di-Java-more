package src.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Read {
	private ArrayList<String> nomeGuardia = new ArrayList<String>();
	private ArrayList<String> cognomeGuardia = new ArrayList<String>();
	private ArrayList<String> nomeDetenuto = new ArrayList<String>();
	private ArrayList<String> cognomeDetenuto = new ArrayList<String>();
	private ArrayList<Detenuti1> listaDetenuti = new ArrayList<Detenuti1>();

	public Read() {
		this.nomeGuardia = nomeGuardia;
		this.cognomeGuardia = cognomeGuardia;
		this.nomeDetenuto = nomeDetenuto;
		this.cognomeDetenuto = cognomeDetenuto;
	}

	public void readPrisoners() {
		try(FileReader reader = new FileReader("detenuti.txt");
			Scanner c = new Scanner(reader)){
			while(c.hasNext()) {
				int i = 0;
				while (i < 10) {
					if (i == 1 || i == 3 || i == 5 || i == 7 ) {
						System.out.print(c.next() + "\n");
						i++;
					}else if(i == 9){
						System.out.print(c.next() + "\n\n");
						i++;
					} else {
						System.out.print(c.next() + " ");
						i++;
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public void readGuards() {
		try(FileReader reader = new FileReader("guardie.txt");
			Scanner c = new Scanner(reader)){
			while(c.hasNext()) {
				int i = 0;
				while (i < 10) {
					if (i == 1 || i == 3 || i == 5 || i == 7 ) {
						System.out.print(c.next() + "\n");
						i++;
					}else if(i == 9){
						System.out.print(c.next() + "\n\n");
						i++;
					} else {
						System.out.print(c.next() + " ");
						i++;
					}

				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

/*
	public void readGuards() {

		try(FileReader reader = new FileReader("guardie.txt");
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
	}
*/
}
