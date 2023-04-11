package br.com.fiap.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Usuario;

public class TestePesquisa {
	public static void main(String[] args) {
		//Pesquisar um usuario pela PK
		
		//Criar Fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//Criar o entity Manager
		EntityManager em = fabrica.createEntityManager();
		
		//pesquisar o usuário pela PK
		Usuario user = em.find(Usuario.class, 7); //
		
		
		//Exibir o nome e a PK do usuario
		System.out.println(user.getNome()+" "+user.getCodigo());
		
		//trocando o nome, dando commit
	
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
	}
}
