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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro meuCarro;
        meuCarro = new Carro();
        
        meuCarro.cor = "Azul";
        meuCarro.modelo = "funsca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;
        
        meuCarro.liga();
        
        meuCarro.acelerando(20);
        System.out.println(meuCarro.velocidadeAtual);
    }
    
}
