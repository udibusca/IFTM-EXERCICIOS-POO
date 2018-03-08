package lista_06_03_2018.ex3;

public class Programa {

	// aula 06 - 03 -2018
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Joao", "Medeiros");
		Funcionario pessoa2 = new Funcionario(100, 1000.00, "Leonardo", "Messias");
		Professor pessoa3 = new Professor(200, 1500.00, "Antonio", "Silva");

		System.out.println(pessoa1.getNomeCompleto());
		System.out.println(pessoa2.getNomeCompleto());
		System.out.println(pessoa3.getNomeCompleto());

		System.out.println("Informações da 2 pessoa");
		System.out.println(pessoa2.getSalarioPrimeiraParcela());
		System.out.println(pessoa2.getSalarioSegundaParcela());

		System.out.println("Informações da 3 pessoa");
		System.out.println(pessoa3.getSalarioPrimeiraParcela());
		System.out.println(pessoa3.getSalarioSegundaParcela());

	}

}
