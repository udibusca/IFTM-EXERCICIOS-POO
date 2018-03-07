package lista_06_03_2018.ex2;

//aula 06 - 03 -2018
public class Professor extends Funcionario {

	public Professor(int matricula, double salario, String nome, String sobreNome) {
		super(matricula, salario, nome, sobreNome);
	}

	public double getSalarioPrimeiraParcela() {
		return getSalario();
	}

	public double getSalarioSegundaParcela() {
		return 0;
	}

}
