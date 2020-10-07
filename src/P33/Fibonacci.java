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
public class Fibonacci {
    
    int fat2 = 0;
    
    int calculadoFibonacci(int fat1){
      
        fat1 = fat1 + fat2;
        fat2 = fat1 - fat2;
        System.out.println(fat1);
//        this.calculadoFibonacci(fat1);
        
        return fat1;
    }
}
