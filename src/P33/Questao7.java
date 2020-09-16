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
public class Questao7 {
    
    public static void main(String[] arsg){
        
        long x = 14;
     
        while( x !=1){
          
            if(x % 2 == 0){
                x = x /2;
            }else{
                
                x = 3 * x + 1;
            }
            System.out.println(x);
        }
    }
}
