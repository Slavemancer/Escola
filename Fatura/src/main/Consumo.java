package main;

public class Consumo {

	private Produto produto;
	private double quantidade;
	private double valor;

	//Construtores
	public Consumo(Produto produto, double quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		atualizarValor();
	}

	public Consumo() {
		super();
	}

	//Acessores
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
		atualizarValor();
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
		atualizarValor();
	}

	public double getValor() {
		return valor;
	}


	//ToString
	@Override
	public String toString() {
		return "Consumo [produto=" + produto + ", quantidade=" + quantidade + ", valor=" + valor + "]";
	}

	// Metodos
	private void atualizarValor() {
		this.valor=this.quantidade*this.produto.getPreço();
	};
}
