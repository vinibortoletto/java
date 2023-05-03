package imovel.main;

import imovel.classes.Aluguel;
import imovel.classes.Venda;
import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Aluguel apt1 = new Aluguel("endereço 1", LocalDate.now(), 1000);
    System.out.println("Endereço: " + apt1.getEndereco());

    Venda apt2 = new Venda("endereço 2", LocalDate.now(), 100000);
    System.out.println("Valor da venda: " + apt2.getValorVenda());
  }
}
