package Classes;


public class Clientes{
    
    private String nome;
    private String sobrenome;
    //private int id = 0;

    public Clientes(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Clientes(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /*public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }*/

    @Override
    public String toString() {
        return "Cliente = " + nome + " " + sobrenome;
    }

}

