package orcamento;

public class Sistema {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);

		Imposto iss = new CalculoIss();
		Imposto icms = new CalculoIcms();

		
		CalculadoraDeImposto calculador = new CalculadoraDeImposto(iss);
		// Calculando o ISS
		calculador.realizaCalculo(orcamento);

		// Calculando o ICMS
		calculador.setImposto(icms);
		calculador.realizaCalculo(orcamento);
	}
}
