package exercicio_ocp.versao3;

public class Gerente extends Funcionario implements RegraDeCalculo{

	public Gerente(String cargo, double salarioBase, String nome) {
		super(cargo, salarioBase, nome);
	}

	@Override
	public double calcula(Funcionario f) {
		double salario = 0;
			salario = 2 * getSalarioBase();
		return salario;
	}

}
