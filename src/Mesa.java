import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numeroMesa;
    private List<ItemLoja> itensNaMesa;

    public Mesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
        this.itensNaMesa = new ArrayList<>();
    }

    public void adicionarItem(ItemLoja item) {
        itensNaMesa.add(item);
    }

    public void listarItens() {
        IO.println("--- Mesa #" + numeroMesa + " ---");
        for (ItemLoja item : itensNaMesa) {
            item.exibirDetalhes();
            if (item instanceof IAnimavel) {
                ((IAnimavel) item).animarInteracao(); // POLIMORFISMO COM INTERFACE
            }
        }
    }

    public int calcularPontuacaoMesa() {
        int total = 0;
        for (ItemLoja item : itensNaMesa) {
            total += item.calcularPontuacao();
        }
        return total;
    }
}