package lista_15_05_2018.exe1;

abstract class PortaEstado {
	
protected Porta _porta;

	public PortaEstado(Porta porta) {
		_porta = porta;
	}

	public abstract void clicar();

	public void timeout() {
	}

	public void fimCiclo() {
	}

	public String status() {
		return getClass().getName();
	}
}