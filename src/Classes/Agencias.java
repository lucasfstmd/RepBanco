package Classes;

public class Agencias extends Bancos{
    
    private int numero;
    Bancos banco;
    
    public Agencias(String banco, int numero) {
        super(banco);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Bancos getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        super.setNome(banco);
    }

    @Override
    public String toString(){
        return String.format(":Agencia:\nNumero da agencia: %d\n%s", this.numero, super.toString());
    }
}
