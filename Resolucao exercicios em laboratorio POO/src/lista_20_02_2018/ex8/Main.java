package lista_20_02_2018.ex8;

public class Main {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente("Andre", "bug", 1000);
		
		
		conta.cadastrarSenha("bug2");
		
		conta.alterarSenha("bug", "testErrado");  // teste errado
		conta.alterarSenha("bug2", "testeCerto"); // teste ok
		
		conta.credito(500, "bug2"); // teste certo
		conta.credito(500, "1111"); // teste errado
		
		conta.debito(10, "bug2"); // teste certo
		conta.debito(10, "555");  // teste errado
		
		
		System.out.println("\nO saldo final do correntista "+conta.getNome()+ " é de :"+ conta.getSaldo());
		
	}

}

