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
    
    // ligar o carro
    
    void liga(){
        System.out.println(" O carro está ligado");
    }
    
    // Acelerar uma certa quartia
    
    void acelerando(double quantidade){
        double velocidadeNova = this.velocidadeAtual + quantidade;
        this.velocidadeAtual = velocidadeNova;
    }
}
