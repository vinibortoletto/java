package controle;

import java.util.ArrayList;

public class Caminhao extends Veiculo implements ITransportador {

  public Caminhao(String placa, int anoFabricacao) {
    super(placa, anoFabricacao);
    this.setCombustivel("Diesel");
  }

  @Override
  public void abastecer(String local, String motorista, double valor) {
    this.abastecimentos
        .add(String.format("Local: base, Motorista: %s, valor: R$ %.2f", motorista, valor));
  }

  @Override
  public String transportar(String origem, String destino) {
    return String.format("Veículo de placa: %s, vai transportar carga" + " de %s para %s ",
        this.getPlaca(), origem, destino);
  }
}
