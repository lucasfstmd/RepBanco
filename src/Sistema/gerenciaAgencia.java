package Sistema;

import java.util.Scanner;
import Classes.Agencias; 

public class gerenciaAgencia {
    
    public static Scanner scan = new Scanner(System.in);

    protected static Agencias vetAgencias[] = new Agencias[10]; 

    public static void listarAgencias(){

        vetAgencias[0] = new Agencias("Santander", 50);
        vetAgencias[1] = new Agencias("Banco do Brasil", 39);
        vetAgencias[2] = new Agencias("Itau", 72);
        vetAgencias[3] = new Agencias("Bradesco", 21);
        vetAgencias[4] = new Agencias("Caixa Economica Federal", 103);
        vetAgencias[5] = new Agencias(" ", 0);

        String str = " ";

        for(int i = 0; i <= 4; i++){
            if(vetAgencias[i] == null) break;
            str += String.format("%s", vetAgencias[i].toString());
            System.out.printf("\n%s", str);
        }
    }
 
    public static void apagaAgencia(){
        int num;
        listarAgencias();
        System.out.println("Digite o numero da agencia que deseja apagar: ");
        num = scan.nextInt();

        for(int i = 0; i < vetAgencias.length; i++){
            if(vetAgencias[i] == null) break;
            while(vetAgencias[i].getNumero() == num){
                vetAgencias[i] = new Agencias("null", 0);
                System.out.println("Agencia apagada com sucesso.");
            }
        }
    }

}
