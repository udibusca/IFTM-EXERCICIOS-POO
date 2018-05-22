package lista_15_05_2018.exe1;

class PortaPermanenteAberta extends PortaEstado{

	public PortaPermanenteAberta(Porta porta) {
		super(porta);
	}

	public void clicar() {
		_porta.setEstado(new PortaFechando(_porta));
		
	}
	
}