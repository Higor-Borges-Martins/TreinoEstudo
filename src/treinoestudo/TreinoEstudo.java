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
//        Conta minhaConta;
//        minhaConta = new Conta();
//        minhaConta.titular = "Duki";
//        minhaConta.saldo = 1000.00;
//        System.out.println("Saldo atual " + minhaConta.saldo);
//        
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
//        Cliente c = new Cliente();
//        minhaConta.titular = c;
//        minhaConta.titular.nome = "Duke";

//        c1.depositar(100);
//        c2.saldo = c1.saldo;
//        c2.depositar(200);
//        System.out.println(c1.saldo);
//        System.out.println(c2.saldo);
//        c1.saldo = 10;
//        c1.titular = "Duki";
//        c2.saldo = 10;
//        c2.titular = "Duki";
//        if(c1 == c2){
//            System.out.println("são iguais");
//        }else{
//            System.out.println("Não");
//        }
//        
//       if( c1.transferePara(c2, 5)){
//           System.out.println(c1.saldo);
//           System.out.println(c2.saldo);
//       }
Conta minhaConta = new Conta();
Conta outraConta = new Conta();
minhaConta.titular = "Hugo";
minhaConta.agencia = "45678-9";
minhaConta.saldo = 50.0;
minhaConta.dataAbertura = "04/05/1997";

minhaConta.depositar(30);
System.out.println("saldo atual " + minhaConta.saldo);
System.out.println(minhaConta.calcularRendimento());
System.out.println(minhaConta.titular);
System.out.println(minhaConta.numeroDaConta);
System.out.println(minhaConta.dataAbertura);

minhaConta.transferePara(outraConta, 15);
System.out.println(minhaConta.saldo);
System.out.println(outraConta.saldo);

    }

}
