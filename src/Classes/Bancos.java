package Classes;
public class Bancos {
    
    private String nome;
    
    public Bancos(String nome){
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return String.format("\n:Banco:"
                            +"\nNome: %s", nome);
    }
}
