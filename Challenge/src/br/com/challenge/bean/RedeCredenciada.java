package br.com.challenge.bean;

public class RedeCredenciada {
    private String nome;
    private String codigoConvenio;
    private String tipoDePlano;

    public RedeCredenciada() {
    }

    public RedeCredenciada(String nome, String codigoConvenio, String tipoDePlano) {
        this.nome = nome;
        this.codigoConvenio = codigoConvenio;
        this.tipoDePlano = tipoDePlano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoConvenio() {
        return codigoConvenio;
    }

    public void setCodigoConvenio(String codigoConvenio) {
        this.codigoConvenio = codigoConvenio;
    }

    public String getTipoDePlano() {
        return tipoDePlano;
    }

    public void setTipoDePlano(String tipoDePlano) {
        this.tipoDePlano = tipoDePlano;
    }
}