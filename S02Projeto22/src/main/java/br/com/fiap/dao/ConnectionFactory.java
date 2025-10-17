package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // O que quer dizer com só ter uma instância dessa ativa? Ser conexão única?
    private static Connection connection;

    // Ao usar o static, seria semelhante a dizer que é um método de Classe?
    // Não se cria instâncias para usar esse método?
    // Se eu criar uma instância dessa classe, esse método não existirá para essa instância?
    public static void closeConnection() {
        try {
            if (!connection.isClosed()) {
                connection.close();
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                return connection;
            }

            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Descrever o que é cada parte da URL
            // - jdbc: Protocolo de comunicação
            // - oracle: Indica ao DriverManager, qual driver será usado
            // - thin: é o Subprotocolo
            // - @oracle.fiap.com.br: endereço IP onde o banco de dados Oracle está instalado
            // - 1521: Porta
            // - ORCL: é o SID (System ID) Service Name, nome da instância dentro do servidor
            String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
//            String url = System.getenv("DB_URL"); // "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
            final String USER = "RM564990";
//            final String USER = System.getenv("DB_USER");
            final String PASSWORD = "060196";
//            final String PASSWORD = System.getenv("DB_PASSWORD");

            if (url == null || USER == null || PASSWORD == null) {
                throw new RuntimeException("Variáveis de ambiente do banco não configuradas!");
            }

            connection = DriverManager.getConnection(url, USER, PASSWORD);

        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erro nome da classe: " + e.getMessage());
        }

        return connection;
    }
}
