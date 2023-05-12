package controle;

public class Principal {
  public static void main(String[] args) {
    Carro carro = new Carro("123", 2018);
    Caminhao caminhao = new Caminhao("123", 2011); 

    carro.abastecer("Posto 1", "Pedro", 180);
    carro.abastecer("Posto 2", "Atanes", 280);

    caminhao.abastecer("Posto 1", "Pedro", 180);
    caminhao.abastecer("Posto 2", "Atanes", 280);

    carro.listaAbastecimentos();
    caminhao.listaAbastecimentos();

  }
}
