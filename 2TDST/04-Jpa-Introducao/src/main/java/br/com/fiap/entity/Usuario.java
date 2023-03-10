package br.com.fiap.entity;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity //se anotado todos códigos escritos seriam aplicados no banco, use apenas @Column para alterar os parâmetros
@Table(name="T_USUARIO")
//sequenceName -> nome da sq no Banco, name-> usado generator, allocationSize -> incremento para ir na ordem 1,2,3,4 
@SequenceGenerator(sequenceName = "SQ_T_USUARIO", name="churros", allocationSize = 1)
public class Usuario {

	//@Column serve para poder mudar os parâmetros como é feito abaixo
	
	@Id	
	@Column(name="cd_usuario")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "churros")
	private int codigo;
	
	@Column(name="nm_usuario", nullable = false, length = 30)//length na modelagem do data modeler ficaria nm_usuario varchar2(30)
	private String nome;
	
	@Column(name="vl_senha", nullable = false, length = 20)//nullable : false, ele é não obrigatório
	private String senha;
	
	@Temporal(TemporalType.TIMESTAMP) //Grava data e hora no banco
	@Column(name="dt_criacao", nullable = false, updatable = false)
	private Calendar dataCriacao;
	
	@Column(name="nr_cpf", length = 11, updatable = false)//updatable serve para que o usuário não possa atualizar o campo 
	private String cpf;
	
	@Column(name="ds_email", nullable = false, length = 30)
	private String email;
	
	@Column(name="vl_altura", precision = 3 , scale = 2)// precision siginfica que eu quero 3 números para o tamanho e scale são quantos números antes da virgula, 0,00
	private Float altura;
	
	@Transient //Não será uma coluna na tabela
	private String token;
	
	@Lob //Mapeia um campo do tipo BLOB, que recebe arquivos (foto)
	@Column(name="fl_foto")
	private byte[] foto;
	
	@Enumerated(EnumType.STRING)//Grava o texto da constante e não a posicao  admin (ADMIN) ou seja ele grava uma string no banco enves de um número ordenal
	@Column(name="ds_tipo", length = 20)
	private TipoUsuario tipo;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
	
}



