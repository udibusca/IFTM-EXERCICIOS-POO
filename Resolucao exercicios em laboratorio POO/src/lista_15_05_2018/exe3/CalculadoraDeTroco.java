package lista_15_05_2018.exe3;

public class CalculadoraDeTroco {

	double troco(Conta conta) {
		Moeda umC = new UmSlote();
		Moeda cincoC = new CincoSlote();
		Moeda dezC = new DezSlote();

		umC.setProximo(cincoC);
		cincoC.setProximo(dezC);
		
		return umC.troco(conta);

	}
}
