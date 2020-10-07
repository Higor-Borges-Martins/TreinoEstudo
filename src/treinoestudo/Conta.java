/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treinoestudo;

/**
 *
 * @author GEMEOS
 */
public class Conta {

    int numeroDaConta;
    String titular;
    String agencia;
    double saldo;
    Data dataAbertura;

    void sacar(double quantidade) {
        if (this.saldo < quantidade) {
        } else {
            this.saldo -= quantidade;
            System.out.println(this.saldo);
        }
    }

    void depositar(double quantidade) {

        this.saldo += quantidade;
    }

    void transferePara(Conta destino, double valor) {

        this.sacar(valor);
        destino.depositar(valor);

    }

    double calcularRendimento() {
        return this.saldo * 0.1;
    }

    String RecuperarDados() {
        String dados = "Numero da conta " + this.numeroDaConta + "\n Titular " + this.titular + "\n Agencia " + this.agencia + "\n Saldo " + this.saldo
                + "\n Data de Abertura " + this.dataAbertura.formadata() + "\n Rendimento da Conta " + this.calcularRendimento();
        return dados;

    }
}
