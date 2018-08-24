package br.com.db1.Aula10;

public class Calculadora {

	private Double resultado;
	private Double primeiroValor;
	private Double segundoValor;
	
	public Calculadora(){
		zerarCalculo();
	}
	public void zerarCalculo(){
		resultado = 0d;
	}
	public Double getResultado() {
		return resultado;
	}
	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	public Double getPrimeiroValor() {
		return primeiroValor;
	}
	public void setPrimeiroValor(Double primeiroValor) {
		this.primeiroValor = primeiroValor;
	}
	public Double getSegundoValor() {
		return segundoValor;
	}
	public void setSegundoValor(Double segundoValor) {
		this.segundoValor = segundoValor;
	}
	
	public Double soma(Double primeiroValor, Double segundoValor){
		resultado = primeiroValor+segundoValor;
		return resultado;
	}
	public Double subtracao(Double primeiroValor, Double segundoValor){
		resultado = primeiroValor-segundoValor;
		return resultado;
	}
	public Double divisao(Double primeiroValor, Double segundoValor){
		resultado = primeiroValor/segundoValor;
		return resultado;
	}
	public Double multiplicacao(Double primeiroValor, Double segundoValor){
		resultado = primeiroValor*segundoValor;
		return resultado;
	}
	public Double exibirResultado(){
		return resultado;
	}
}
