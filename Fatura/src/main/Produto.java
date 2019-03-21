package main;

public class Produto {

	//Atributos
	private int nome;
	private double Taxa;
	private double preço;

	//Construtores
	public Produto() {
		
	}
	
	public Produto(int nome, double taxa, double preço) {
		super();
		this.nome = nome;
		Taxa = taxa;
		this.preço = preço;
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

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	// ToString
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", Taxa=" + Taxa + ", preço=" + preço + "]";
	}

	//Metodos
}
