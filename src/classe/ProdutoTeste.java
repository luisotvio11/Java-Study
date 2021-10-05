package classe;

public class ProdutoTeste {
	
		public static void main(String[] args) {
			
			Produto p1 = new Produto ();
			p1.nome = "Noteboook";
			p1.preco = 4399.99;
			p1.desconto = 0.25;
			
			var p2 = new Produto ();
			p2.nome = "Monitor";
			p2.preco = 2.000;
			p2.desconto = 1.00;
			
			
			System.out.println (p1.nome);
			System.out.println (p2.nome);
			
			double precoFinal = p1.preco * p2.preco;
			
			System.out.println (precoFinal);
		

		}
		
}
