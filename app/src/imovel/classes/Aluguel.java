package imovel.classes;

import java.time.LocalDate;

public class Aluguel extends Imovel {
  private double valorAluguel;
  private boolean alugado;

  public Aluguel(String endereco, LocalDate dataCadastro, double valorAluguel) {
    super(endereco, dataCadastro);
    this.valorAluguel = valorAluguel;
    this.alugado = false;
  }

  public boolean isAlugado() {
    return alugado;
  }

  public void alugar() {
    this.alugado = true;
  }

}
