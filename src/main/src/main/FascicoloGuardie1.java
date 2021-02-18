package src.main;

public class FascicoloGuardie1 {
	
	private String nome;
	private String cognome;
	private int idNumber;
	private String dataAssunzione;
	private String dataFineRapporto;
	private String mansione;
	
	
	public FascicoloGuardie1(String nome, String cognome, int idNumber, String dataAssunzione, String dataFineRapporto, String mansione) {
		this.nome = nome;
		this.cognome = cognome;
		this.idNumber = idNumber;
		this.dataAssunzione = dataAssunzione;
		this.dataFineRapporto = dataFineRapporto;
		this.mansione = mansione;
		
	}

	@Override
	public String toString() {
		return "Fascicolo Guardia " +
				"nome '" + nome + '\'' +
				", cognome '" + cognome + '\'' +
				", idNumber " + idNumber +
				", dataAssunzione '" + dataAssunzione + '\'' +
				", dataFineRapporto '" + dataFineRapporto + '\'' +
				", mansione '" + mansione + '\'' ;
	}

	public String getDataFineRapporto() {
		return dataFineRapporto;
	}

	public void displayFascicoloGuardia() {
		System.out.println(nome + " " + cognome + "\nID Number: " + idNumber + "\nData Assunzione: " + dataAssunzione 
							+ "\nData Fine Rapporto: " + dataFineRapporto + "\nMansione: " + mansione + "\n" );
	}
}
