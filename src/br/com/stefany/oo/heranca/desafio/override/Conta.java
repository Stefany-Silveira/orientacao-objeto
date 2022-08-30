package br.com.stefany.oo.heranca.desafio.override;

public class Conta {
    // Incluir dados relativos a(s) conta(s) de um cliente;
    //Sacar um determinado valor da(s) sua(s) conta(s);
    //Depositar um determinado valor na(s) sua(s) conta(s);
    //Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles
    //que possuem conta poupança;
    //Mostrar os dados da(s) conta(s) de um cliente;

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Maria", 123, 2000);
        conta1.mostrarDadosDaConta();
        conta1.depositar(1500);
        conta1.mostrarDadosDaConta();
        conta1.sacar(5000);
        conta1.mostrarDadosDaConta();

        System.out.println("-----------------------------------");

        ContaPoupanca conta2 = new ContaPoupanca("João", 456, 1000,3);
        conta2.depositar(1500);
        conta2.mostrarDadosDaConta();
        conta2.calcularNovoSaldo(4);
        conta2.sacar(50500);
        conta2.mostrarDadosDaConta();


        System.out.println("-----------------------------------");

        ContaEspecial conta3 = new ContaEspecial("Ana", 987, 8000, 1000);
        conta3.depositar(1500);
        conta3.mostrarDadosDaConta();
        conta3.sacar(1000);
        conta3.mostrarDadosDaConta();
        conta3.sacar(1000);
        conta3.mostrarDadosDaConta();
    }
}
