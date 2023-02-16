package br.com.fiap.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.model.Aluno;
import br.com.fiap.model.Genero;

public class TesteAluno {

	public static void main(String[] args) {
		
		//Instaciando aluno
		Aluno al=new Aluno("Gabriel", 18, Genero.MASCULINO);
		
		//Criando a data de nascimento
		Calendar data = new GregorianCalendar(2004,Calendar.MARCH,30);
		
		//formatando a data de nascimento
		SimpleDateFormat formatado = new SimpleDateFormat("dd/MM/yyyy");
		
		//Exibindo
		System.out.println(al.getNome());
		System.out.println(al.getIdade());
		System.out.println(al.getGenero());
	
		System.out.println();
		
		
		//Verificação
		if (al.getGenero()== Genero.FEMININO) {
			System.out.println("Voce e uma mocinha");
		}else {
			System.out.println("Voce e um mocinho");
		}
		
		System.out.println(al.getGenero().getLabel());
		
		
	

	}

}
