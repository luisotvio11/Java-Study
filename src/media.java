import java.util.Scanner;

public class media {
	
	public static void main(String[] args) {
	
		
			CalcularMedia ();
		
	
	}
			private static void CalcularMedia ( ) { 
				
			
			System.out.println("Por favor Digite a sua nota do Primeiro Semestre:");
			
			Scanner s = new Scanner (System.in);
			double nota1 = s.nextDouble();
			
			System.out.println ("Por Favor Digite a sua Nota do Segundo Semestre");
			double nota2 = s.nextDouble();
			
			System.out.println ("Por Favor Digite a sua Nota do Terceiro Semestre");
			double nota3 = s.nextDouble();
			
			System.out.println ("Por Favor Digite a sua Nota do Quarto Semestre");
			double nota4 = s.nextDouble();
			
			double media = (nota1 + nota2 + nota3 + nota4) / 4 ;
			
			
			System.out.println ("Sua Nota no Ano de 2021 foi:" + media);
			
			printMedia (media);
			
	}
	
			
			private static void printMedia (double media) {
				
				if (media >= 6) {
					
					System.out.println ("Parabéns você foi aprovado");
				}
				
				else if (media == 10) {
					
					System.out.println (" Parabéns você foi aprovado com pontuação máxima!");
				}
				
				else 
				{
					
			System.out.println ("Infelizmente você foi reprovado, mas não desanima ano que vem você consegue");
				
				}
				
			}
}
