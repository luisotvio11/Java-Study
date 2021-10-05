import java.util.Scanner;

public class SwitchClubesRJ {
	
			public static void main(String[] args) {
				
				System.out.println ("Digite um número e saiba qual é o time melhor colocado no campeonato carioca de 2021");
				
				Scanner entrada = new Scanner (System.in);
				
				int Clube = entrada.nextInt();
				
				
				switch (Clube) {
					
				case 1:
				System.out.println ("Flamengo");
				break;
				
				case 2:
				System.out.println ("Fluminense");
				break;
				
				case 3:
				System.out.println ("Vasco");
				break;
				
				case 4:
				System.out.println ("Botafogo");
				break;
				
				default:
					
					System.out.println ("digite somente números entre 1 e 4");
					
				break;
				
				}
			}

}
