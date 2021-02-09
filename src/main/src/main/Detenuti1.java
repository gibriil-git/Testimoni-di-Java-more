package src.main;

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



	public Detenuti1() {
		// TODO Auto-generated constructor stub
	}

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
	// aggiunge fascicoli detenuti all'oggetto 'Detenuti1', poiche' 'FascicoloDetenuto' e' attributo di 'Detenuti1'
	public void setFascicoloDetenuto(FascicoloDetenuti1 fascicoloDetenuto) {
		this.fascicoloDetenuto = fascicoloDetenuto;
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

	public void displayDetenuto() {
		System.out.println(nome + " " + cognome + "\nNato il: " + dataNascita + " a " + luogoNascita + "\nResidente a: " + residenza + "\n");
	}
	

}
