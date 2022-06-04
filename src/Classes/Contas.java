package Classes;

public class Contas extends Clientes {
    Clientes pessoa;
    private int numero;
    Agencias agencia;
    private double saldo;
    String extrato = " ";

    public Contas(String nome, String sobrenome, Agencias agencia, double valorInicial){
        super(nome, sobrenome);
        this.agencia = agencia;
        this.saldo = valorInicial;
        this.numero = hashCode(); 
    }
    
    public Contas() {}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = hashCode();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }
    
    public String getExtrato() {
        return String.format("\nExtrato: %s",extrato);
    }

    public void setExtrato(String extrato) {
        this.extrato += extrato;
    }

    @Override
    public String toString(){
        return String.format("\n:Conta:"
                            +"\nNumero da conta: %d"
                            +"\n%s"
                            +"\n%s"
                            +"\nSaldo: %.2f\n\n", this.numero, super.toString(), agencia.toString(), this.saldo);

    }

    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
        result = prime * result + ((extrato == null) ? 0 : extrato.hashCode());
        result = prime * result + numero;
        result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
        long temp;
        temp = Double.doubleToLongBits(saldo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contas other = (Contas) obj;
        if (agencia == null) {
            if (other.agencia != null)
                return false;
        } else if (!agencia.equals(other.agencia))
            return false;
        if (extrato == null) {
            if (other.extrato != null)
                return false;
        } else if (!extrato.equals(other.extrato))
            return false;
        if (numero != other.numero)
            return false;
        if (pessoa == null) {
            if (other.pessoa != null)
                return false;
        } else if (!pessoa.equals(other.pessoa))
            return false;
        if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
            return false;
        return true;
    }

}
