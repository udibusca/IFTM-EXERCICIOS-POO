package lista_15_05_2018.exe2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SistemaAlarme {
	private List<Observador> observadores = new ArrayList<>();

	void addObservador(Observador novoObservador) {
		observadores.add(novoObservador);
	}

	void monitoraTemperatura() {

		Random random = new Random();
		int x = random.nextInt(60);
		System.out.println(x);

		if (x > 30) { dispararAlarme();}else{System.out.println("ok");}
		
	}

	private void dispararAlarme() {
		for (Observador obs : observadores) {
			obs.alarmeDisparado();
		}
	}

	public static void main(String[] args) {

		DelegaciaPolicia del = new DelegaciaPolicia();
		CompahiaSeguradora seg = new CompahiaSeguradora();
		SistemaAlarme sist = new SistemaAlarme();

		sist.addObservador(del);
		sist.addObservador(seg);
		sist.monitoraTemperatura();

	}
}
