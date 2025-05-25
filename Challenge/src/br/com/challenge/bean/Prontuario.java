package br.com.challenge.bean;

public class Prontuario {
    private String descricao;
    private Paciente paciente;
    private Exame exame;

    public Prontuario() {}

    public Prontuario(String descricao, Paciente paciente, Exame exame) {
        this.descricao = descricao;
        setPaciente(paciente);
        this.exame = exame;
    }

    // Getter e Setter
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descriacao) {
        this.descricao = descriacao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        paciente.setProntuario(this);
        this.paciente = paciente;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }
}
