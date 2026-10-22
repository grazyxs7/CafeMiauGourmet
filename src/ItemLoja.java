// ABSTRAÇÃO: Define a estrutura genérica e oculta detalhes complexos dos itens da cafeteria.
public abstract class ItemLoja implements IAvaliavel {
    protected String nome;
    protected double preco;
    protected int raridade;

    public ItemLoja(String nome, double preco, int raridade) {
        this.nome = nome;
        this.preco = preco;
        this.raridade = raridade;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    public abstract void exibirDetalhes();

    @Override
    public int calcularPontuacao() {
        return raridade * 15;
    }
}