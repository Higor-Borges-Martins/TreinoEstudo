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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fibonacci fibonacci = new Fibonacci();
        
        for(int i = 1; i <= 6; i++){ 
            int resultado = fibonacci.calculadoFibonacci(i);
            System.out.println(resultado);
        }
    }
    
}
