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
public class Data {
    
    int dia;
    int mes;
    int ano;
    
    String formadata(){
        String data = dia+"/"+mes+"/"+ano;
        return data;
    }
}
