/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treino.casa;

/**
 *
 * @author GEMEOS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Porta p = new Porta();

        p.abre();
        p.pinta("azul");
        p.divencaox = 1;
        p.divencaoy = 2;
        p.divencaoz = 3;

        if (p.estaAberta()) {

            System.out.println("aberta");
        } else {
            System.out.println("fechada");
        }

        System.out.println(p.toString());

        p.pinta("Verde");
        p.fecha();
        if (p.estaAberta()) {
            System.out.println("aberta");
        } else {
            System.out.println("fechada");
        }
        System.out.println(p.toString());
    }

}
