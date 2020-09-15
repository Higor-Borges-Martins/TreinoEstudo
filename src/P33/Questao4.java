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
public class Questao4 {

    
        static long fibo(int n){
          if( n < 2 ){  
              return n;
        }else {
              return fibo(n -1) + fibo(n -2);
          }
    
}
    
    public static void main(String[] args) {
      
        for(int i = 0; i<30; i++){
            System.out.println("(" + i + "):" + Questao4.fibo(i) + "\t");
        }
    }
}
