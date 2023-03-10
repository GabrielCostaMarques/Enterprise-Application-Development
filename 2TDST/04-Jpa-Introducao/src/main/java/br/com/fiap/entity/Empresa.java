package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="T_EMPRESA")
@SequenceGenerator(sequenceName = "SQ_T_EMPRESA", name="pizza",allocationSize = 1)
public class Empresa {
	
	@Id
	@Column(name="cd_empresa")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pizza")
	private Integer codigo;
	
	@Column(name="nm_empresa", length=20)
	private String empresa;
	
	@Column(name="nm_cnpj", length=14)
	private String cnpj;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_fundacao")
	private Calendar dataFundacao;
	
	@Column(name="nr_funcionarios", nullable = false, length=5)
	private Integer funcionarios;
	
	@Column(name="ds_email", length=50)
	private String email;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_status", nullable = false,length=10)
	private TipoEmpresa status;
	
	@Column(name="fl_logo", nullable = false)
	private byte[]foto;
	
	@Column(name="vl_faturamento", nullable = false,precision=10, scale=2)
	private Double faturamento;
	
	@Column(name="ds_estatal", nullable = false,length=1)
	private Boolean estatal;
	
	
	
	@Transient
	private int anoFuncionamento;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Calendar getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Calendar dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoEmpresa getStatus() {
		return status;
	}

	public void setStatus(TipoEmpresa status) {
		this.status = status;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(Double faturamento) {
		this.faturamento = faturamento;
	}

	public boolean isEstatal() {
		return estatal;
	}

	public void setEstatal(boolean estatal) {
		this.estatal = estatal;
	}

	public int getAnoFuncionamento() {
		return anoFuncionamento;
	}

	public void setAnoFuncionamento(int anoFuncionamento) {
		this.anoFuncionamento = anoFuncionamento;
	}
	
	
}
