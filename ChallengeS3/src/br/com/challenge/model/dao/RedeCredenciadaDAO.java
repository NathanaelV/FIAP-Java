package br.com.challenge.model.dao;

import br.com.challenge.model.dto.RedeCredenciada;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RedeCredenciadaDAO {
    private Connection con;

    public RedeCredenciadaDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon(){
        return con;
    }

    public String inserir(RedeCredenciada redeCredenciada) {
        String sql = "insert into vlt_rede_credenciada(nome, codigo_convenio, tipo_de_plano) values (?,?,?)";

        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
            ps.setString(1 ,redeCredenciada.getNome());
            ps.setString(2 ,redeCredenciada.getCodigoConvenio());
            ps.setString(3 ,redeCredenciada.getTipoDePlano());

            if (ps.executeUpdate() > 0){
                return "RedeCredenciada Inserido com Sucesso";
            } else {
                return "Erro ao Inserir";
            }
        } catch (SQLException e){
            return "Erro de SQL: " + e.getMessage();
        }
    }

    //    public String alterar(RedeCredenciada redeCredenciada) {
//        String sql = "update vlt_filme set titulo = ?, genero = ?, produtora = ? where codigo = ?";
//
//        try (PreparedStatement ps = getCon().prepareStatement(sql);) {
//            ps.setString(1 ,redeCredenciada.getTitulo());
//            ps.setString(2 ,redeCredenciada.getGenero());
//            ps.setString(3 ,redeCredenciada.getProdutora());
//            ps.setInt(4 , redeCredenciada.getCodigo());
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
//    public String excluir(RedeCredenciada redeCredenciada) {
//        String sql = "delete from vlt_filme where codigo = ?";
//        try(PreparedStatement ps = getCon().prepareStatement(sql);){
//            ps.setInt(1 , redeCredenciada.getCodigo());
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
    public ArrayList<RedeCredenciada> listarTodos() {
        String sql = "select * from vlt_rede_credenciada order by id_rede_credenciada";

        ArrayList<RedeCredenciada> listaRedeCredenciada = new ArrayList<RedeCredenciada>();

        try(PreparedStatement ps = getCon().prepareStatement(sql);){
            ResultSet rs = ps.executeQuery(); {
                if (rs != null) {
                    while (rs.next()) {
                        RedeCredenciada redeCredenciada = new RedeCredenciada();
                        redeCredenciada.setId(rs.getInt(1));
                        redeCredenciada.setNome(rs.getString(2));
                        redeCredenciada.setCodigoConvenio(rs.getString(3));
                        redeCredenciada.setTipoDePlano(rs.getString(4));
                        listaRedeCredenciada.add(redeCredenciada);
                    }
                    return listaRedeCredenciada;
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
