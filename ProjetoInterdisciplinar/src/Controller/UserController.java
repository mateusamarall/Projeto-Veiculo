package Controller;

import Database.Config;
import java.sql.*;
import Models.UserModel;

public final class UserController {
    Config conf = new Config();
    
    public UserController(){}
    
    public void Store(UserModel um){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("INSERT INTO user (login, nome, senha) values (?,?,?)");
            ps.setString(1, um.getLogin());
            ps.setString(2, um.getNome());
            ps.setInt(3, um.getSenha());
            
            ps.executeUpdate();
        }catch(SQLException err){
            throw new RuntimeException("Error in insert user " + err);
        }finally{
            conf.closeConnection(conn, ps);
        }
    }
    
    public boolean Show(UserModel um){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = conn.prepareStatement("SELECT * FROM user WHERE login = ? AND senha = ? ");
            rs = ps.executeQuery();
            
            if(rs == null){
                return false;
            }else{
                UserModel tmp = new UserModel(rs.getString("login"), rs.getString("Nome"), rs.getInt("senha"));
                if(um.getLogin() != tmp.getLogin() || um.getSenha() != tmp.getSenha()){
                    return false;
                }else{
                    return true;
                }
            }
        }catch(SQLException err){
            throw new RuntimeException("Error in search a user "+ err);
        }finally{
            conf.closeConnection(conn, ps, rs);
        }
    }
}
