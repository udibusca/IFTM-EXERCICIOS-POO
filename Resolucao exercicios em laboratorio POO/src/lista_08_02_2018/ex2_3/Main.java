package lista_08_02_2018.ex2_3;

public class Main {

	public static void main(String[] args) {
		
		Circulo raio = new Circulo();
		
		double valorarea = raio.calculaAreaCirculo(150);
		double valorcircunferencia = raio.calculaCircunferenciaCirculo(150);	
		
		System.out.printf("Valor da Area : %.2f", valorarea);
		System.out.printf("\nValor da Circunferencia :  %.2f", valorcircunferencia);

	}

}
