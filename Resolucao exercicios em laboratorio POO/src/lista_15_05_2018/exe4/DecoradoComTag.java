package lista_15_05_2018.exe4;

public class DecoradoComTag implements Texto {

	private Texto componente;

	public DecoradoComTag(Texto componente) {
		this.componente = componente;
	}

	@Override
	public String getTexto() {
		return "<b>" + componente.getTexto()+ "<b>";
	}

}
