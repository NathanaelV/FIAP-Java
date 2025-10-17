package br.com.fiap.bean;

import java.io.*;

public class Pessoa {
    private String codigo;
    private String nome;
    private String email;

    // Construtor
    public Pessoa() {}

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Métodos
    public Pessoa ler(String path) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(path + "/" + codigo + ".txt")
        );

        // Lê e pula para próxima linha
        codigo = br.readLine();
        // Cada readLine já passa para próxima linha
        nome = br.readLine();
        email = br.readLine();
        // É importante fechar o recurso de leitura
        br.close();

        return this;
    }

    public String gravar(String path) {
        try {
            File dir = new File(path);
            // Caso o diretório não exista, cria um.
            if (!dir.exists()) {
                dir.mkdir();
            }

            PrintWriter pw = new PrintWriter(path + "/" + codigo + ".txt");
            pw.println(codigo);
            pw.println(nome);
            pw.println(email);
            // Salva o arquivo em disco. Antes disso, o arquivo está em cash (Memória)
            pw.flush();
            //Fecha o arquivo
            pw.close();

            return "Arquivo gravado com sucesso";

        } catch (IOException e) {
            return "Falha ao gravar arquivo: " + e.getMessage();
        }
    }
}
