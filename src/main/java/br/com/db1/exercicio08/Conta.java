package br.com.db1.exercicio08;

public abstract class Conta {

	private Integer numero;
	private String digitoVerificador;
	private Pessoa pessoa;
	private Agencia agencia;
	private Banco banco;
	public Conta (Pessoa pessoa, Agencia agencia){
		this.pessoa = pessoa;
		this.agencia = agencia;
	}
	
	public void calculaDigitoVerificador(){
		
	}
	public void validarDigitoVerificador(){
		
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
}

