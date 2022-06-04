package Sistema;

import java.util.Scanner;

import Classes.*;

public class gerenciaContas{

    public static Scanner scan = new Scanner(System.in);

    protected static Contas vetContas[] = new Contas[30];

    public static void abrirConta(){
        String nome, sobrenome, banco = " ";
        Agencias agencia;
        int numeroCorreto;
        double valorInicial;
        int cont;

        System.out.print("\nDigite quantas contas queres criar: ");
        cont = scan.nextInt();

        for(int i = 0; i < cont; i++){
            System.out.print("\nDigite o nome: ");
            nome = scan.next();
            System.out.println("\nDigite o sobrenome: ");
            sobrenome = scan.next();

            System.out.println("Bancos Disponiveis.");
            System.out.print(gerenciaBancos.listarBancos());
            System.out.print("\n1 - Santander."
                            +"\n2 - Banco do Brasil."
                            +"\n3 - Itau."
                            +"\n4 - Bradesco."
                            +"\n5 - Caixa Economica Federal.\n");
            System.out.print("\nSua opcao -> ");
            int op = scan.nextInt();
            
            switch(op){
                case 1: {
                    banco = "Santander";
                    break;
                }
                case 2: {
                    banco = "Banco do Brasil";
                    break;
                }
                case 3: {
                    banco = "Itau";
                    break;
                }
                case 4: {
                    banco = "Bradesco";
                    break;
                }
                case 5: {
                    banco = "Caixa Economica Federal";
                    break;
                }
                default: System.out.println("Opcao nao disponivel.");

            }

            System.out.println("\n");
            System.out.println("\nAgencias disponiveis.\n");
            gerenciaAgencia.listarAgencias();
            System.out.print("\nSua opcao -> ");
            numeroCorreto = scan.nextInt();
            
            agencia = new Agencias(banco, numeroCorreto);

            System.out.println("Faca um deposito: ");
            
            valorInicial = scan.nextDouble();
    
            vetContas[i] = new Contas(nome, sobrenome, agencia, valorInicial);
            System.out.println("Cliente cadastrado com sucesso.");
        }
    }

    public static void listarContas(){
        String str = " ";

        for(int i = 0; i < vetContas.length; i++){
            if(vetContas[i] == null) break;
            str += String.format("%s", vetContas[i].toString());
            System.out.printf("%s", str);
        }
    }

    public static void apagaConta(){
        listarContas();

        System.out.println("\nDigite o numero da conta para apagar: ");
        int numConta = scan.nextInt();

        for(int i = 0; i < vetContas.length; i++){
            if(vetContas[i] == null) break;
           while(vetContas[i].getNumero() == numConta){
               vetContas[i] = vetContas[5];
           } 
        }
        System.out.println("Conta apagada com sucesso.");
    }

    public static void mostraExtrato(){
        listarContas();
        String str = "";
        int numConta;
        System.out.println("Digite a conta para ver o Extrato.");
        numConta = scan.nextInt();

        for(int i = 0; i < vetContas.length; i++){
            if(vetContas[i] == null) break;
            if(vetContas[i].getNumero() == numConta){
                str += String.format("%s", vetContas[i].getExtrato());
                System.out.printf("%s", str);
            }
        }
    }

}
