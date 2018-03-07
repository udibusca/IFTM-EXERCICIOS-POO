package lista_06_03_2018.ex1;

public class Amigo extends Pessoa{

	// aula 06 - 03 -2018
	private String diaDoAniversario;

	public Amigo() {}

	public Amigo(String diaAniversario,String nome, char sexo, int idade) {
		super(nome, sexo, idade);
	   this.diaDoAniversario = diaAniversario;
	}
	
}
