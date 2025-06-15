package br.com.petShop.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.InputStream;

public class ConnectionFactory {

    private String host;
    private String username;
    private String password;
    private String database;
    private String port;


    public ConnectionFactory() {
        try {
            InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
            Properties prop = new Properties();
            prop.load(input);

            host = prop.getProperty("host");
            port = prop.getProperty("port");
            database = prop.getProperty("database");
            username = prop.getProperty("username");
            password = prop.getProperty("password");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public Connection getConnection() {
        try {
            String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
            return DriverManager.getConnection(url, username, password);
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }
}

