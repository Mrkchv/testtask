package servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBSelect {
    private DBConnector connector = new DBConnector();
    private HashPass createHash = new HashPass();
    public String firstname;
    public String lastname;
    public boolean userFind = false;
    
    public void SelectConstruction(String login) throws Exception{
        connector.Connection();
        Connection con = connector.getConnection();
        PreparedStatement st = connector.getStatement();
        //Получение логина из БД
        st = con.prepareStatement("SELECT login FROM users WHERE login=?");
        st.setString(1, login);
        ResultSet res = st.executeQuery();
        
        if (res.isFirst()){
            userFind = true;
        }
        Close(con, st, res);
    }
    
    public void SelectConstruction(String login, String password) throws Exception{
        connector.Connection();
        Connection con = connector.getConnection();
        PreparedStatement st = connector.getStatement();
        st = con.prepareStatement("SELECT login,firstname,lastname,hashadress,salt FROM users WHERE login=?");
        st.setString(1, login);
        ResultSet res = st.executeQuery();
        
        //Поиск пароля в БД
        while (res.next()){
            String hash = createHash.getHash(password) + createHash.getHash(res.getBytes("salt"));
            if (hash.equals(res.getString("hashadress"))){
                userFind = true;
                firstname = res.getString("firstname");
                lastname = res.getString("lastname");
                break;
            }
        }
        Close(con, st, res);
    }
    
    public void Close(Connection con, PreparedStatement st, ResultSet res) throws Exception{
        con.close();
        st.close();
        res.close();
    }
}
