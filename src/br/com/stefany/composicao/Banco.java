package br.com.stefany.composicao;


public class Banco {

    private Poupanca[] poups;
    private ContaCorrente[] cc;
    private int numConta, numPoupanca;


    public void iniciaBanco() {
        poups = new Poupanca[100];
        cc = new ContaCorrente[100];
        numConta = 1;
        numPoupanca = 1;
    }

    public void abreConta() {
        cc[numConta] = new ContaCorrente();
        numConta++;
    }

    public void abrePoupanca() {
        poups[numPoupanca] = new Poupanca();
        numPoupanca++;
    }

    public void falencia () {

    }
}
