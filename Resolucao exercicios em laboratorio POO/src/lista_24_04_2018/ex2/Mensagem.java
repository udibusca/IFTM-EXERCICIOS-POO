package lista_24_04_2018.ex2;
import java.util.Scanner;

public class Mensagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digie o dia da semana: ");
		String diasemana = sc.nextLine();
		
		switch (diasemana){
		case "segunda":
			System.out.println("�.. o jeito � matar logo essa segunda...");
			break;
		case "terca":
			System.out.println("Segunda j� passou - bora trabalhar...");
			break;
		case "quarta":
			System.out.println("Bora l� que estamos no meio da semana!");
			break;
		case "quinta":
			System.out.println("Quinta - s� falta mais um dia!!");
			break;
		case "sexta":
			System.out.println("Sexta-feira eu s� trabalho pela metade!");
			break;
		case "sabado":
			System.out.println("Sabad�o chegou!! \\o/");
			break;
		case "domingo":
			System.out.println("Hoje � domingo!! :-D");
			System.out.println("Mas amanh� j� � segunda..  :�-(");
			break;
		}


		
		sc.close();

	}

}
