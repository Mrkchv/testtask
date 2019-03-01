package servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBInsert {
    private DBConnector connector = new DBConnector();
    private Salt createSalt = new Salt();
    private HashPass createHash = new HashPass();
    
    public void InsertConstructor(String login, String firstname, String lastname, String pass) throws SQLException, Exception{
        byte[] salt = createSalt.getSalt();
        String hash = createHash.getHash(pass) + createHash.getHash(salt);
        connector.Connection();
        Connection con = connector.getConnection();
        PreparedStatement st = connector.getStatement();
        
        //Отправка данных в БД
        st = con.prepareStatement("INSERT INTO users(login,firstname,lastname,hashadress,salt) VALUES(?,?,?,?,?)");
        st.setString(1, login);
        st.setString(2, firstname);
        st.setString(3, lastname);
        st.setString(4, hash);  
        st.setBytes(5, salt);
        st.executeUpdate();
        Close(con, st);
    }
    
    public void Close(Connection con, PreparedStatement st) throws Exception{
        con.close();
        st.close();
    }
}
