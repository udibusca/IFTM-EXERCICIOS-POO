package lista_06_03_2018.ex3;

public class Conta {
	private double saldo;

	public Conta(double saldo) {
	}

	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		} else {
			System.out.println("Não pode ser negativo");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo = +valor;
	}

	public void sacar(double valor) {
		if (saldo > 0) {
			this.saldo = -valor;
		} else {
			System.out.println("Não pode ser negativo");
		}
	}

}
