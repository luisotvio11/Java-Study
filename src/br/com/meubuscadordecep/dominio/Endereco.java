package br.com.meubuscadordecep.dominio;

public class Endereco {
	
	String logradouro;
	String bairro;
	String localidade;
	
	
	public String getLogradouro () {
		
		return logradouro;
	}
	
	public String getbairro () {
			return bairro;
	}
	
	public String getlocalidade () {
		
		return localidade;
	}


		@Override
		public String toString() {
		return "endereco{" + "logradouro=" + logradouro + ", bairro=" + bairro + ", localidade=" + localidade + '}';
}
}