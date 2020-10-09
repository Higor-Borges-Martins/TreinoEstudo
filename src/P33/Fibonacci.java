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

    int calculadoFibonacci(int n) {

        return (n < 2) ? n: calculadoFibonacci(n - 1) + calculadoFibonacci(n - 2);

    }
}
