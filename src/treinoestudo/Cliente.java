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
public class Cliente {

    String nome;
    String sobreNome;
    private String cpf;
    int idade;

    
    public void mudarCpf(String cpf) {
        if (this.idade <= 60) {
            validarCpf(cpf);
        } else {
            this.cpf = cpf;
        }
    }

    public void validarCpf(String cpf) {

        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", sobreNome=" + sobreNome + ", cpf=" + cpf + ", idade=" + idade + '}';
    }

}
