package br.com.fiap.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.TipoUsuario;
import br.com.fiap.entity.Usuario;

public class TesteCadastro {
	public static void main(String[] args) {
		//Instanciar o usuário
		
		Usuario u1=new Usuario("Renato Augusto", "123", "123456789", "felipe@gmail.com", 1.8f, TipoUsuario.DEFAULT);
		
		//Criar a fábrica de Entity Manager
		EntityManagerFactory fabrica =Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		//Criar o entity manager utilizando a fabrica
		EntityManager em = fabrica.createEntityManager(); 
		
		//Cadastrar o usuário
		em.persist(u1);
		
		u1.setNome("Maria");
		
		//Transação
		em.getTransaction().begin();
		em.getTransaction().commit();
	}
}
