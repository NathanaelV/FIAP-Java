package br.com.challenge.model.dao;

import br.com.challenge.model.dto.Contato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContatoDAO {
    private Connection con;

    public ContatoDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon(){
        return con;
    }

    public String inserir(Contato contato) {
        String sql = "insert into vlt_contato(telefone, email) values (?,?)";

        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setString(1 ,contato.getTelefone());
            ps.setString(2 ,contato.getEmail());

            if (ps.executeUpdate() > 0){
                return "Contato Inserido com Sucesso";
            } else {
                return "Erro ao Inserir";
            }
        } catch (SQLException e){
            return "Erro de SQL: " + e.getMessage();
        }
    }

    //    public String alterar(Contato contato) {
//        String sql = "update vlt_filme set titulo = ?, genero = ?, produtora = ? where codigo = ?";
//
//        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
//            ps.setString(1 ,contato.getTitulo());
//            ps.setString(2 ,contato.getGenero());
//            ps.setString(3 ,contato.getProdutora());
//            ps.setInt(4 , contato.getCodigo());
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
//    public String excluir(Contato contato) {
//        String sql = "delete from vlt_filme where codigo = ?";
//        try(PreparedStatement ps = getCon().prepareStatement(sql);){
//            ps.setInt(1 , contato.getCodigo());
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
    public ArrayList<Contato> listarTodos() {
        String sql = "select * from vlt_contato order by id_contato";

        ArrayList<Contato> listaContato = new ArrayList<Contato>();

        try(PreparedStatement ps = getCon().prepareStatement(sql);){
            ResultSet rs = ps.executeQuery(); {
                if (rs != null) {
                    while (rs.next()) {
                        Contato contato = new Contato();
                        contato.setId(rs.getInt(1));
                        contato.setTelefone(rs.getString(2));
                        contato.setEmail(rs.getString(3));
                        listaContato.add(contato);
                    }
                    return listaContato;
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
