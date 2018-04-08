package exercicio_ocp.versao3;

public class Assistente extends Funcionario implements RegraDeCalculo{

	public Assistente(String cargo, double salarioBase, String nome) {
		super(cargo, salarioBase, nome);
	}

	@Override
	public double calcula(Funcionario f) {
		double salario = 0;
		salario = getSalarioBase();
		return salario;
	}
}
