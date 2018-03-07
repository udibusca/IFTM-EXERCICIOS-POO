package lista_06_03_2018.ex2;

public class Professor extends Funcionario {

	public Professor(int matricula, double salario, String nome, String sobreNome) {
		super(matricula, salario, nome, sobreNome);
	}

	public double getSalarioPrimeiraParcela() {
		return this.getSalario();
	}

	public double getSalarioSegundaParcela() {
		return 0;
	}

}
