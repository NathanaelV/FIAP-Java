package br.com.challenge.bean;

public class Prontuario {
    private String descriacao;
    private Paciente paciente;
    private Exame exame;

    public Prontuario() {}

    public Prontuario(String descriacao, Paciente paciente, Exame exame) {
        this.descriacao = descriacao;
        setPaciente(paciente);
        this.exame = exame;
    }

    // Getter e Setter
    public String getDescriacao() {
        return descriacao;
    }

    public void setDescriacao(String descriacao) {
        this.descriacao = descriacao;
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
