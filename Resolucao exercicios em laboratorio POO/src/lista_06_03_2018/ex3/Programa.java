package lista_06_03_2018.ex3;

public class Programa {

	public static void main(String[] args) {

		Conta conta = new Conta();
		Poupanca p = new Poupanca(0, 0);
		
		conta.depositar(10000);
		conta.sacar(15000);
		
		
	}

}
