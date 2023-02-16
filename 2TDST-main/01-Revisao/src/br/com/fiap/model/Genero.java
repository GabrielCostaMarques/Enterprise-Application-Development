package br.com.fiap.model;


//Conjunto de constantes
public enum Genero {
	
	
	
	FEMININO("Feminino"),
	MASCULINO("Masculino"), 
	OUTROS("Outros Gêneros");
	
	private String label;
	
	Genero(String label) {
		this.label=label;
	}
	
	public String getLabel() {
		return label;
	}
}
