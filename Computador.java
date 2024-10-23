package aula11;

public class Computador {
	private String modelo;
	private Processador processador;
	
	public Computador(String modelo, String processador) {
		this.modelo = modelo;
		this.processador = new Processador("Intel","140");
	}
	public void exibirInfo() {
		System.out.println("Informações muito legais");
	}
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getProcessador() {
		return processador.getFrequencia();
	}
}
