package br.com.stefany.oo.heranca.desafio.override;

public class ContaEspecial extends ContaBancaria {

    private float limite;


    public ContaEspecial(String cliente, int numConta, float saldo, float limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (((this.getSaldo() + this.limite) - valor) <= 0) {
            System.out.println("Você não pode sacar além do sue limite...");
        } else {
            this.setSaldo(this.getSaldo() - valor);
        }
    }
}
