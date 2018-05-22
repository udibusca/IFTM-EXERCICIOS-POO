package lista_15_05_2018.exe1;

class Porta {
	private PortaEstado estado = new PortaFechada(this);

	public void setEstado(PortaEstado estado) {
		this.estado = estado;
	}

	public void clicar() {
		estado.clicar();
	}

	public void fimCiclo() {
		estado.fimCiclo();
	}

	public void timeout() {
		estado.timeout();
	}

	public void status() {
		System.out.println("Status : " + estado.status());
	}
}