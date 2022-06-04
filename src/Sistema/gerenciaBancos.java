package Sistema;

import java.io.PrintStream;
import java.util.Scanner;
import Classes.*;

public class gerenciaBancos{
    
    public static Scanner scan = new Scanner(System.in);
    
    protected static Bancos vetBancos[] = new Bancos[5];
    
    public static PrintStream listarBancos(){

        vetBancos[0] = new Bancos("Santander.");
        vetBancos[1] = new Bancos("Banco do Brasil.");
        vetBancos[2] = new Bancos("Itau");
        vetBancos[3] = new Bancos("Bradesco");
        vetBancos[4] = new Bancos("Caixa Economica Federal");

        String str = " ";

        for(int i = 0; i < vetBancos.length; i++){
            str += String.format("%s", vetBancos[i].toString());
        }
        return System.out.printf("\n%s", str);
    }
    
    public static void criarAgencia(){
        int cont;
        int numero;
        int op;

        System.out.println("Digite quantas agencias deseja criar: ");
        cont = scan.nextInt();
        
        while(cont < 0){
            System.out.println("Digite um valor maior que 0: ");
            cont = scan.nextInt();
        }
        
        while(cont > gerenciaAgencia.vetAgencias.length){
            System.out.println("Valor maximo de agencias permitidos sao 10: ");
            cont = scan.nextInt();
        }
        
        for(int i = 1; i <= cont; i++){     
            System.out.print("Digite o da agencia numero:");
            numero = scan.nextInt();
            System.out.printf("\n1 - para adicionar a agencia ao Santander."
                                +"\n2 - para adicionar a agencia ao Banco do Brasil."
                                +"\n3 - para adicionar a agencia ao Itau."
                                +"\n4 - para adicionar a agencia ao Bradesco."
                                +"\n5 - para adicionar a agencia ao Caixa Economica Federal.");
            System.out.print("\nSua opcao -> ");
            op = scan.nextInt();
            
            switch(op){
                case 1: gerenciaAgencia.vetAgencias[i+3] = new Agencias("Santander.", numero);break;
                case 2: gerenciaAgencia.vetAgencias[i+3] = new Agencias("Banco do Brasil.", numero);break;
                case 3: gerenciaAgencia.vetAgencias[i+3] = new Agencias("Itau.", numero);break;
                case 4: gerenciaAgencia.vetAgencias[i+3] = new Agencias("Bradesco.", numero);break;
                case 5: gerenciaAgencia.vetAgencias[i+3] = new Agencias("Caixa Economica Federal.", numero);break;
                default: System.out.println("Opcao nao disponivel.");
            }
        }
        System.out.format("\nAgencia criada com sucesso.");
    }
}
    


