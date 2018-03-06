package lista_08_02_2018.ex1;

public class Main {

	public static void main(String[] args) {
		
		Pessoa proprietario = new Pessoa("André ");
		Endereco endereco = new Endereco("Rua canapolis ", 137, "Uberlandia", "MG", "38500-000");
		
		Casa casa = new Casa(proprietario, endereco);
		
		System.out.println(casa.info());

	}

}
