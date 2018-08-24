package br.com.db1.Aula10;

private class Celular {

			private String operadora;
			public String getOperadora() {
				return operadora;
			}
			public void setOperadora(String operadora) {
				this.operadora = operadora;
			}

			private String nome;
			private String marca;
			private Boolean dualChip;
			private Integer tamanhoTela;
			
			
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public String getMarca() {
				return marca;
			}
			public void setMarca(String marca) {
				this.marca = marca;
			}
			public Boolean getDualChip() {
				return dualChip;
			}
			public void setDualChip(Boolean dualChip) {
				this.dualChip = dualChip;
			}
			public Integer getTamanhoTela() {
				return tamanhoTela;
			}
			public void setTamanhoTela(Integer tamanhoTela) {
				this.tamanhoTela = tamanhoTela;
			}
			
			public Boolean  temSinal (){
				 return Boolean.TRUE;
			}
}
