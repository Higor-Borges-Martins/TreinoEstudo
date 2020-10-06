/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricaDeCarros;

/**
 *
 * @author GEMEOS
 */
public class Carro {

    String cor;
    String modelo;
    double velocidadeMaxima;
    double velocidadeAtual;
    Motor motor;

    // ligar o carro
    void liga() {
        System.out.println(" O carro está ligado");
    }

    // Acelerar uma certa quartia
    void acelerando(double quantidade) {
        double velocidadeNova = this.velocidadeAtual + quantidade;
        this.velocidadeAtual = velocidadeNova;
    }

    //Devolver a macha do carro
    int pegaeMarcha() {

        if (this.velocidadeAtual < 0) {
            return -1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
            return 1;
        }
        if(this.velocidadeAtual >= 40 && this.velocidadeAtual < 80){
            return 2;
        }
        return 3;
    }
}
