package br.com.challenge.model.dao;

import br.com.challenge.model.dto.Acompanhante;
import br.com.challenge.model.dto.Acompanhante;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class AcompanhanteDAO {
    private Connection con;

    public AcompanhanteDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon(){
        return con;
    }

    public String inserir(Acompanhante acompanhante) {
        String sql = "insert into vlt_acompanhante(nome, data_nascimento, documento, endereco, contato, grau_parentesco) values (?,?,?,?,?,?)";

        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setString(1 ,acompanhante.getNome());
            ps.setDate(2 , Date.valueOf(acompanhante.getDataNascimento()));
            ps.setString(2 ,acompanhante.getDocumento());
            ps.setInt(2 ,acompanhante.getEndereco().getId());
            ps.setInt(2 ,acompanhante.getContato().getId());
            ps.setString(2 ,acompanhante.getGrauParentesco());

            if (ps.executeUpdate() > 0){
                return "Acompanhante Inserido com Sucesso";
            } else {
                return "Erro ao Inserir";
            }
        } catch (SQLException e){
            return "Erro de SQL: " + e.getMessage();
        }
    }

    //    public String alterar(Acompanhante acompanhante) {
//        String sql = "update vlt_filme set titulo = ?, genero = ?, produtora = ? where codigo = ?";
//
//        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
//            ps.setString(1 ,acompanhante.getTitulo());
//            ps.setString(2 ,acompanhante.getGenero());
//            ps.setString(3 ,acompanhante.getProdutora());
//            ps.setInt(4 , acompanhante.getCodigo());
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
//    public String excluir(Acompanhante acompanhante) {
//        String sql = "delete from vlt_filme where codigo = ?";
//        try(PreparedStatement ps = getCon().prepareStatement(sql);){
//            ps.setInt(1 , acompanhante.getCodigo());
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
    public ArrayList<Acompanhante> listarTodos() {
        String sql = "select * from vlt_acompanhante order by id_acompanhante";

        ArrayList<Acompanhante> listaAcompanhante = new ArrayList<Acompanhante>();

        try(PreparedStatement ps = getCon().prepareStatement(sql);){
            ResultSet rs = ps.executeQuery(); {
                if (rs != null) {
                    while (rs.next()) {
                        Acompanhante acompanhante = new Acompanhante();
                        acompanhante.setId(rs.getInt(1));
                        acompanhante.setNome(rs.getString(2));
                        acompanhante.setDocumento(rs.getString(4));
                        acompanhante.setGrauParentesco(rs.getString(7));
                        listaAcompanhante.add(acompanhante);
                    }
                    return listaAcompanhante;
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
