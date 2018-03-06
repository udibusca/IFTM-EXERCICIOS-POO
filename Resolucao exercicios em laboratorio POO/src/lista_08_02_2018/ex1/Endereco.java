package lista_08_02_2018.ex1;
public class Endereco {

	private String logradouro;
	private int numero;
	private String cidade;
	private String estado;
	private String cep;
	
	public Endereco(String logradouro, int numero, String cidade, String estado, String cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	
	public String info() {
		String msg = "";
		
		msg += "\nEndereço : "+ this.logradouro;
		msg += "\nNumero : "+ this.numero;
		msg += "\nCidade :  "+ this.cidade;
		msg += "\nEstado : "+ this.estado;
		msg += "\nCEP : "+ this.cep;
		
		return msg;
	}
	
}
