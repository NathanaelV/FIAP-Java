package br.com.fiap.main;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.dao.ConnectionFactory;
import br.com.fiap.dto.Carro;

import java.sql.Connection;

public class TesteCreate {
    public static void main(String[] args) {
        Connection con = ConnectionFactory.abrirConexao();
        System.out.println("\n\nConexão: " + con);
        CarroDAO carroDAO = new CarroDAO(con);

        Carro carro = new Carro();
        carro.setPlaca("ACC2055");
        carro.setCor("Preto");
        carro.setDescricao("Fiat Uno Raiz");

        System.out.println(carroDAO.inserir(carro));
        ConnectionFactory.fecharConexao(con);
    }
}
