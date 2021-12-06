package com.dio.br;

public abstract class Conta implements IConta {


    private int agencia;
    private int conta;
    private int saldo;


    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public int getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }
}
