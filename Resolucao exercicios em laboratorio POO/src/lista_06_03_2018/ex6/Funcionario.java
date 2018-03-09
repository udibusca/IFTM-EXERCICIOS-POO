package lista_06_03_2018.ex6;

public abstract class Funcionario {

	private double salario_base;
	private String matricula;
	private String nome;

	public Funcionario(double salario_base, String matricula, String nome) {
		super();
		this.salario_base = salario_base;
		this.matricula = matricula;
		this.nome = nome;
	}

	public double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
    public abstract double calculaSalario();

}
