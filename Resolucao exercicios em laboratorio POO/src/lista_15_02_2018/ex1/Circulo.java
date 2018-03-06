package lista_15_02_2018.ex1;

import java.text.DecimalFormat;

public class Circulo {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	public double calcularArea(){
		double area = Math.PI * Math.pow(this.raio, 2);
		return area;
	}
	
	public double calcularPerimetro(){
		double perimetro = 2*Math.PI*this.raio;
		return perimetro;
	}

	public String info() {
		
		DecimalFormat formata = new DecimalFormat("#.00");
		
		String msg = "";
		msg += "\nRaio : "+ formata.format(this.calcularArea());
		msg += "\nPerimetro : "+ formata.format(this.calcularPerimetro());
		return msg;
	}
	
}
