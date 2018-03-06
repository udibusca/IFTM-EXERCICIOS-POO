package lista_15_02_2018.ex2;

import java.text.DecimalFormat;

public class Funcionario {

	 private String nome;
	 private int horastrabalhadas;
	 private double valorhora;
	 
	 public Funcionario(String nome, int horastrabalhadas, double valorhora) {
		this.nome = nome;
		this.horastrabalhadas = horastrabalhadas;
		this.valorhora = valorhora;
	}

	public double calcularSalario() {
		 double salario = this.horastrabalhadas*this.valorhora;
		 return salario;		 
	 }
	 
	public String info() {

		DecimalFormat formata = new DecimalFormat("#.00");
		
		String msg = "";
		msg += "\nNome do funcionario : "+ this.nome;
		msg += "\nSalario : "+ formata.format(this.calcularSalario());
		return msg;
	}
}
