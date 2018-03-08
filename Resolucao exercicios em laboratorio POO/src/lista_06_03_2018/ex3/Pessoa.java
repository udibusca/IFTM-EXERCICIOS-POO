package lista_06_03_2018.ex3;

// aula 06 - 03 -2018
public class Pessoa {

	private String nome;
	private String sobreNome;

	public Pessoa(String nome, String sobreNome) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
	}

	public String getNomeCompleto() {
		return nome + " " + sobreNome;
	}
}
