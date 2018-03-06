package lista_15_02_2018.ex3;

public class Paciente {

	private String nome;
	private double peso;
	private int altura;
	
	
	public Paciente(String nome, double peso, int altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public double calcularIMC() {
		double imc =  this.peso*Math.pow(altura, 2); 
		return imc;
	}
	
}
