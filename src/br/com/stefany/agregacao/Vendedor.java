package br.com.stefany.agregacao;

public class Vendedor {

    private float Comissao;

    public float getComissao() {
        return Comissao;
    }

    public void setComissao(float comissao) {
        Comissao = comissao;
    }

    public void vende() {
        System.out.println("Vendido");
    }
}
