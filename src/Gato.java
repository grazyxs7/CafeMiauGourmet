public class Gato extends ItemLoja implements IAnimavel {
    private String raca;
    private String nivelCarinho;

    public Gato(String nome, double preco, int raridade, String raca, String nivelCarinho) {
        super(nome, preco, raridade);
        this.raca = raca;
        this.nivelCarinho = nivelCarinho;
    }

    @Override
    public void exibirDetalhes() {
        IO.println("🐈 [Gatinho] " + nome + " | Raça: " + raca + " | Carinho: " + nivelCarinho);
    }

    @Override
    public void animarInteracao() {
        IO.println("🐾 O gatinho " + nome + " ronrona alegremente e se esfrega nas suas pernas!");
    }


    @Override
    public int calcularPontuacao() {
        return super.calcularPontuacao() * 2;
    }
}