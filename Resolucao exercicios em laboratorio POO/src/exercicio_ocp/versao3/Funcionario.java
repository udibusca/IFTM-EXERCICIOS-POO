package exercicio_ocp.versao3;

public class Funcionario{
	private String cargo, nome;
	private double salarioBase;

	public Funcionario(String cargo, double salarioBase, String nome) {
		super();
		this.cargo = cargo;
		this.salarioBase = salarioBase;
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public String getNome() {
		return nome;
	}

}
