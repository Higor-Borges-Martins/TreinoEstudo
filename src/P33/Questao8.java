/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P33;

/**
 *
 * @author GEMEOS
 */
public class Questao8 {

    public static void main(String[] arsg) {
      
        int resposta;
                
        for (int i = 1; i < 10; i++) {

            for (int j = 1; j != i + 1; j++) {
                
                resposta = i * j;
            
                    System.out.print(resposta);
               
            }
            System.out.println("");
        }
    }
}
