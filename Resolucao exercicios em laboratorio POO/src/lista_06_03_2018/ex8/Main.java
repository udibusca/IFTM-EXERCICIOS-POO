package lista_06_03_2018.ex8;

public class Main {
	public static void main(String[] args) {
		Retangulo r1 = new Retangulo(3, 4);
		Circulo c1 = new Circulo(5);

		FormaGeometrica formas[] = { r1, c1 };

		for (int i = 0; i < formas.length; i++) {
			System.out.println("Perimetro: "+ formas[i].calcularPerimetro());
			System.out.println("Area: "+ formas[i].calcularArea());
	
		}
	}
}
