package br.com.stefany.oo.heranca.desafio.override;

public class ContaBancaria {

    private String cliente;
    private int numConta;
    private float saldo;

    public ContaBancaria(String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        if ((this.saldo - valor) <= 0) {
            System.out.println("Não é possível sacar, saldo insuficiente!");
        } else {
            saldo = saldo - valor;
        }
    }

    public void depositar(float valor) {
        saldo = saldo + valor;
    }

    public void mostrarDadosDaConta() {
        System.out.println(this.cliente + " sua conta possui o número: "
                + this.numConta + " e o saldo atual é: R$" + this.saldo);
    }
}
