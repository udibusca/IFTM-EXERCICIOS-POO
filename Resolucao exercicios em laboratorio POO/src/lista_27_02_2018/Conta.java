package lista_27_02_2018;

public class Conta {
	
// Exercicio 1 : Colocando os modificadores de acessos nos atributos.
	
	private String titular;
	private int numero;
	private double saldo;


// Exercicio 4 : Criar Construtores, pois possamos utilizar o contrutor passando 
// Parametros ou não isso chama-se "Sobrecarga de Contrutores"
	
	public Conta() {
		
	}

    public Conta(String titular) {
    	this.titular = titular;
    }	
	
// Exercicio 2 : Criados os  metodos Getters e Setters 	
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

}
