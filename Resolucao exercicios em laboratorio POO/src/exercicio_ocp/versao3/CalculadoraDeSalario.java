// adicionar cargo supervisor -> salario=1.5*salario base
// adicionar regra se o vendedor bater a meta, ganha bonus de 50. A meta é definida para cada vendedor.
package exercicio_ocp.versao3;

public class CalculadoraDeSalario {
	double incentivo;

	public CalculadoraDeSalario(double incentivo) {
		super();
		this.incentivo = incentivo;
	}

	public double calcula(Funcionario f) {
		double salario = 0;
		if (f instanceof Gerente) {
			salario = ((Gerente) f).calcula(f) + incentivo;
		}
		if (f instanceof Vendedor ) {
			salario = ((Vendedor) f).calcula(f) + incentivo;
		}
		if (f instanceof Assistente) {
			salario = ((Assistente) f).calcula(f) + incentivo;
		}
		if (f instanceof Supervisor) {
			salario = ((Supervisor) f).calcula(f) + incentivo;
		}
		return salario;
	}
}
