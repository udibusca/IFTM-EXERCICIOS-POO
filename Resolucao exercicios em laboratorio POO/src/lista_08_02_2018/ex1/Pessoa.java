package lista_08_02_2018.ex1;
public class Pessoa {

	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}


	public String info() {
		String msg = "";
		
		msg += "Nome : "+ this.nome;
		
		return msg;
	}
}
