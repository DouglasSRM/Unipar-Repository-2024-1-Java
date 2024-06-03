package br.unipar.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    //localhost -> Onde esta o banco
    //5432 -> porta padrão do banco
    private static final String url = "jdbc:postgresql://localhost:5432/exemplo1";
    private static final String user = "postgres";
    private static final String password = "admin123";

    public static Connection connection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }




}
