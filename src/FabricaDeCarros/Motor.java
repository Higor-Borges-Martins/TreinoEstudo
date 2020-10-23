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
public class Motor {
    int potencia;
    String tipo;
    
    private static Motor modelo;
    
    private Motor(){
    }
    
    public static synchronized Motor getModelo(){
        if(modelo == null){
            modelo = new Motor();
        }
        return modelo;
    } 
   
}
