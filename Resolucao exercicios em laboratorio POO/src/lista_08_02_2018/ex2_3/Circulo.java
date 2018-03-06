package lista_08_02_2018.ex2_3;

public class Circulo {

	private double raio;
	
	public double calculaAreaCirculo(double raio) {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
	
	public double calculaCircunferenciaCirculo(double raio) {
		double circunferencia = 2*Math.PI*raio;
		return circunferencia;
	}
	
}
