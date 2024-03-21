package abb;

public class No {

	private int valor;
	private String nome;
	private String telefone;
	private No direito;
	private No esquerdo;

	public No(int valor, No direito, No esquerdo) {
		this.valor = valor;
		this.direito = direito;
		this.esquerdo = esquerdo;
	}
	public No(int valor, String nome, String telefone, No direito, No esquerdo) {
		this.nome= nome;
		this.telefone = telefone;
		this.valor = valor;
		this.direito = direito;
		this.esquerdo = esquerdo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getNome(){ return nome;}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public No getDireito() {
		return direito;
	}

	public void setDireito(No direito) {
		this.direito = direito;
	}

	public No getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(No esquerdo) {
		this.esquerdo = esquerdo;
	}

	public boolean ehFolha() {
		return (direito == null && esquerdo == null);
	}
}
