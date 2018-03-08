package lista_06_03_2018.ex4;

public class Programa {

	public static void main(String[] args) {

		Conta conta = new Conta();
		Poupanca p = new Poupanca();
		
		conta.depositar(10000);
		conta.sacar(15000);
		
		p.depositar(15000);
		p.sacar(20000);
		
		System.out.println("Saldo da conta : "+conta.getSaldo());
		System.out.println("Saldo da conta Poupança: "+p.getSaldo());
		
	}

}
