package exercicio_ocp.versao3;

public class Vendedor extends Funcionario implements RegraDeCalculo {

	private double totalVendas;
	private double meta;

	public Vendedor(String cargo, double salarioBase, String nome, double totalVendas, double meta) {
		super(cargo, salarioBase, nome);
		this.totalVendas = totalVendas;
		this.meta = meta;

	}

	public final double getMeta() {
		return meta;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	@Override
	public double calcula(Funcionario f) {
		double salario = 0;
		if (totalVendas > meta)
			salario  = getSalarioBase() + (totalVendas * 0.03) + 50;
		else
			salario = getSalarioBase() + (totalVendas * 0.03);
		return salario;
	}

	
}
