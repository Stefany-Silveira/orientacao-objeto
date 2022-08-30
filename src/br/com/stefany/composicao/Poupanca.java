package br.com.stefany.composicao;

public class Poupanca {

    private float saldo;

    public void saque() {
        saldo -= 10.0f;
        System.out.println("Novo Saldo: " + saldo);
    }

    public void deposita() {
        saldo += 10.0F;
        System.out.println("Novo Saldo: " + saldo);
    }

}
