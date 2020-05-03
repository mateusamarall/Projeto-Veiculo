package Database;

import java.sql.*;

public final class Config {
    private String db;
    private String user;
    private String password;
    private String driver;
    
    public Config(){
        this.db = "projeto_db";
        this.user = "root";
        this.password = "";
        this.driver = "com.mysql.cj.jdbc.Driver";
    }
    
    public Connection getConnection(){
        try{
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/"+this.db+"?useTimezone=true&serverTimezone=UTC";
            
            try{
                return DriverManager.getConnection(url, this.user, this.password);
            }catch(SQLException err){
                throw new RuntimeException("Error in getConnection with database " + err);
            }
        }catch(ClassNotFoundException classerr){
            throw new RuntimeException("Error in driver " + classerr);
        }
    }
    
    public void closeConnection(Connection conn){
        if(conn == null){
            System.err.println("Error, doenst have any connection opened to close it ");
        }else{
            try{
                conn.close();
            }catch(SQLException err){
                System.err.println("Error in close connection " + err);
            }
        }
    }
    
    public void closeConnection(Connection conn, PreparedStatement ps){
        this.closeConnection(conn);
        
        if(ps == null){
            System.err.println("Error, doesnt have any prepared statement opened to close it ");
        }else{
            try{
                ps.close();
            }catch(SQLException err){
                System.err.println("Error in close prepared statement " + err);
            }
        }
    }
    
    public void closeConnection(Connection conn, PreparedStatement ps, ResultSet rs){
        this.closeConnection(conn, ps);
        
        if(rs == null){
            System.err.println("Error, doesnt have any result set opened to close it ");
        }else{
            try{
                rs.close();
            }catch(SQLException err){
                System.err.println("Error in close result set " + err);
            }
        }
    }
}