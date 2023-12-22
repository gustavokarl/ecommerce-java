package produto.model;

public class Camiseta extends Produto {

	String cor;

	public Camiseta(String nome, int codigo, int quantidade, float valor, String cor) {
		super(nome, codigo, quantidade, valor);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
