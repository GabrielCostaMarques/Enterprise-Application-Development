package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="")
@SequenceGenerator(sequenceName ="SQ_T_LIVRO",name="livro",allocationSize = 1 )
public class Livro {
	
	@Id
	@Column(name="",precision=5)
	private Integer codigo;
	

}
