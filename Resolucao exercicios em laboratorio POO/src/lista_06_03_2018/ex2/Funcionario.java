package lista_06_03_2018.ex2;

public class Funcionario extends Pessoa {

	private int matricula;
	private double salario;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Funcionario(int matricula, double salario, String nome, String sobreNome) {
		super(nome, sobreNome);
		this.matricula = matricula;
		this.salario = salario;
	}

	public void setSalario(int valor) {
		if (valor > 0)
			this.salario = valor;
	}

	public double getSalarioPrimeiraParcela() {
		return this.salario = this.salario * 60 / 100;
	}

	public double getSalarioSegundaParcela() {
		return this.salario = this.salario * 40 / 100;
	}

}
