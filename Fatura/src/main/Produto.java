package main;

public class Produto {

	//Atributos
	private int nome;
	private double Taxa;
	private double pre�o;

	//Construtores
	public Produto() {
		
	}
	
	public Produto(int nome, double taxa, double pre�o) {
		super();
		this.nome = nome;
		Taxa = taxa;
		this.pre�o = pre�o;
	}

	//Acessores
	public int getNome() {
		return nome;
	}

	public void setNome(int nome) {
		this.nome = nome;
	}

	public double getTaxa() {
		return Taxa;
	}

	public void setTaxa(double taxa) {
		Taxa = taxa;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	// ToString
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", Taxa=" + Taxa + ", pre�o=" + pre�o + "]";
	}

	//Metodos
}
