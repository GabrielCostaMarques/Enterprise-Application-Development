package br.com.fiap.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteData {

	public static void main(String[] args) {
		//Criar um objeto do tipo Calendar com a data atual
		Calendar dataHoje = Calendar.getInstance();
		
		//Criar um objeto do tipo Calendar com a data 30/11/2023 uma data específica
		
		Calendar dataEspec = Calendar.getInstance();
		Calendar data = new GregorianCalendar(2023,Calendar.NOVEMBER,30);
		dataEspec.set(2023, Calendar.NOVEMBER, 30);
		
		SimpleDateFormat formatado = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		
		
		
		
		//Exibir a data
		System.out.println(formatado.format(data.getTime()));
		System.out.println(formatado.format(dataEspec.getTime()));
		System.out.println(dataHoje);
		System.out.println(formatador.format(dataHoje.getTime()));
		
	}
}