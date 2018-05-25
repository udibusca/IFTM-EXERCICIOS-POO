package lista_15_05_2018.exe4;

public class DecoradorCaixaAlta implements Texto {

	private Texto componente;

	public DecoradorCaixaAlta(Texto componente) {
		this.componente = componente;
	}

	@Override
	public String getTexto() {
		return componente.getTexto().toUpperCase();
	}

}
