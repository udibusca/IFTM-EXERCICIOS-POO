package lista_15_05_2018.exe1;

class PortaFechada extends PortaEstado {

	public PortaFechada(Porta porta) {
		super(porta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void clicar() {
		_porta.setEstado(new PortaAbrindo(_porta));
		
	}

}