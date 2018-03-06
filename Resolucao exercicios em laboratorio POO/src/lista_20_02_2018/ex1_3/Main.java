package lista_20_02_2018.ex1_3;

public class Main {

	public static void main(String[] args) {
		
		Circulo raio = new Circulo(32);
		Circulo raio2 = new Circulo(44);
		Circulo raio3 = new Circulo(17);
		
		double valorarea = raio.calculaAreaCirculo();
		double valorcircunferencia = raio.calculaCircunferenciaCirculo();	

		double valorarea2 = raio2.calculaAreaCirculo();
		double valorcircunferencia2 = raio2.calculaCircunferenciaCirculo();	

		double valorarea3 = raio3.calculaAreaCirculo();
		double valorcircunferencia3 = raio3.calculaCircunferenciaCirculo();	
		
		
		System.out.printf("Valor da Area : %.2f", valorarea);
		System.out.printf("\nValor da Circunferencia :  %.2f", valorcircunferencia);
		
		System.out.printf("Valor da Area : %.2f", valorarea2);
		System.out.printf("\nValor da Circunferencia :  %.2f", valorcircunferencia2);

		System.out.printf("Valor da Area : %.2f", valorarea3);
		System.out.printf("\nValor da Circunferencia :  %.2f", valorcircunferencia3);

	}

}
