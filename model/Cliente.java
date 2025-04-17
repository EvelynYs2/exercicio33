package model;

public abstract class Cliente {
    protected String nome;
    protected String endereco;
    protected String telefone;

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public abstract double getRendimento();

    public String getNome() {
        return nome;
    }

    public abstract String getTipo();
}


    
