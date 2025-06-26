package metodos;

public class Carros {
	//Todo metodo construtor em java tem o mesmo nome da classe
		
		String modelo;
		String cor;
		double preco;	

		public Carros(){
			
		}
		
		
		public Carros(String modelo, String cor, double preco) {
			this.modelo=modelo;
			this.cor=cor;
			this.preco=preco;
		}
		
		public Carros(String modelo, double preco) {
			this.modelo=modelo;
			this.preco=preco;
		
		}
		

		public Carros(String modelo) {
			this.modelo=modelo;
		}
			
			
			
		}
			