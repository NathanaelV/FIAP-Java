package br.com.fiap.dao;

import br.com.fiap.to.RemedioTO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class RemedioDAO {
    public ArrayList<RemedioTO> findAll() {
        ArrayList<RemedioTO> remedios = new ArrayList<RemedioTO>();

        RemedioTO remedio = new RemedioTO(1L, "Loratadina", 7.93, LocalDate.parse("2023-10-10"), LocalDate.parse("2025-10-10"));
        remedios.add(remedio);

        remedio = new RemedioTO(2L, "Amoxicilina", 26.50, LocalDate.now(), LocalDate.now().plusYears(2));
        remedios.add(remedio);

        remedio = new RemedioTO(3L, "Metformina", 9.99, LocalDate.now().minusYears(1), LocalDate.now().plusYears(1));
        remedios.add(remedio);

        return remedios;
    }

    public RemedioTO save(RemedioTO remedio) {
        String sql = "insert into ddd_remedios (nome, preco, data_de_fabricacao, data_de_validade) values(?, ?, ?, ?)";

        // ConnectionFactory.getConnection(): Abre a conexão com o banco de dados e retorna o connection
        // prepareStatement(sql): Prepara a query e envia para o banco de dados, deixando-o pronto para receber os valores
        // e substituir os '?'.
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {
            ps.setString(1, remedio.getNome());
            ps.setDouble(2, remedio.getPreco());
            ps.setDate(3, Date.valueOf(remedio.getDataDeFabricacao()));
            ps.setDate(4, Date.valueOf(remedio.getDataDeValidade()));

            // ps.executeUpdate(): Executa o comando SQL e retorna o número de linhas que foram alteradas
            if (ps.executeUpdate() > 0) {
                return remedio;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return null;
    }
}
