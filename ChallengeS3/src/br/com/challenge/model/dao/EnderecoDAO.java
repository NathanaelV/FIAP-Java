package br.com.challenge.model.dao;

import br.com.challenge.model.dto.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EnderecoDAO {
    private Connection con;

    public EnderecoDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon(){
        return con;
    }

    public String inserir(Endereco endereco) {
        String sql = "insert into vlt_endereco(logradouro, numero, complemento, bairro, cidade, estado, cep) values (?,?,?,?,?,?,?)";

        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setString(1 ,endereco.getLogradouro());
            ps.setString(2 ,endereco.getNumero());
            ps.setString(3 ,endereco.getComplemento());
            ps.setString(4 ,endereco.getBairro());
            ps.setString(5 ,endereco.getCidade());
            ps.setString(6 ,endereco.getEstado());
            ps.setString(7 ,endereco.getCep());

            if (ps.executeUpdate() > 0){
                return "Endereço Inserido com Sucesso";
            } else {
                return "Erro ao Inserir";
            }
        } catch (SQLException e){
            return "Erro de SQL: " + e.getMessage();
        }
    }

//    public String alterar(Endereco endereco) {
//        String sql = "update vlt_filme set titulo = ?, genero = ?, produtora = ? where codigo = ?";
//
//        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
//            ps.setString(1 ,endereco.getTitulo());
//            ps.setString(2 ,endereco.getGenero());
//            ps.setString(3 ,endereco.getProdutora());
//            ps.setInt(4 , endereco.getCodigo());
//
//            if (ps.executeUpdate() > 0){
//                return "Alterado com Sucesso";
//            } else {
//                return "Erro ao Alterar";
//            }
//        } catch (SQLException e){
//            return "Erro de SQL: " + e.getMessage();
//        }
//    }
//
//    public String excluir(Endereco endereco) {
//        String sql = "delete from vlt_filme where codigo = ?";
//        try(PreparedStatement ps = getCon().prepareStatement(sql);){
//            ps.setInt(1 , endereco.getCodigo());
//
//            if (ps.executeUpdate() > 0){
//                return "Excluido com Sucesso";
//            } else {
//                return "Erro ao excluir";
//            }
//
//        } catch (SQLException e){
//            return "Erro de SQL: " + e.getMessage();
//        }
//    }
//
    public ArrayList<Endereco> listarTodos() {
        String sql = "select * from vlt_endereco order by id_endereco";

        ArrayList<Endereco> listaEndereco = new ArrayList<Endereco>();

        try(PreparedStatement ps = getCon().prepareStatement(sql);){
            ResultSet rs = ps.executeQuery(); {
                if (rs != null) {
                    while (rs.next()) {
                        Endereco endereco = new Endereco();
                        endereco.setId(rs.getInt(1));
                        endereco.setLogradouro(rs.getString(2));
                        endereco.setNumero(rs.getString(3));
                        endereco.setComplemento(rs.getString(4));
                        endereco.setBairro(rs.getString(5));
                        endereco.setCidade(rs.getString(6));
                        endereco.setEstado(rs.getString(7));
                        endereco.setCep(rs.getString(8));
                        listaEndereco.add(endereco);
                    }
                    return listaEndereco;
                } else {
                    return null;
                }
            }
        } catch (SQLException e){
            System.out.println("Erro de SQL: " + e.getMessage());
            return null;
        }
    }
}
