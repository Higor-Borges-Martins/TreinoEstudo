/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treino.faculdade;

/**
 *
 * @author GEMEOS
 */
public class Reitor extends EmpregadoDaFaculdade{
    
    public String getInfor(){
        return super.getInfor() + "e ele é o reitor";
    }
}
