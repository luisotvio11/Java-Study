package classe;

public class data {
	
	
	
		data (int datainicial) {
			
			dia = datainicial;
		}
	
		
		data () {
			
			dia = 01;
			mes = 01;
			ano = 1970;
			
		}
	
		int dia;
		int mes;
		int ano;
		
		String obterData () {
			
			
			return String.format("%d/%d/%d", dia, mes, ano);
			
		
		}
}
