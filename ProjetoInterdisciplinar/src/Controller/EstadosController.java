package Controller;

import Database.Config;
import java.sql.*;
import Models.EstadosModel;
import java.util.ArrayList;

public final class EstadosController {
    Config conf = new Config();
    
    public EstadosController(){}
    
    public void Store(EstadosModel em){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("INSERT INTO estado (sigla, nome) values (?,?)");
            ps.setString(1, em.getSigla());
            ps.setString(2, em.getNome());
            ps.executeUpdate();
            
        }catch(SQLException err){
            throw new RuntimeException("Error in insert ESTADOS " +  err);
        }finally{
            conf.closeConnection(conn, ps);
        }
    }
    
    public ArrayList<EstadosModel> Index(){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = conn.prepareStatement("SELECT * FROM estados ");
            rs = ps.executeQuery();
            
            ArrayList<EstadosModel> lista = new ArrayList<>();
            while(rs.next()){
                EstadosModel tmp = new EstadosModel(rs.getString("sigla"), rs.getString("nome"));
                lista.add(tmp);
            }
            
            return lista;
            
        }catch(SQLException err){
            throw new RuntimeException("Error get datas of estados " + err);
        }finally{
            conf.closeConnection(conn, ps, rs);
        }
    }
    
    public void Update(EstadosModel em){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("UPDATE estados SET sigla = ?, nome = ? WHERE sigla = ?");
            ps.setString(1, em.getSigla());
            ps.setString(2, em.getNome());
            ps.setString(3, em.getSigla());
            ps.executeUpdate();
        }catch(SQLException err){
            throw new RuntimeException("Error in update ESTADOS " + err);
        }finally{
        }
    }
    
    public void Destroy(EstadosModel em){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("DELETE FROM estados WHERE sigla = ? ");
            ps.setString(1, em.getSigla());
            ps.executeUpdate();
        }catch(SQLException err){
            throw new RuntimeException("Error in delete ESTADO " + err);
        }finally{
            conf.closeConnection(conn, ps);
        }
    }
}
