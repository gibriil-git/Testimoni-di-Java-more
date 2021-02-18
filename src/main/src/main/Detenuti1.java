package src.main;

import java.util.ArrayList;

public class Detenuti1 {

	private String nome;
	private String cognome;
	private String dataNascita;
	private String luogoNascita;
	private String residenza;
	private FascicoloDetenuti1 fascicoloDetenuto;

	public Detenuti1(String nome, String cognome, String dataNascita, String luogoNascita, String residenza) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.residenza = residenza;
		
	}

	public Detenuti1() { }


	@Override
	public String toString() {
		return "nome" + " " + nome + " " + "cognome" + " " + cognome + "  dataNascita " + dataNascita
				+ "  luogoNascita " + luogoNascita + "  residenza " + residenza;
		//+ "  fascicoloDetenuto " + fascicoloDetenuto ;
	}

	// trova il fascicolo del detenuto e lo stampa attraverso metodo 'displayDetenuto'
	public FascicoloDetenuti1 getFascicoloDetenuto() {
		return fascicoloDetenuto;
	}

	public FascicoloDetenuti1 getFascicoloDetenuto(ArrayList<Detenuti1> listaDetenuti, String nome) {
		for (Detenuti1 detenuto : listaDetenuti) {
			if (detenuto.getNome().equals(nome)) {
				detenuto.getFascicoloDetenuto().displayFascicoloDetenuto();
			}
		}
		return fascicoloDetenuto;
	}

	// aggiunge fascicoli detenuti all'oggetto 'Detenuti1', poiche' 'FascicoloDetenuto' e' attributo di 'Detenuti1'
	public void setFascicoloDetenuto(FascicoloDetenuti1 fascicoloDetenuto) {
		this.fascicoloDetenuto = fascicoloDetenuto;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void displayDetenuto() {
		System.out.println(nome + " " + cognome + "\nNato il: " + dataNascita + " a " + luogoNascita + "\nResidente a: " + residenza + "\n");
	}


}
