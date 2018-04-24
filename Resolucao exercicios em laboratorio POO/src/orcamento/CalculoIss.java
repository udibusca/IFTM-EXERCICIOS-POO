package orcamento;

public class CalculoIss implements Imposto {
	private double iss;

	@Override
	public void realizaCalculo(Orcamento orcamento) {
		iss = orcamento.getValor() * 0.06;
		System.out.println(iss);
	}

}
