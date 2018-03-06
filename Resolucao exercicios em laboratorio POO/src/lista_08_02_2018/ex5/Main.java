package lista_08_02_2018.ex5;

import java.util.Scanner;

public class Main {

	private static Scanner ler;

	public static void main(String[] args) {
		
		ler = new Scanner(System.in);
	    String p1,p2;

	    System.out.print("Digite a primeira palavra :\n");
	    p1 = ler.next();
	    
	    System.out.print("Digite a segunda palavra :\n");
	    p2 = ler.next();	    
	    
	    if(p1.equals(p2)) {
	    	System.out.println("Iguais");	
	    }else {
	    	System.out.println("Diferentes");
	    }

	}

}
