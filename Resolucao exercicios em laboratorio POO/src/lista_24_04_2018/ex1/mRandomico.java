package lista_24_04_2018.ex1;

import java.util.ArrayList;
import java.util.Random;

public class mRandomico extends Amostrador {
	public mRandomico(int[] codigosZip) {
		super(codigosZip);
		// TODO Auto-generated constructor stub
	}

	int[] subConjunto = new int[tamanhoAmostra];
	Random generator = new Random();

	// faz uma c�pia usando ArrayList
	// fica f�cil amostrar sem repetir
	ArrayList<Integer> tempArray = new ArrayList<Integer>();for(
	int i = 0;i<populacao.length;i++)tempArray.add(populacao[i]);

	for(
	int i = 0;i<tamanhoAmostra;i++)subConjunto[i]=tempArray.remove(generator.nextInt(tempArray.size()));

	return subConjunto;
}