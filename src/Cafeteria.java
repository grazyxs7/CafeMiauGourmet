import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
    private String nomeCafe;
    private List<Mesa> mesas; // AGREGAÇÃO: O Café agrega mesas

    public Cafeteria(String nomeCafe) {
        this.nomeCafe = nomeCafe;
        this.mesas = new ArrayList<>();
    }

    public void adicionarMesa(Mesa mesa) {
        mesas.add(mesa);
    }

    public void abrirCafeteria() {
        IO.println("☕ Bem-vindo ao " + nomeCafe + "!");
        IO.println("========================================");
        int pontuacaoTotal = 0;
        for (Mesa mesa : mesas) {
            mesa.listarItens();
            pontuacaoTotal += mesa.calcularPontuacaoMesa();
            System.out.println();
        }
        IO.println("⭐ Pontuação Total de Satisfação: " + pontuacaoTotal + " pontos!");
    }
}