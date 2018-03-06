package lista_20_02_2018.ex7;

public class Calculo {

	private int saldo = 0;
	
		
	public void credito(int valor) {
		this.saldo += valor;
	}
	
	public void debito(int valor) {
		this.saldo -= valor;
	}

	public int getSaldo() {
		return saldo;
	}

}
