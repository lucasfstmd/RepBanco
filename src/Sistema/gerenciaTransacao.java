package Sistema;

public class gerenciaTransacao {
    
    public static void Deposito(double valor, int numero){
        for(int i = 0; i < gerenciaContas.vetContas.length; i++){
            if(gerenciaContas.vetContas[i] == null) break;
            if(numero == gerenciaContas.vetContas[i].getNumero()){
                gerenciaContas.vetContas[i].setSaldo(+valor);
                System.out.format("\nTransacao feita com sucesso.");
                gerenciaContas.vetContas[i].setExtrato(String.format("\nDeposito no valor de: %.2f", valor));
            }else{
                System.out.println("\nConta nao encontrada");
            }
        }
    }

    public static void Transferencia(double valor, int numRecebedor, int numTransferidor){
        for(int i = 0; i < gerenciaContas.vetContas.length; i++){
            if(gerenciaContas.vetContas[i] == null) break;
            for(int j = 0; i < gerenciaContas.vetContas.length; j++){
                if(gerenciaContas.vetContas[j] == null) break;
                if(numRecebedor == gerenciaContas.vetContas[i].getNumero() 
                    && numTransferidor == gerenciaContas.vetContas[j].getNumero()){
                    if(gerenciaContas.vetContas[j].getSaldo() < valor){
                        System.out.println("Saldo insuficiente.");
                    }else{
                        gerenciaContas.vetContas[i].setSaldo(+valor);
                        gerenciaContas.vetContas[j].setSaldo(-valor);
                        System.out.format("\nTransacao feita com sucesso."); 
                        gerenciaContas.vetContas[i].setExtrato(String.format("\nRecebeu uma transferencia feita de %s no valor de: %.2f",
                                                                gerenciaContas.vetContas[j].toString(), valor));
                        gerenciaContas.vetContas[j].setExtrato(String.format("\nTransferiu para %s o valor de: %.2f\n",
                                                                gerenciaContas.vetContas[i].toString(), valor)); 
                    }
                }
            }
        }
    }

    public static void Saque(double valor, int numConta){
        for(int i = 0; i < gerenciaContas.vetContas.length; i++){
            if(gerenciaContas.vetContas[i] == null) break;
            if(numConta == gerenciaContas.vetContas[i].getNumero()){
                if (gerenciaContas.vetContas[i].getSaldo() < valor){
                    System.out.println("Saldo insificiente");
                }else{
                    gerenciaContas.vetContas[i].setSaldo(-valor);
                    String.format("\nTransacao feita com sucesso."); 
                    String.format("\nSaque feito no valor de: %.2f", valor);
                    gerenciaContas.vetContas[i].setExtrato(String.format("\nSaque feito no valor de: %.2f", valor));
                }
            }
        }
    }
}
