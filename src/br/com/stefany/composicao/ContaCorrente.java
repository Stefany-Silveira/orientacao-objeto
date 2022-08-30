package br.com.stefany.composicao;

public class ContaCorrente {

    private float saldo;

    public void saque() {
        saldo -= 100.0f;
        System.out.println("Novo Saldo: " + saldo);
    }

    public void deposito() {
        saldo += 100.0f;
        System.out.println("Novo Saldo: " + saldo);
    }
}
