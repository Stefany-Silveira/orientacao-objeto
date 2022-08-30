package br.com.stefany.oo;

public class Conta1 {

    private String numero;
    private float saldo;
    private float valor;

    public static void main(String[] args) {

        Conta1[] contas = new Conta1[100];

        contas[0] = new Conta1("856-9", 300);
        System.out.println("Saldo atual da conta: R$" + contas[0].getSaldo());
        System.out.println("Debitando R$20");
        contas[0].debitar(20);
        System.out.println("Saldo atual: R$ " + contas[0].getSaldo());

        System.out.println("-----------------------------------");

        contas[1] = new Conta1("789-6", 100);
        System.out.println("Saldo atual da conta: R$" + contas[1].getSaldo());
        System.out.println("Debitando R$10");
        contas[1].debitar(10);
        System.out.println("Saldo atual: R$ " + contas[1].getSaldo());

        System.out.println("-----------------------------------");
        contas[2] = new Conta1("652", 600);
        contas[2].debitar(100);

        UtilitarioContas uc = new UtilitarioContas();

        uc.imprimirContas(contas);
        uc.somarSaldos(contas);
    }

    public Conta1(String numero, float saldo) {
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
