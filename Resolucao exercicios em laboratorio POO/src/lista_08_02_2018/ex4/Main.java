package lista_08_02_2018.ex4;

import java.util.Scanner;

public class Main {

	private static Scanner ler;

	public static void main(String[] args) {
		
		ler = new Scanner(System.in);
	    String n;

	    System.out.print("Digite a palavra :\n");
	    
	    n = ler.next();
	    
	    System.out.println("Resultado Maiusculo : "+ n.toUpperCase());

	}

}
