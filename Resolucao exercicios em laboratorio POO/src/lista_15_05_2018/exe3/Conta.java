package lista_15_05_2018.exe3;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	
	List<Produto> produtos = new ArrayList<>();
	
	void caixa (Produto produto){
		produtos.add(produto);
	}
}
