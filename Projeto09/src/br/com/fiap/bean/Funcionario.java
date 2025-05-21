package br.com.fiap.bean;

public class Funcionario {
    private String nome;
    private float valorHoraTrabalho;

    public Funcionario() {
    }

    public Funcionario(String nome, float valorHoraTrabalho) {
        this.nome = nome;
        setValorHoraTrabalho(valorHoraTrabalho);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }

    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        try {
            if (valorHoraTrabalho > 0) {
                this.valorHoraTrabalho = valorHoraTrabalho;
            } else {
                throw new Exception("Valor da Hora deve ser maior que 0 (Zero).");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public float calcularSalario(float qtdeHorasTrabalhadaSemana) {
        return qtdeHorasTrabalhadaSemana * valorHoraTrabalho * 4;
    }
}
