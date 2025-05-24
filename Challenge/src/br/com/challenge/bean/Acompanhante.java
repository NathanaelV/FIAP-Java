package br.com.challenge.bean;

public class Acompanhante extends Pessoa {
    private String grauParentesco;

    public Acompanhante() {
        super();
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }
}