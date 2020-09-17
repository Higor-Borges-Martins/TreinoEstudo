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
public class TreinoEstudo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.titular = "Duki";
        minhaConta.saldo = 1000.00;
        System.out.println("Saldo atual " + minhaConta.saldo);
    }

}
