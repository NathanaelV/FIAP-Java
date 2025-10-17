package br.com.fiap.dao;

import br.com.fiap.to.RemedioTO;
import oracle.jdbc.driver.json.tree.JsonpPrimitive;
import oracle.jdbc.proxy.annotation.Pre;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.spi.LocaleNameProvider;

public class RemedioDAO {
    public ArrayList<RemedioTO> findAll() {
        ArrayList<RemedioTO> remedios = new ArrayList<RemedioTO>();

        String sql = "select * from ddd_remedios order by codigo";

        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {
            ResultSet rs  = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    RemedioTO remedio = new RemedioTO();
                    remedio.setCodigo(rs.getLong("codigo"));
                    remedio.setNome(rs.getString("nome"));
                    remedio.setPreco(rs.getDouble("preco"));
                    remedio.setDataDeFabricacao(rs.getDate("data_de_fabricacao").toLocalDate());
                    remedio.setDataDeValidade(rs.getDate("data_de_validade").toLocalDate());
                    remedios.add(remedio);
                }
            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println("Erro na consulta: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return remedios;
    }

    public RemedioTO findByCodigo(Long codigo) {
        RemedioTO remedio = new RemedioTO();

        String sql = "select * from ddd_remedios where codigo = ?";

        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {
            ps.setLong(1, codigo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                remedio.setCodigo(rs.getLong("codigo"));
                remedio.setNome(rs.getString("nome"));
                remedio.setPreco(rs.getDouble("preco"));
                remedio.setDataDeFabricacao(rs.getDate("data_de_fabricacao").toLocalDate());
                remedio.setDataDeValidade(rs.getDate("data_de_validade").toLocalDate());
            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println("Erro na consulta: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return remedio;
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

    public boolean delete(Long codigo) {
        String sql = "delete from ddd_remedios where codigo = ?";
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {

            ps.setLong(1, codigo);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Erro ao excluir: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return false;
    }

    public RemedioTO update(RemedioTO remedio) {
        String sql = "update ddd_remedios set nome=?, preco=?, data_de_fabricacao=?, data_de_validade=? where codigo=?";

        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {
            ps.setString(1, remedio.getNome());
            ps.setDouble(2, remedio.getPreco());
            ps.setDate(3, Date.valueOf(remedio.getDataDeFabricacao()));
            ps.setDate(4, Date.valueOf(remedio.getDataDeValidade()));
            ps.setLong(5, remedio.getCodigo());

            if (ps.executeUpdate() > 0) {
                return remedio;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return null;
    }
}
