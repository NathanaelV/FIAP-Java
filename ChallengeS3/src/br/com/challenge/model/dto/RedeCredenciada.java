package br.com.challenge.model.dto;

public class RedeCredenciada {
    private int id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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