package lista_15_02_2018.ex2;

import java.util.Scanner;

public class Main {
	private static Scanner ler;
	public static void main(String[] args) {

		
		ler = new Scanner(System.in);

		String[] nome = new String[3];
		int[] horastrabalhadas = new int[3];
		double[] valorhora = new double[3];
		
		for (int i = 0; i < nome.length; i++) {
		    System.out.print("Digite o nome do "+(i+1)+"° funcionario :\n");
		    nome[i] = ler.next();
		    
		    System.out.print("Digite as  horas trabalhadas do "+(i+1)+"° funcionario :\n");
		    horastrabalhadas[i] = ler.nextInt();
		    
		    System.out.print("Digite o valor da hora do "+(i+1)+"° funcionario :\n");
		    valorhora[i] = ler.nextDouble();

		}

		for (int i = 0; i < nome.length; i++) {
		    Funcionario fun = new Funcionario(nome[i], horastrabalhadas[i], valorhora[i]);
		    System.out.println(fun.info());
		}
		    
	}

}
