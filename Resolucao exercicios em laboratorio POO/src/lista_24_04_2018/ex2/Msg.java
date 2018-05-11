package lista_24_04_2018.ex2;

public class Msg {
	private String diasemana;
	
	void imprimeM(String diasemana){
		switch (diasemana){
		case "segunda":
			System.out.println("Segunda-feira");
			break;
		case "terca":
			System.out.println("Terca-feira");
			break;
		case "quarta":
			System.out.println("Quarta-feira");
			break;
		case "quinta":
			System.out.println("Quinta-feira");
			break;
		case "sexta":
			System.out.println("Sexta-feira");
			break;
		case "sabado":
			System.out.println("Sabado");
			break;
		case "domingo":
			System.out.println("Domingo");
			break;
		}
	}

	public static void Main(String[] args){
		Msg print = new Msg();
		print.imprimeM("terca");

	}
}
