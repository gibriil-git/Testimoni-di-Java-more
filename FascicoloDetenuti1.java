package carcere_di_Gotham_FileReader;

public class FascicoloDetenuti1 {
	
	private String nome;
	private String cognome;
	private int idNumber;
	private String dataCarcerazione;
	private String dataRilascio;
	private String ragioniCarcerazione;
	private boolean evasione;
	private boolean deceduto;


	public FascicoloDetenuti1(String nome, String cognome, int idNumber, String dataCarcerazione, String dataRilascio, String ragioniCarcerazione, 
							 boolean evasione,boolean deceduto) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.idNumber = idNumber;
		this.dataCarcerazione = dataCarcerazione;
		this.dataRilascio = dataRilascio;
		this.ragioniCarcerazione = ragioniCarcerazione;
		this.evasione = evasione;
		this.deceduto = deceduto;
	}

	

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}
	
	public int getIdNumber() {
		return idNumber;
	}

	public String getDataCarcerazione() {
		return dataCarcerazione;
	}


	public String getDataRilascio() {
		return dataRilascio;
	}


	public String getRagioniCarcerazione() {
		return ragioniCarcerazione;
	}


	public boolean isEvasione() {
		return evasione;
	}


	public boolean isDeceduto() {
		return deceduto;
	}


	public void displayFascicoloDetenuto() {
		System.out.println(nome + " " + cognome + "\nID Number: " + idNumber + "\nData Carcerazione: " + dataCarcerazione 
							+ "\nData Rilascio: " + dataRilascio + "\nRagioni Carcerazione: " + ragioniCarcerazione 
							+ "\nEvaso: " + evasione + "\nDeceduto: " + deceduto+ "\n");
				}


}
