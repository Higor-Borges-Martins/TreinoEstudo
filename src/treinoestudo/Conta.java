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

    int numero;
    Cliente titular;
    double saldo;

    boolean saca(double quantidade) {
        if (this.saldo < quantidade) {
            return false;
        } else {
            this.saldo -= quantidade;
            return true;
        }
    }

    void depositar(double quantidade) {

        this.saldo += quantidade;
    }
    
    boolean transferePara(Conta destino, double valor){
        
        boolean retirada = this.saca(valor);
        if(retirada == false){
            return false;
        }else{
            destino.depositar(valor);
            return true;
        }
    }
}
