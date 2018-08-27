package br.com.db1.exercicio08;

import br.com.exercicio08.type.TipoLogradouro;

public class Endereco {
private String logradouro;
private Integer cep;
private TipoLogradouro tipologradouro;
public String exibeCep(){
	return "";
}
public String getLogradouro() {
	return logradouro;
}
public void setLogradouro(String logradouro) {
	this.logradouro = logradouro;
}
public Integer getCep() {
	return cep;
}
public void setCep(Integer cep) {
	this.cep = cep;
}
public TipoLogradouro getTipologradouro() {
	return tipologradouro;
}
public void setTipologradouro(TipoLogradouro tipologradouro) {
	this.tipologradouro = tipologradouro;
}

}
