package metodos;

public class Calculadora {
	
	public static void main(String[]args) {
		
		CalcularMetodos c1 = new CalcularMetodos();
		
		int resultado = c1.somar(5, 4);
		System.out.println(resultado);
		
		resultado = c1.somar(8, 10, 30);
		System.out.println(resultado);
		
	
		
	}
	
	
}
