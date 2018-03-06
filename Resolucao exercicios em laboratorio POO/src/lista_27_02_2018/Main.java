package lista_27_02_2018;

public class Main {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		Conta c1 = new Conta("Jovem");
		
// Exercicio 1 : Não é possivel acessar os atributos privados.
		
/*		c.titular = "André";
		c.saldo = 150.5;
*/		

// Exercicio 3 : Acessando os atributos via metodos Getters e Setters  
		
		 c.setTitular("Batman");
	     System.out.println(c.getTitular());
	     
	     c.setSaldo(150.5);
	     System.out.println(c.getSaldo());
	     
	     
	     System.out.println(c1.getTitular());
	     
	     
	}

}
