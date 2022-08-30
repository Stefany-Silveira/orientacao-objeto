package br.com.stefany.oo.encapsulamento;

import br.com.stefany.oo.encapsulamento.Conta1;

public class UtilitarioContas {

        public void imprimirContas(Conta1[] contas) {
            for (int i = 0; i < contas.length; i++) {
                if (contas[i] != null) {
                    System.out.println("Número da Conta: " + contas[i].getNumero()
                            + " Saldo: R$" + contas[i].getSaldo());

                }
            }
        }

        public void somarSaldos(Conta1[] contas) {
            float saldoTotal = 0.0f;
            for (int i = 0; i < contas.length; i++) {
                if (contas[i] != null) {
                    saldoTotal = saldoTotal + contas[i].getSaldo();
                }
            }
            System.out.println("O saldo total é: R$" + saldoTotal);
        }
}
