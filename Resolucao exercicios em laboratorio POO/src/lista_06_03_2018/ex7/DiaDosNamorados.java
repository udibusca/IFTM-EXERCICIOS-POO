package lista_06_03_2018.ex7;

public class DiaDosNamorados extends CartaoWeb {
	private String destinatario;

	public DiaDosNamorados(String destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public void showMessage() {
		System.out.println("Feliz dia dos Namorados " + destinatario);
	}
}
