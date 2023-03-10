package br.com.fiap.view;

import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("CLIENTE_ORACLE"); //fabrica de gerenciador de entidades, analisa a classe para o banco de dados
		
		//Rodando esse main ele cria a tabela no banco de dados
		// O parametro é o nome do banco encontrado no arquivo persistence.xml

	}

}
