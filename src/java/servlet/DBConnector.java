package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

//Класс подключения к БД
public class DBConnector {
    private static final String url = "jdbc:postgresql://ec2-46-137-121-216.eu-west-1.compute.amazonaws.com:5432/da50djvcf38qg8?sslmode=require";
    private static final String user = "bndgpmwxqckytd";
    private static final String password = "5b0a43b32d20ca334b57d812ee5dfddb5eb3bc327570fc34ee9fbbd4205b3a88";
    private Connection con;
    private PreparedStatement st;

    public void Connection() throws SQLException, Exception{
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection(url, user, password);
    }
    
    public Connection getConnection(){
        return this.con;
    }
    
    public PreparedStatement getStatement(){
        return this.st;
    }
}
