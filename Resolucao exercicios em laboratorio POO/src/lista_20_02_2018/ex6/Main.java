package lista_20_02_2018.ex6;

public class Main {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("Ana", 10, 9);
		Aluno aluno2 = new Aluno("Beto", 9, 10);

		System.out.println("A média aritmética do Aluno " + aluno.getNome() + " é de : " + aluno.media());
		
		System.out.println("A média aritmética do Aluno " + aluno2.getNome() + " é de : " + aluno2.media());
	}

}
