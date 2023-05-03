package com.polimorfismo.core;

public class ContaPoupanca extends Conta {

  @Override
  public void sacar(double valor) {
    this.saldo -= valor - 2;
  }
  
  public void simularRendimento() {
    this.saldo += this.saldo * 0.05;
  }

  public void simularRendimento(double taxa) {
    this.saldo += this.saldo * taxa;
  }
}
