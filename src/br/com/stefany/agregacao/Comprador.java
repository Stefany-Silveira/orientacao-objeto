package br.com.stefany.agregacao;

public class Comprador {

    private  float Verba;

    public float getVerba() {
        return Verba;
    }

    public void setVerba(float verba) {
        Verba = verba;
    }

    public void compra() {
        System.out.println("Comprado!");
    }
}
