package lista_20_02_2018.ex6;

public class Aluno {

	private String nome;
	private double n1, n2;

	public Aluno(String nome, double n1, double n2) {
		super();
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}	
	
	public double media() {
		double media = (this.n1+this.n2)/2;
		return media;
	}

}
