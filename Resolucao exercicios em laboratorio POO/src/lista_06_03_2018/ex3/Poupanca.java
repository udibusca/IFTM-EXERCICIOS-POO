package lista_06_03_2018.ex3;

public class Poupanca extends Conta {

	private int diaRendimento;

	public Poupanca(double saldo) {
		super(saldo);
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.getSaldo() =+valor;
		} else {
			System.out.println("Não pode ser negativo");
		}
	}	
	
	public void sacar(double valor) {
		if (valor > 0) {
			this.getSaldo() = -valor;
		} else {
			System.out.println("Não pode ser negativo");
		}
	}
}
