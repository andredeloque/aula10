package br.com.db1.exercicio08;

public class Telefone {
	
	private Integer ddd;
	private Integer numero;
	
	public String exivirTelefoneFormatado(){
		return "("+ ddd +")"+ numero;
	}
}
