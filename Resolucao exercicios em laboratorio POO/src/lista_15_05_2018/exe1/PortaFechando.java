package lista_15_05_2018.exe1;

public class PortaFechando extends PortaEstado {

	public PortaFechando(Porta porta) {
		super(porta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void clicar() {
		_porta.setEstado(new PortaAbrindo(_porta));
		
	}
	
	public void fimCiclo() {
		_porta.setEstado(new PortaFechada(_porta));
	}
	
}