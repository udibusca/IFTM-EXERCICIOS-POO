package orcamento;

public class CalculoIcms implements Imposto {

	private double icms;

	@Override
	public void realizaCalculo(Orcamento orcamento) {
		icms = orcamento.getValor() * 0.10;
		System.out.println(icms);
	}

}
