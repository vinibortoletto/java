package com.polimorfismo.core;

public abstract class Conta {
  protected double saldo;
  
  public double getSaldo() {
    return saldo;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public abstract void sacar(double valor);
}
