package src.main;

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

	// aggiunge fascicoli guardie all'oggetto 'Guardie1', poiche' 'FascicoloGuardia' e' attributo di 'Guardie1'
	public void setFascicoloGuardia(FascicoloGuardie1 fascicoloGuardia) {
		this.fascicoloGuardia = fascicoloGuardia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	
	public String getResidenza() {
		return residenza;
	}

	public void setResidenza(String residenza) {
		this.residenza = residenza;
	}
	
	public void displayGuardia() {
		System.out.println(nome + " " + cognome + "\nNato il: " + dataNascita + " a " + luogoNascita + "\nResidente a: " + residenza+ "\n");
	}
	
}
