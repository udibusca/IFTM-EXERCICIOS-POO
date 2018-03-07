package lista_06_03_2018.ex3;

public class Poupanca extends Conta {

	private int diaRendimento;

	public Poupanca(double saldo, int diaRendimento) {
		super(saldo);
		this.diaRendimento = diaRendimento;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			setSaldo(getSaldo()+valor);
		} else {
			System.out.println("Não pode ser negativo");
		}
	}	
	
	public void sacar(double valor) {
		if (valor > 0) {
		 setSaldo(getSaldo()-valor);
		} else {
			System.out.println("Não pode ser negativo");
		}
	}
}
