package lista_20_02_2018.ex7;

public class Main {

	public static void main(String[] args) {
		
		Calculo calc = new Calculo();
		
		calc.credito(1000);
		calc.debito(500);
		
		System.out.println("O Saldo final é :"+calc.getSaldo());
				
	}

}
