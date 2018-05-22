package lista_15_05_2018.exe1;

class PortaAberta extends PortaEstado {


	public PortaAberta(Porta porta) {
		super(porta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void clicar() {
		_porta.setEstado(new PortaPermanenteAberta(_porta));
	}

	@Override
	public void timeout() {
		_porta.setEstado(new PortaFechando(_porta));
	}


		
}
