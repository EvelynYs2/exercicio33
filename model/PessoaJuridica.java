package model;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String ie;

    public String getIe() {
        return ie;
    }

    public String getCnpj() {
        return cnpj;
    }
    private double faturamento;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String ie, double faturamento) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.ie = ie;
        this.faturamento = faturamento;
    }

    public double getRendimento() {
        return faturamento;
    }

    public String getTipo() {
        return "pessoa jurídica";
    }
    
}
