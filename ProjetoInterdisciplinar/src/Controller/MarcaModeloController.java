package Controller;

import Database.Config;
import java.sql.*;
import Models.MarcaModeloModel;
import java.util.ArrayList;

public final class MarcaModeloController {
    Config conf = new Config();
    
    public MarcaModeloController(){}
    
    public void Store(MarcaModeloModel mmm){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("INSERT INTO marca_mod (marca_nome, modelo_nome) values (?,?)");
            ps.setString(1, mmm.getMarca_nome());
            ps.setString(2, mmm.getModelo_nome());
            ps.executeUpdate();
            
        }catch(SQLException err){
            throw new RuntimeException("Error in insert MARCA_MOD " +  err);
        }finally{
            conf.closeConnection(conn, ps);
        }
    }
    
    public ArrayList<MarcaModeloModel> Index(){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = conn.prepareStatement("SELECT * FROM marca_mod ");
            rs = ps.executeQuery();
            
            ArrayList<MarcaModeloModel> lista = new ArrayList<>();
            while(rs.next()){
                MarcaModeloModel tmp = new MarcaModeloModel(rs.getString("marca_nome"), rs.getString("modelo_nome"));
                lista.add(tmp);
            }
            
            return lista;
            
        }catch(SQLException err){
            throw new RuntimeException("Error get datas of MARCA_MOD " + err);
        }finally{
            conf.closeConnection(conn, ps, rs);
        }
    }
    
    public void Update(MarcaModeloModel mmm){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("UPDATE marca_mod SET marca_nome = ?, modelo_nome = ? WHERE modelo_nome = ?");
            ps.setString(1, mmm.getMarca_nome());
            ps.setString(2, mmm.getModelo_nome());
            ps.setString(3, mmm.getModelo_nome());
            ps.executeUpdate();
        }catch(SQLException err){
            throw new RuntimeException("Error in update MARCA_MOD " + err);
        }finally{
        }
    }
    
    public void Destroy(MarcaModeloModel mmm){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("DELETE FROM marca_mod WHERE modelo_nome = ? ");
            ps.setString(1, mmm.getModelo_nome());
            ps.executeUpdate();
        }catch(SQLException err){
            throw new RuntimeException("Error in delete marca_mod " + err);
        }finally{
            conf.closeConnection(conn, ps);
        }
    }
}
