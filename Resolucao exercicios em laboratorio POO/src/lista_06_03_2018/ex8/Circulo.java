package lista_06_03_2018.ex8;

public class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
