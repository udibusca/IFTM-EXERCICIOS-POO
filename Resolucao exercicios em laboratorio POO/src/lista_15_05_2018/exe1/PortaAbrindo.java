package lista_15_05_2018.exe1;

class PortaAbrindo extends PortaEstado{

	public PortaAbrindo(Porta porta) {
		super(porta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void clicar() {
		_porta.setEstado(new PortaFechando(_porta));
		
	}
	
	public void fimCiclo() {
		_porta.setEstado(new PortaFechada(_porta));
	}
	
}