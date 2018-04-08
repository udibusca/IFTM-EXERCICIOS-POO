package exercicio_ocp.versao3;

public class Sistema {
	public static void main(String[] args) {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario(2.25);
		Funcionario roberto = new Gerente("Gerente", 100, "Roberto");
		Funcionario robson = new Vendedor("Vendedor", 50, "Robson", 5000, 10000);
		Funcionario keilane = new Assistente("Assistente", 50, "Keilane");
		Funcionario gabriel = new Supervisor("Supervisor", 75, "Gabriel");

		System.out.println("Funcionario: " + roberto.getNome() + " - Salario: " + calculadora.calcula(roberto));
		System.out.println("Funcionario: " + robson.getNome() + " - Salario: " + calculadora.calcula(robson));
		System.out.println("Funcionario: " + keilane.getNome() + " - Salario: " + calculadora.calcula(keilane));
		System.out.println("Funcionario: " + gabriel.getNome() + " - Salario: " + calculadora.calcula(gabriel));

	}
}
