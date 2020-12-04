/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treino.casa;

import static java.lang.System.out;

/**
 *
 * @author GEMEOS
 */
public class Porta {

    String cor;
    int divencaox;
    int divencaoy;
    int divencaoz;

    String aberta;

    void abre() {
        
        aberta = "aberta";
    }
    
    void fecha(){
        aberta = "fechado";
    }
    
    void pinta(String tinta){
        cor = tinta;
    }
    
    boolean estaAberta(){
        if(aberta == "aberta"){
            
         return  true;
        }else{
            return false;
        }
    }
    
    
    @Override
    public String toString() {
        return "Porta{" + "cor=" + cor + ", divencaox=" + divencaox + ", divencaoy=" + divencaoy + ", divencaoz=" + divencaoz + ", aberta=" + aberta + '}';
    }
}
