import java.util.Scanner;

public class DiasdaSemana {
	

	
	

			public static void main(String[] args) {
					
					
					System.out.println ("Digite o Seu Dia da Semana Preferido");
					
					Scanner s = new Scanner (System.in);
					
					String dia = s.next();
							
							
					s.close ();
		
					if ("domingo".equalsIgnoreCase(dia)) { // usado para compar Strings, ignora Case Sensitive
						
						System.out.println(1);
				
			}
					
					else if ("segunda".equalsIgnoreCase(dia)) {
						
						
						System.out.println (2);
						
						
					}
			
					
					else if ("terça".equalsIgnoreCase(dia)) {
					
					System.out.println(3);
					
					}
					
					else if ("quarta".equalsIgnoreCase(dia)) {
						
					System.out.println(4);
					
					}
					
					else if ("quinta".equalsIgnoreCase(dia)) {
						
						System.out.println (5);
					}
					
					else if ("sexta".equalsIgnoreCase(dia)) {
						
						System.out.println (6);
					}
					
					else {
						
						System.out.println ("Dia Invalido!");
					}
					
			}
			
}
			
	