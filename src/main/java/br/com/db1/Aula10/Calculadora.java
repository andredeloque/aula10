package br.com.db1.Aula10;

public class Calculadora {

	private Double resultado;

	
	public Calculadora(){
		zerarCalculo();
	}
	public void zerarCalculo(){
		resultado = 0d;
	}

	
	public void soma(Double primeiroValor, Double segundoValor){
		resultado = primeiroValor+segundoValor;
	}
	public void subtracao(Double primeiroValor, Double segundoValor){
		resultado = primeiroValor-segundoValor;
	}
	public void divisao(Double primeiroValor, Double segundoValor){
		resultado = primeiroValor/segundoValor;
	}
	public void multiplicacao(Double primeiroValor, Double segundoValor){
		resultado = primeiroValor*segundoValor;
	}
	public Double exibirResultado(){
		return resultado;
	}
}
