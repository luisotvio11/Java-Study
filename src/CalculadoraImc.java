import java.util.Scanner;

public class CalculadoraImc {
	
			
	public static void main(String[] args) throws Exception  { // throws exception trata exceções
				
				CalcularImc ();
	}
		
	
			private static void CalcularImc () throws Exception {
				
					
				System.out.println ("Por Favor Digite o seu Peso");
				Scanner s = new Scanner (System.in);
				float peso = s.nextFloat();
				System.out.println("Por Favor Digite a Sua Altura");
				float altura = s.nextFloat();
				
				float IMC = (100 * 100 * peso) / (altura * altura);
				
				System.out.println("Seu IMC é:" + IMC);
				printIMCCategoria(IMC);
				
					
			}
			
			
			
			private static void printIMCCategoria (float IMC) {
				
					if (IMC < 18) {
						
						System.out.println ("Você está abaixo do Peso");
					}
					
					else if (IMC < 25) {
						
						System.out.println ("Seu Peso está dentro do Padrão");
					}
					
					else if (IMC < 30 ) {
						
						System.out.println ("Você está acima do Peso, faça exercicos fisicos e tenha uma alimentação saudável");
						
						
					}
					
					else {
						
						
						System.out.println (" Você está Obeso");
					}
			}
	
}


				
			
			
				
		
				
		

