import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private int numeroMesa;
    private List<ItemLoja> itens;
    private boolean fechada;

    // Construtor
    public Comanda(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.itens = new ArrayList<>();
        this.fechada = false; // Começa aberta
    }

    // Adiciona um item na comanda
    public void adicionarItem(ItemLoja item) {
        if (!fechada) {
            itens.add(item);
        } else {
            System.out.println("Erro: Esta comanda já está fechada!");
        }
    }

    // Calcula o valor total em dinheiro (R$) dos itens
    public double calcularTotalConta() {
        double total = 0.0;
        for (ItemLoja item : itens) {
            total += item.getPreco(); // Supondo que ItemLoja tem o método getPreco()
        }
        return total;
    }

    // Fecha a comanda
    public void fecharComanda() {
        this.fechada = true;
    }

    public boolean isFechada() {
        return fechada;
    }
}
