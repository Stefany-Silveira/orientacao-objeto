package br.com.stefany.oo;

public class Conta {

    //Atributos
    private String numero;
    private float saldo;
    private float valor;

    public static void main(String[] args) {

        Conta conta1 = new Conta("123-4", 2000);
        System.out.println("Saldo atual: R$ " + conta1.getSaldo());
        System.out.println("Debitando R$ 100");
        conta1.debitar(100);
        System.out.println("Saldo atual: R$ " + conta1.getSaldo());
        System.out.println("Número da conta: " + conta1.getNumero());

        System.out.println("-----------------------------------------------");

        Conta conta2 = new Conta("567-8", 1000);
        System.out.println("Saldo atual: R$ " + conta2.getSaldo());
        System.out.println("Debitando R$ 200");
        conta2.debitar(200);
        System.out.println("Saldo atual: R$ " + conta2.getSaldo());
        System.out.println("Número da conta: " + conta2.getNumero());

    }

    //Construtor
    public Conta(String numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void debitar(float valor) {
        saldo = saldo - valor;
    }

    public void creditar(float saldo) {
        saldo = saldo + valor;
    }
}
