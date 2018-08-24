package br.com.db1.Aula10;

import java.sql.Date;

public class Pessoa {
	private String nome;
	private Date dataNascimento;
	private Sexo sexo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Enum<Sexo> Sexo (){
	return sexo.MASCULINO;
	}
}