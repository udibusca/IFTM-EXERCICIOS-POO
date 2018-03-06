package lista_20_02_2018.ex2_4;

public class Main {

	public static void main(String[] args) {

		Funcionario fun = new Funcionario("JOAO", 20, 3.50);
		Funcionario fun2 = new Funcionario("MATEUS", 40, 5.50);
		Funcionario fun3 = new Funcionario("LUCAS", 40, 13.50);

		System.out.println(fun.info());
		System.out.println(fun2.info());
		System.out.println(fun3.info());

	}

}
