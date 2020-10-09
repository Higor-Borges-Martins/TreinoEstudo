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
public class Casa {
    
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;
    
    void pinta(String tinta){
        
        cor = tinta;
    }
    
    int quantasPortasAberas(){
        int i = 0;
      if(porta1.aberta == "aberta"){
          i++;
      }
      if(porta2.aberta == "aberta"){
          i++;
      }
      if(porta3.aberta == "aberta"){
          i++;
      }
      return i;
    }
}
