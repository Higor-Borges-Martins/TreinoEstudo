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
public class Gerente extends Funcionario{
    
    private int senha;
    private int numeroDeFuncionariosGerenciados;


    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
    public boolean auteticarSenha(int senha){
        if(this.senha == senha){
            System.out.println("Acesso permitido ");
            return true;
        }else{
            System.out.println("Acesso negado");
            return false;
        }
    }
    @Override
    public double getBonificacao(){
        return super.getBonificacao()+ 1000;
    }
}
