/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treinoestudo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author GEMEOS
 */
public class Conta {

    private int numeroDaConta;
    private Cliente titular;
    private String agencia;
    private double saldo;
    double limite;
    private Date dataAbertura;

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    
    Conta() {
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo + this.limite;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void sacar(double quantidade) {
        if (this.saldo < quantidade) {

            System.out.println("Quantidade exerdi o saldo");
        } else {
            this.saldo -= quantidade;
            System.out.println(this.saldo);
        }
    }

    void depositar(double quantidade) {
        if (quantidade < 0) {
            System.out.println("Valor negativo");
        }else{
        this.saldo += quantidade;
        }
    }

    void transferePara(Conta destino, double valor) {

        this.sacar(valor);
        destino.depositar(valor);

    }

    double calcularRendimento() {
        return this.saldo * 0.1;
    }

    public void abertura(String abertura) throws ParseException {
        this.dataAbertura = formato.parse(abertura);
    }

    public String RecuperarDados() {
        String dados = "Numero da conta " + this.numeroDaConta + "\n Titular " + this.titular + "\n Agencia " + this.agencia + "\n Saldo " + this.saldo
                + "\n Data de Abertura " + formato.format(dataAbertura) + "\n Rendimento da Conta " + this.calcularRendimento();
        return dados;

    }
}
