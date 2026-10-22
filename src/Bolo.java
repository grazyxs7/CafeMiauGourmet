public class Bolo extends ItemLoja implements IAnimavel {
    private String saborDoRecheio;

    public Bolo(String nome, double preco, int raridade, String saborDoRecheio) {
        super(nome, preco, raridade);
        this.saborDoRecheio = saborDoRecheio;
    }

    @Override
    public void exibirDetalhes() {
        IO.println("🍰 [Bolo] " + nome + " | Sabor: " + saborDoRecheio + " | Preço: R$" + preco);
    }

    @Override
    public void animarInteracao() {
        IO.println("✨ O bolo " + nome + " brilha na vitrine com cobertura perfeita!");
    }

    @Override
    public int calcularPontuacao() {
        return super.calcularPontuacao() + 10;
    }
}