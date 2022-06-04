package Sistema;

import java.util.Scanner;

import Classes.*;

public class gerenciaClientes {
    
    public static Scanner scan = new Scanner(System.in);
    
    protected static Clientes vetClientes[] = new Clientes[30];

    public static String listarClientes(){
        String str = " ";

        for(int i = 0; i < vetClientes.length; i++){
            str += String.format("%s", vetClientes[i].toString());
        }
        return str;
    }

    public static void apagaCliente(){
        System.out.printf("\n\t:Clientes:"
                            +"%s", listarClientes());
        
        System.out.print("\nDigite o id que para apagar: ");
        String nome = scan.next();

        for(int i = 0; i < vetClientes.length; i++){
            if (vetClientes[i].getNome() == nome){
                vetClientes[i] = new Clientes();
            }
        }

        System.out.println("Cliente apagado com sucesso.");
    }

}
