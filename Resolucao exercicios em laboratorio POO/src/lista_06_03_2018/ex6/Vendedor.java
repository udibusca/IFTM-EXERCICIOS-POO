package lista_06_03_2018.ex6;

public class Vendedor extends Funcionario {
	private double comissao;

	public Vendedor(String nome, String matricula, double salario_base, double comissao) {
		super(salario_base, matricula, nome);
		this.comissao = comissao;
	}

	@Override
	public double calculaSalario() {
		return getSalario_base() + comissao;
	}
}
