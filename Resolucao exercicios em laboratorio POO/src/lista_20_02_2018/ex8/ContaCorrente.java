package lista_20_02_2018.ex8;

public class ContaCorrente {

	private String nome,senha;
	private int saldo;
	
	
	
	public ContaCorrente(String nome, String senha, int saldo) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	
	public void cadastrarSenha(String senha) {
		this.senha = senha;
	}
	
	public void alterarSenha(String senhaAntiga,String novaSenha) {
		if(senha.equals(senhaAntiga)) {
			this.senha = novaSenha;
		}else {
			System.err.println("Senha diferente");
		}

	}
	
	public void credito(int valor,String senha) {
		if(this.senha.equals(senha)) {
			this.saldo += valor;
		}else {
			System.err.println("Senha diferente operacao indevida");
		}
		
	}
	
	public void debito(int valor,String senha) {
		if(this.senha.equals(senha)) {
			this.saldo -= valor;
		}else {
			System.err.println("Senha diferente operacao indevida");
		}
	}
	
}
