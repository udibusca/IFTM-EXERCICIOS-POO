package lista_05_03_2018.ex3;

public class Leilao {

	private double valorMinimo;
	private String nomeBem;
	private boolean status;
	private Lance lanceVencedor;
	
	public Leilao(double valorMinimo, String nomeBem) {
		super();
		this.valorMinimo = valorMinimo;
		this.nomeBem = nomeBem;
		this.status = true;
	}

	public void registrarLance(String nome, double valor) {

		if (status) {
			if (lanceVencedor != null && valor > lanceVencedor.getValor()) {
				lanceVencedor.setNomeArrematante(nome);
				lanceVencedor.setValor(valor);
			} else {
				if (lanceVencedor == null && valor > valorMinimo) {
					lanceVencedor = new Lance(nome, valor);
				}
			}
		}
	}
	
	public void finalizar() {
		status = false;
		if (lanceVencedor != null) {
			System.out.println("O bem Leiloado    :" + nomeBem);
			System.out.println("Arrematante       :" + lanceVencedor.getNomeArrematante());
			System.out.println("VAlor do Arremate :" + lanceVencedor.getValor());
		} else {
			System.out.println("Não houve lance vencedor!");
		}
	}
}

