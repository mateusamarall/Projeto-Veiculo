package Controller;

import Database.Config;
import java.sql.*;
import Models.LojasModel;
import java.util.ArrayList;

public final class LojasController {
    Config conf = new Config();
    
    public LojasController(){}
    
    public void Store(LojasModel lm){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("INSERT INTO loja (loja_nome, loja_id) values (?,?)");
            ps.setString(1, lm.getLoja_nome());
            ps.setString(2, lm.getLoja_id());
            ps.executeUpdate();
            
        }catch(SQLException err){
            throw new RuntimeException("Error in insert LOJAS " +  err);
        }finally{
            conf.closeConnection(conn, ps);
        }
    }
    
    public ArrayList<LojasModel> Index(){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = conn.prepareStatement("SELECT * FROM lojas ");
            rs = ps.executeQuery();
            
            ArrayList<LojasModel> lista = new ArrayList<>();
            while(rs.next()){
                LojasModel tmp = new LojasModel(rs.getString("loja_nome"), rs.getString("loja_id"));
                lista.add(tmp);
            }
            
            return lista;
            
        }catch(SQLException err){
            throw new RuntimeException("Error get datas of LOJAS " + err);
        }finally{
            conf.closeConnection(conn, ps, rs);
        }
    }
    
    public void Update(LojasModel lm){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("UPDATE lojas SET loja_nome = ?, loja_id = ? WHERE loja_id = ?");
            ps.setString(1, lm.getLoja_nome());
            ps.setString(2, lm.getLoja_id());
            ps.setString(3, lm.getLoja_id());
            ps.executeUpdate();
        }catch(SQLException err){
            throw new RuntimeException("Error in update LOJAS " + err);
        }finally{
        }
    }
    
    public void Destroy(LojasModel lm){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("DELETE FROM lojas WHERE loja_id= ? ");
            ps.setString(1, lm.getLoja_id());
            ps.executeUpdate();
        }catch(SQLException err){
            throw new RuntimeException("Error in delete LOJA " + err);
        }finally{
            conf.closeConnection(conn, ps);
        }
    }
}
