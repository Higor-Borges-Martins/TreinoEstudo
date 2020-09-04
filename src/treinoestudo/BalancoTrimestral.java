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
public class BalancoTrimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestrais = gastosJaneiro + gastosFevereiro + gastosMarco;
        double mediaMensal = gastosTrimestrais / 3;
        System.out.println(gastosTrimestrais);
        System.out.println("Valor da média mensal" + mediaMensal);
        
        double pi = 3.14;
        int d3 = (int) pi;
        float zero = 0.0f;
        System.out.println(zero);
        
        
    }
    
}
