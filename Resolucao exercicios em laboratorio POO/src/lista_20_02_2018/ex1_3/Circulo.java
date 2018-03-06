package lista_20_02_2018.ex1_3;

public class Circulo {

	private double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double calculaAreaCirculo() {
		double area = Math.PI * Math.pow(this.raio, 2);
		return area;
	}
	
	public double calculaCircunferenciaCirculo() {
		double circunferencia = 2*Math.PI*this.raio;
		return circunferencia;
	}
	
}
