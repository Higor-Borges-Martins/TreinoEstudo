/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treinoestudo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    private LocalDate dataAbertura;
    
    private static int indentificador;
    
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    Conta(Cliente titular) {
        
        this.titular = titular;
        Conta.indentificador++;
    }
    
    Conta(int numero, Cliente titular) {
        this(titular);
        this.numeroDaConta = numero;
    }
    
    public int getNumeroDaConta() {
        return this.numeroDaConta;
        
    }
    
    public void setNumeroDaConta(int numero) {
        this.numeroDaConta = numero;
    }
    
    public double getSaldo() {
        
        return this.saldo;
    }
    
    public Cliente getTtitular() {
        return this.titular;
    }
    
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public String getAgencia() {
        return this.agencia;
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public static int getTotalDeContas() {
        
        return Conta.indentificador;
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
        } else {
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
        this.dataAbertura = LocalDate.parse(abertura, formato);
    }
    
    public String RecuperarDados() {
        String dados = "Indentificador" + Conta.indentificador + "Numero da conta " + this.numeroDaConta + "\n Titular " + this.titular + "\n Agencia " + this.agencia + "\n Saldo " + this.saldo
                + "\n Data de Abertura " + formato.format(dataAbertura) + "\n Rendimento da Conta " + this.calcularRendimento();
        return dados;
        
    }

//    public boolean dataValida(String dataIce) {
//
//        try {
//            LocalDate.parse(dataIce, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
////            LocalDate.parse(dataIce);
//            return true;
//
//        } catch (DateTimeException e) {
//            return false;
//        }
//    }
}
