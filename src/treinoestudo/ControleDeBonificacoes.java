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
public class ControleDeBonificacoes {
    
    private double totalDeBonificacoes = 0;
    
    public void registro(Funcionario funcionario){
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }
    
    public double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;
    }
    
}
