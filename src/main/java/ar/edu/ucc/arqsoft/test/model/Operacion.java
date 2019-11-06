package ar.edu.ucc.arqsoft.test.model;

public enum Operacion {
	CREDITO("Credito"), DEBITO("Debito");
	
	private String label;

	public String getLabel() {
		return label;
	}

	private Operacion(String label) {
		this.label = label;
	}
}