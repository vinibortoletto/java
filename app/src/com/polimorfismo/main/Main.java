package com.polimorfismo.main;

import com.polimorfismo.core.ContaCorrente;
import com.polimorfismo.core.ContaPoupanca;

public class Main {
  public static void main(String[] args) {
    ContaCorrente contaCorrente = new ContaCorrente();
    contaCorrente.depositar(100);
    System.out.println("Saldo conta corrente: " + contaCorrente.getSaldo());

    ContaPoupanca contaPoupanca = new ContaPoupanca();
    contaPoupanca.depositar(100);
    System.out.println("Saldo conta poupança: " + contaPoupanca.getSaldo());

    System.out.println("---------------------------------------------");

    contaCorrente.sacar(50);
    contaPoupanca.sacar(50);
    System.out.println("Saldo conta corrente: " + contaCorrente.getSaldo());
    System.out.println("Saldo conta poupança: " + contaPoupanca.getSaldo());

    System.out.println("---------------------------------------------");

    contaPoupanca.simularRendimento();
    System.out.println("Saldo conta poupança: " + contaPoupanca.getSaldo());
    contaPoupanca.simularRendimento(0.07);
    System.out.println("Saldo conta poupança: " + contaPoupanca.getSaldo());

  }
}
