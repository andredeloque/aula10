package br.com.db1.exercicio08;

import java.util.Date;
import java.util.List;

public abstract class Pessoa {

	private String nome;
	
	private Date dataDanscimento;
	
	private List <Endereco> enderecos;
	
	private List<Telefone> telefones;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDanscimento() {
		return dataDanscimento;
	}

	public void setDataDanscimento(Date dataDanscimento) {
		this.dataDanscimento = dataDanscimento;
	}
	
	public void addEndereco(Endereco endereco){
		this.enderecos.add(endereco);
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void addTelefone (Telefone telefone){
		this.telefones.add(telefone);
	}
}
