package lista_20_02_2018.ex5;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		pessoa.setCpf("111122255");
		pessoa.setIdade(20);
		pessoa.setNome("Nanda");

		pessoa2.setCpf("8854699");
		pessoa2.setIdade(25);
		pessoa2.setNome("Mara");

		System.out.println("A pessoa de nome " + pessoa.getNome() + " do cpf " + pessoa.getCpf() + " tem "
				+ pessoa.getIdade() + " anos de idade.");
		
		System.out.println("A pessoa de nome " + pessoa2.getNome() + " do cpf " + pessoa2.getCpf() + " tem "
				+ pessoa2.getIdade() + " anos de idade.");

	}
}