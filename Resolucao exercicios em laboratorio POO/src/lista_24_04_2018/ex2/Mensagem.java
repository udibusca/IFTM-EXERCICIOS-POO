package lista_24_04_2018.ex2;
import java.util.Scanner;

public class Mensagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digie o dia da semana: ");
		String diasemana = sc.nextLine();
		
		switch (diasemana){
		case "segunda":
			System.out.println("É.. o jeito é matar logo essa segunda...");
			break;
		case "terca":
			System.out.println("Segunda já passou - bora trabalhar...");
			break;
		case "quarta":
			System.out.println("Bora lá que estamos no meio da semana!");
			break;
		case "quinta":
			System.out.println("Quinta - só falta mais um dia!!");
			break;
		case "sexta":
			System.out.println("Sexta-feira eu só trabalho pela metade!");
			break;
		case "sabado":
			System.out.println("Sabadão chegou!! \\o/");
			break;
		case "domingo":
			System.out.println("Hoje é domingo!! :-D");
			System.out.println("Mas amanhã já é segunda..  :´-(");
			break;
		}


		
		sc.close();

	}

}
