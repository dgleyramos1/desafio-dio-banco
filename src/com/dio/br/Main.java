package com.dio.br;

public class Main {
    public static void main(String[] args) {
        Cliente ramos = new Cliente();
        ramos.setNome("Ramos");
        Conta cc = new ContaCorrente(ramos);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(ramos);
        cc.transferir(50, poupanca);
        poupanca.transferir(49, cc);

    }
}
