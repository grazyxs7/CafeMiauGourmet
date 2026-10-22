public class Main {
    public static void main(String[] args) {
        Cafeteria meuCafe = new Cafeteria("Café Miau Gourmet");
        Mesa mesa1 = new Mesa(1);

        // O moldezinho 'Bolo' sendo usado para criar vários bolos diferentes:
        ItemLoja boloMorango = new Bolo("Bolo Red Velvet", 45.0, 2, "Morango com Cream Cheese");
        ItemLoja boloChocolate = new Bolo("Bolo Trufado", 50.0, 3, "Chocolate Belga");
        ItemLoja boloCenoura = new Bolo("Bolo de Cenoura", 25.0, 1, "Chocolate Cremoso");

        // Colocando na mesa
        mesa1.adicionarItem(boloMorango);
        mesa1.adicionarItem(boloChocolate);
        mesa1.adicionarItem(boloCenoura);

        meuCafe.adicionarMesa(mesa1);
        meuCafe.abrirCafeteria();
    }
}