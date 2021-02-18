package src.main;

import java.util.ArrayList;

public class Guardie1{

	private String nome;
	private String cognome;
	private String dataNascita;
	private String luogoNascita;
	private String residenza;
	private FascicoloGuardie1 fascicoloGuardia;

	public Guardie1(String nome, String cognome, String dataNascita, String luogoNascita, String residenza) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.residenza = residenza;
	}

	public Guardie1() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	@Override
	public String toString() {
		return "nome" + " " + nome + " " + "cognome" + " " + cognome + "  dataNascita " + dataNascita
				+ "  luogoNascita " + luogoNascita + "  residenza " + residenza;
		//+ "  fascicoloDetenuto " + fascicoloDetenuto ;
	}

	// trova il fascicolo della guardia e lo stampa attraverso metodo 'displayGuardia'
	public FascicoloGuardie1 getFascicoloGuardia() {
		return fascicoloGuardia;
	}

	public FascicoloGuardie1 getFascicoloGuardia(ArrayList<Guardie1> listaGuardie, String nome) {
		for (Guardie1 guardia : listaGuardie) {
			if (guardia.getNome().equals(nome)) {
				guardia.getFascicoloGuardia().displayFascicoloGuardia();
			}
		}
		return fascicoloGuardia;
	}

	// aggiunge fascicoli guardie all'oggetto 'Guardie1', poiche' 'FascicoloGuardia' e' attributo di 'Guardie1'
	public void setFascicoloGuardia(FascicoloGuardie1 fascicoloGuardia) {
		this.fascicoloGuardia = fascicoloGuardia;
	}

	
	public void displayGuardia() {
		System.out.println(nome + " " + cognome + "\nNato il: " + dataNascita + " a " + luogoNascita + "\nResidente a: " + residenza+ "\n");
	}
	
}
