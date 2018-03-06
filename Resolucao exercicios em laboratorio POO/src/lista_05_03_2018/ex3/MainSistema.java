package lista_05_03_2018.ex3;

public class MainSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Leilao l1 = new Leilao(10, "Bike");
		
		l1.registrarLance("a", 5);
		l1.registrarLance("c", 51);
		l1.registrarLance("b", 10);
		l1.registrarLance("c", 15);
		
		l1.finalizar();
		

	}

}
