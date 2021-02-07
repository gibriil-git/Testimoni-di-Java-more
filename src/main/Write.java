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

	public static void main(String[] args) {
		
		Detenuti1 markFisher = new Detenuti1("Mark", "Fisher", "13/7/67", "Gotham", "Gotham");
		Detenuti1 philipMiller = new Detenuti1("Philip", "Miller", "13/7/69", "Gotham", "Gotham");
		Detenuti1 markFisherbis = new Detenuti1("Mark",  "Miller", "13/8/99", "firenze", "Gotham");
		//Detenuti1 philipMiller = new Detenuti1("Philip", 11);
		
		try(FileWriter fas = new FileWriter("archivio/detenuti.txt", true); 
				PrintWriter fos = new PrintWriter(fas)){
			
				fos.println(markFisher.toString());
				fos.println(philipMiller.toString());
				fos.println(markFisherbis.toString());
				System.out.println("Object written onto the file");
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
		
		ArrayList<String> nome = new ArrayList<String>();
		ArrayList<String> cognome = new ArrayList<String>();

		
		try(FileReader reader = new FileReader("archivio/detenuti.txt"); 
				Scanner c = new Scanner(reader)){
			while(c.hasNext()) {
				if(c.next().equals("nome")) {
					nome.add(c.next());
				}
				if(c.next().equals("cognome")) {
					cognome.add(c.next());
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
		
		System.out.println(nome.toString());
		
		System.out.println(cognome.toString());

		
		
		
		
		
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
		}*/
	}
}

