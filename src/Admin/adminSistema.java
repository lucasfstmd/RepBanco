package Admin;
import java.util.*;

import Sistema.*;

public class adminSistema{

    public static Scanner scan = new Scanner(System.in);
    
    public static void menuPrinc(){
        int op;
        System.out.format("\n:Banco para Jucelio Lindo:"
                    +"\n1 - Gerenciar Bancos"
                    +"\n2 - Gerenciar Contas"
                    +"\n3 - Operar Contas"
                    +"\n0 - Para sair");
        System.out.format("\nSua opcao -> ");
        op = scan.nextInt();

        switch(op){
            case 1: menuBancos();break;
            case 2: menuContas();break;
            case 3: menuOperacao();break;
            default:System.out.println("Opcao nao disponivel.");
        }
    }
    
    public static void menuBancos(){
        int op;
        System.out.format("\n:Gerenciar Bancos:"
                        +"\n-------------------------------"
                        +"\n1 - Listar Bancos."
                        +"\n2 - Listar Agencias"
                        +"\n3 - Adicionar nova Agencia."
                        +"\n4 - Excluir Agencia."
                        +"\n0 - Voltar ao menu anterior.");
        
        System.out.print("\nSua opcao -> ");
        op = scan.nextInt();
    
        switch(op){
            case 1: gerenciaBancos.listarBancos(); menuBancos(); break;
            case 2: gerenciaAgencia.listarAgencias();menuBancos();break;
            case 3: gerenciaBancos.criarAgencia();menuBancos();break;
            case 4: gerenciaAgencia.apagaAgencia();menuBancos();break;
            case 0: menuPrinc();break;
            default: System.out.println("Opcao nao disponivel.");menuBancos();break;
        }
    }
    
    public static void menuContas(){
        int op;
        System.out.format("\n:Gerenciar Contas:"
                        +"\n---------------------"
                        +"\n1 - Listar Contas."
                        +"\n2 - Adicionar nova Conta (novo cliente)."
                        +"\n3 - Excluir Contas."
                        +"\n0 - Voltar ao menu anterior.");
        
        System.out.print("\nSua opcao -> ");
        op = scan.nextInt();

        switch(op){
            case 1: gerenciaContas.listarContas();menuContas();break;
            case 2: gerenciaContas.abrirConta();menuContas(); break;
            case 3: gerenciaContas.apagaConta();menuContas(); break;
            case 0: menuPrinc();break;
            default: System.out.println("Opcao nao disponivel");menuContas();break;
        }
    }
    
    public static void menuOperacao(){
        int op;
        int numContaA, numContaB;
        double valor;
        System.out.format("\n:Menu Opercao:"
                        +"\n---------------------------------"
                        +"\n1 - para Depositar."
                        +"\n2 - para Trasferir."
                        +"\n3 - para Sacar"
                        +"\n4 - para ver o Extrato."
                        +"\n0 - para voltar ao menu anterior");

        System.out.print("\nSua opcao -> ");
        op = scan.nextInt();

        switch(op){
            case 1:{
                gerenciaContas.listarContas();
                System.out.print("\nEscolha o numero da conta: ");
                numContaA = scan.nextInt();
                System.out.println("\nDigite o valor a ser depositado: ");
                valor = scan.nextDouble();
                gerenciaTransacao.Deposito(valor, numContaA);
            };menuOperacao();break;
            case 2:{
                gerenciaContas.listarContas();
                System.out.print("\nEscolha o numero da conta que recebera: ");
                numContaA = scan.nextInt();
                System.out.print("\nEscolha o numero da conta que ira trasferir: ");
                numContaB = scan.nextInt();
                System.out.println("\nDigite o valor a ser transferido: ");
                valor = scan.nextDouble();
                gerenciaTransacao.Transferencia(valor, numContaA, numContaB);

            };menuOperacao();break;
            case 3:{
                gerenciaContas.listarContas();
                System.out.print("\nEscolha o numero da conta que ira sacar: ");
                numContaA = scan.nextInt();
                System.out.print("\nDigite quanto sera sacado: ");
                valor = scan.nextDouble();
                gerenciaTransacao.Saque(valor, numContaA);
            };menuOperacao();break;
            case 4: gerenciaContas.mostraExtrato();menuOperacao();break;
            case 0: menuPrinc();break;
            default: System.out.println("Opcao nao disponivel");break;
        }
    }
}



