package lista_08_02_2018.ex1;
public class Casa {

	private Pessoa proprietario;
	private Endereco endereco;
	
	public Casa(Pessoa proprietario, Endereco endereco) {
		this.proprietario = proprietario;
		this.endereco = endereco;
	}
	
	public String info() {
		String msg = "";
		msg += "\n Informaçõe da Casa";
		msg += "\nInformações do Proprietario : "+ this.proprietario.info();
		msg += "\nEndereço Completo : "+ this.endereco.info();
		return msg;
	}
	
}
