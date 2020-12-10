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
public class ProfessorDaFaculdade extends EmpregadoDaFaculdade{
   
    private int horasDeAulas;
    
    public double getGastos(){
        return this.getGastos() + this.horasDeAulas *10;
    }
    
    public String getInfor(){
        String informacaoBasica = super.getInfor();
        String informacao = informacaoBasica + "Horas de Aulas: " +this.horasDeAulas;
        
        return informacao;
    }

    public int getHorasDeAulas() {
        return horasDeAulas;
    }

    public void setHorasDeAulas(int horasDeAulas) {
        this.horasDeAulas = horasDeAulas;
    }
    
}
