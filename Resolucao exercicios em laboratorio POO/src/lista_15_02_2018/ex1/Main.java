package lista_15_02_2018.ex1;

import java.util.Scanner;

public class Main {

	private static Scanner ler;
	public static void main(String[] args) {

		ler = new Scanner(System.in);
	    double area1,area2,area3;

	    System.out.print("Digite o primeiro valor de raio :\n");
	    area1 = ler.nextDouble();
	    
	    System.out.print("Digite a segunda valor de raio :\n");
	    area2 = ler.nextDouble();
	    
	    System.out.print("Digite a terceiro valor de raio :\n");
	    area3 = ler.nextDouble();

		Circulo circulo = new Circulo(area1);
		Circulo circulo2 = new Circulo(area2);
		Circulo circulo3 = new Circulo(area3);
		
		System.out.println(circulo.info());
		System.out.println(circulo2.info());
		System.out.println(circulo3.info());
		
	}

}
