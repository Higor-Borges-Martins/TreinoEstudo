/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treinoestudo;

import br.com.treino.casa.Porta;
import java.text.ParseException;
/**
 *
 * @author GEMEOS
 */
public class TreinoEstudo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {

        /**
         * com essa combinação podemos inserir<b>marcações</b> HTML em
         * <i>nossos</i> comentários.
         */
        // TODO code application logic here
        //imprimir idade
        //        int idade = 15;
        //        System.out.println(idade);
        //        //imprimir dade ano que vem
        //        int idadeAnoQueVem = idade + 1;
        //        System.out.println(idadeAnoQueVem);
        //        int idade = 15;
        //        boolean amigoDoDono = false;
        //        if(idade >18 && !amigoDoDono){
        //            System.out.println(" pode entrar");
        //        }else{
        //            System.out.println("Não Pode entrar");
        //        }
        //        for(int i = 1; i< 10; i++){
        //            System.err.println(i);
//        int x = 100;
//       long y = x;
//       
//        System.out.println(y);
//       y -=x;
//        System.out.println(y);
//        Cliente c1 = new Cliente();
//        Conta minhaConta = new Conta(c1);
//        int total = Conta.getTotalDeContas();

//        minhaConta.depositar(100);
//        
////        minhaConta.titular = "Duki";
////        minhaConta.saldo = 1000.00;
//        System.out.println("Saldo atual " + minhaConta.saldo);
//        
//        minhaConta.sacar(50000);
//        System.out.println(minhaConta.saldo);
//        Conta meuSonho = new Conta();
//        meuSonho.saldo = 150000;
//        System.out.println("Meu sonho " + meuSonho.saldo);
//        
//      boolean conseguir =  minhaConta.saca(200);
//        if(conseguir){
//            System.out.println("Conseguil sacar");
//        }else{
//            
//            System.out.println("não conseguil sacar");
//        }
//        System.out.println(minhaConta.saldo);
//        
//        minhaConta.depositar(500);
//        System.out.println(minhaConta.saldo);
//        Conta minhaConta = new Conta();
//        minhaConta.titular.nome = "Duke";
//        c1.depositar(100);
//        c2.saldo = c1.saldo;
//        c2.depositar(200);
//        System.out.println(c1.saldo);
//        System.out.println(c2.saldo);
//        c1.idade = 10;
//        c1.nome = "Duki";
//        c1.sobreNome = "B";
//        c1.validarCpf("123.456.-78");
//        System.out.println(c1.toString());
//        minhaConta.setTitular(c1);
//        c1.mudarCpf("123.456.90");
//        System.out.println(c1.toString());
//        System.out.println(total);
////        if(c1 == c2){
//            System.out.println("são iguais");
//        }else{
//            System.out.println("Não");
//        }
//        
//       if( c1.transferePara(c2, 5)){
//           System.out.println(c1.saldo);
//           System.out.println(c2.saldo);
//       }
//Conta minhaConta = new Conta();
//Conta outraConta = new Conta();
//Data data = new Data();
//
//
//minhaConta.titular = "Hugo";
//        minhaConta.setAgencia("45678-9");
//        minhaConta.depositar(50.0);
//        minhaConta.depositar(30.0);
//        minhaConta.abertura("31/02/2000");
//        minhaConta.RecuperarDados();
//        System.out.println(minhaConta.RecuperarDados());

//
//data.dia = 04;
//data.mes = 05;
//data.ano = 1997;
//minhaConta.dataAbertura = data;
//
//minhaConta.depositar(30);
//
//minhaConta.transferePara(outraConta, 15);
//System.out.println(minhaConta.RecuperarDados());
//
//outraConta.titular = "João";
//outraConta.agencia = "98765-4";
//outraConta.numeroDaConta = 1;
//data.dia = 11;
//data.mes = 11;
//data.ano = 11;
//outraConta.dataAbertura = data;
//outraConta.depositar(5.0);
//        System.out.println("\n");
//        System.out.println(outraConta.RecuperarDados());
//        
//       outraConta = minhaConta;
//      
//        
//        if(minhaConta == outraConta){
//            System.out.println("São iguais");
//        }else{
//            System.out.println("Não iguais");
//        }
//System.out.println(outraConta.RecuperarDados());
//Pessoa p = new Pessoa();
//
//p.nome = "Hugo";
//p.idade = 5;
//p.fazAniversario();
//System.out.println(p.nome + p.idade);
//p.fazAniversario();
//System.out.println(p.nome + p.idade);
//        Casa c;
//        c= new Casa();
//        p.abre();
//        c.porta1 = p;
//        c.porta2 = p;
//         p.fecha();
//        c.porta3 = p;
//        c.pinta("azul-marino");
//        
//        System.out.println(c.cor + "Portas abertas" + c.quantasPortasAberas());
//    Gerente gerente = new Gerente();
//    
//    gerente.setNome("Pedro");
//    gerente.setSenha(123);
//    
//        System.out.println("O novo gerente é " + gerente.getNome());
//        gerente.setSalario(5000.00);
//        System.out.println(gerente.getBonificacao());
//        
//        Funcionario funcionario = new Funcionario();
//        funcionario = gerente;
//        System.out.println("Bonificação do funcionario" + funcionario.getBonificacao());
        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        
        Gerente funcionario1 = new Gerente();
        funcionario1.setNome("Pedro");
        funcionario1.setSalario(100.00);
        controle.registro(funcionario1);
        
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(500.00);
        controle.registro(funcionario2);
        
        System.out.println(controle.getTotalDeBonificacoes());
        
    }
}
