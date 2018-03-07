package lista_06_03_2018.ex3;

public class Programa {

	public static void main(String[] args) {

		Conta conta = new Conta(10);
		Poupanca p = new Poupanca(10);
		
		conta.depositar(10000);
		conta.sacar(15000);
	}

}
