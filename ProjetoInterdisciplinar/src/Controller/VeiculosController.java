package Controller;

import Database.Config;
import java.sql.*;
import Models.VeiculosModel;
import java.util.ArrayList;
import Models.MarcaModeloModel;
import Models.LojasModel;
import Models.EstadosModel;

public final class VeiculosController {
    Config conf = new Config();
    
    public VeiculosController(){}
    
    public void Store(VeiculosModel vm, EstadosModel em, LojasModel lm, MarcaModeloModel mmm){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("INSERT INTO veiculos (placa, preco, ano, marca_nome, estado, modelo_nome, loja_id) values (?,?,?,?,?,?,?)");
            
            ps.setString(1, vm.getPlaca());
            ps.setFloat(2, vm.getPreco());
            ps.setInt(3, vm.getAno());
            ps.setString(4, vm.getMarca_nome());
            ps.setString(5, em.getSigla());
            ps.setString(6, mmm.getModelo_nome());
            ps.setString(7, lm.getLoja_id());
            ps.executeUpdate();
            
        }catch(SQLException err){
            throw new RuntimeException("Error in insert MARCA_MOD " +  err);
        }finally{
            conf.closeConnection(conn, ps);
        }
    }
    
    public ArrayList<VeiculosModel> Index(){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = conn.prepareStatement("SELECT * FROM veiculos ");
            rs = ps.executeQuery();
            
            ArrayList<VeiculosModel> lista = new ArrayList<>();
            while(rs.next()){
                MarcaModeloModel mmm = new MarcaModeloModel(rs.getString("marca_nome"), rs.getString("Modelo_nome"));
                LojasModel lm = new LojasModel("", rs.getString("loja_id"));
                EstadosModel em = new EstadosModel(rs.getString("estado"), "");
                VeiculosModel tmp = new VeiculosModel(rs.getString("placa"), rs.getFloat("preco"), rs.getInt("ano"), mmm.getMarca_nome(), lm, em, mmm);
                lista.add(tmp);
            }
            
            return lista;
            
        }catch(SQLException err){
            throw new RuntimeException("Error get datas of VEICULOS " + err);
        }finally{
            conf.closeConnection(conn, ps, rs);
        }
    }
    
    public void Update(VeiculosModel vm, EstadosModel em, LojasModel lm, MarcaModeloModel mmm){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("UPDATE veiculos SET placa = ?, preco = ?, ano = ? , marca_nome = ?, estado = ?, modelo_nome = ?, loja_id = ? WHERE placa = ?");
            ps.setString(1, vm.getPlaca());
            ps.setFloat(2, vm.getPreco());
            ps.setInt(3, vm.getAno());
            ps.setString(4, vm.getMarca_nome());
            ps.setString(5, em.getSigla());
            ps.setString(6, mmm.getModelo_nome());
            ps.setString(7, lm.getLoja_nome());
            ps.setString(8, vm.getPlaca());
            
            ps.executeUpdate();
        }catch(SQLException err){
            throw new RuntimeException("Error in update VEICULOS " + err);
        }finally{
            conf.closeConnection(conn, ps);
        }
    }
    
    public void Destroy(VeiculosModel vm){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("DELETE FROM veiculos WHERE placa = ? ");
            ps.setString(1, vm.getPlaca());
            ps.executeUpdate();
        }catch(SQLException err){
            throw new RuntimeException("Error in delete marca_mod " + err);
        }finally{
            conf.closeConnection(conn, ps);
        }
    }
    
    //custom methods (methods that doesnt exist in design pattern MVC)
    
    public ArrayList<VeiculosModel> getCarsByModel(MarcaModeloModel mmm){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = conn.prepareStatement("SELECT * FROM veiculos WHERE modelo_nome = ?");
            ps.setString(1, mmm.getModelo_nome());
            
            rs = ps.executeQuery();
            
            ArrayList<VeiculosModel> lista = new ArrayList<>();
            
            while(rs.next()){
                EstadosModel em = new EstadosModel(rs.getString("estado"), "");
                LojasModel lm = new LojasModel("", rs.getString("loja_id"));
                MarcaModeloModel tmp = new MarcaModeloModel(rs.getString("marca_nome"), rs.getString("modelo_nome"));
                
                VeiculosModel vm = new VeiculosModel(rs.getString("placa"), rs.getFloat("preco"), rs.getInt("ano"), tmp.getMarca_nome(), lm, em, tmp);
                lista.add(vm);
            }
            
            return lista;
            
        }catch(SQLException err){
            throw new RuntimeException("Error in get cars by model "+ err);
        }finally{
            conf.closeConnection(conn, ps, rs);
        }
    }
    
    public ArrayList<VeiculosModel> getCarsByBoard(VeiculosModel vm){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = conn.prepareStatement("SELECT * FROM veiculos WHERE placa = ?");
            ps.setString(1, vm.getPlaca());
            
            rs = ps.executeQuery();
            
            ArrayList<VeiculosModel> lista = new ArrayList<>();
            
            while(rs.next()){
                EstadosModel em = new EstadosModel(rs.getString("estado"), "");
                LojasModel lm = new LojasModel("", rs.getString("loja_id"));
                MarcaModeloModel tmp = new MarcaModeloModel(rs.getString("marca_nome"), rs.getString("modelo_nome"));
                
                VeiculosModel vm_tmp = new VeiculosModel(rs.getString("placa"), rs.getFloat("preco"), rs.getInt("ano"), tmp.getMarca_nome(), lm, em, tmp);
                lista.add(vm_tmp);
            }
            
            return lista;
            
        }catch(SQLException err){
            throw new RuntimeException("Error in get cars by board "+ err);
        }finally{
            conf.closeConnection(conn, ps, rs);
        }
    }
    
    public ArrayList<VeiculosModel> getCarsByBrand(MarcaModeloModel mmm){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = conn.prepareStatement("SELECT * FROM veiculos WHERE marca_nome = ?");
            ps.setString(1, mmm.getMarca_nome());
            
            rs = ps.executeQuery();
            
            ArrayList<VeiculosModel> lista = new ArrayList<>();
            
            while(rs.next()){
                EstadosModel em = new EstadosModel(rs.getString("estado"), "");
                LojasModel lm = new LojasModel("", rs.getString("loja_id"));
                MarcaModeloModel tmp = new MarcaModeloModel(rs.getString("marca_nome"), rs.getString("modelo_nome"));
                
                VeiculosModel vm = new VeiculosModel(rs.getString("placa"), rs.getFloat("preco"), rs.getInt("ano"), tmp.getMarca_nome(), lm, em, tmp);
                lista.add(vm);
            }
            
            return lista;
            
        }catch(SQLException err){
            throw new RuntimeException("Error in get cars by brand "+ err);
        }finally{
            conf.closeConnection(conn, ps, rs);
        }
    }
    
    public ArrayList<VeiculosModel> getCarsByPrice(float min, float max){
        Connection conn = conf.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            ps = conn.prepareStatement("SELECT * FROM veiculos WHERE preco BETWEEN ? AND ?");
            ps.setFloat(1, min);
            ps.setFloat(2, max);
            
            rs = ps.executeQuery();
            
            ArrayList<VeiculosModel> lista = new ArrayList<>();
            
            while(rs.next()){
                EstadosModel em = new EstadosModel(rs.getString("estado"), "");
                LojasModel lm = new LojasModel("", rs.getString("loja_id"));
                MarcaModeloModel tmp = new MarcaModeloModel(rs.getString("marca_nome"), rs.getString("modelo_nome"));
                
                VeiculosModel vm = new VeiculosModel(rs.getString("placa"), rs.getFloat("preco"), rs.getInt("ano"), tmp.getMarca_nome(), lm, em, tmp);
                lista.add(vm);
            }
            
            return lista;
            
        }catch(SQLException err){
            throw new RuntimeException("Error in get cars by brand "+ err);
        }finally{
            conf.closeConnection(conn, ps, rs);
        }
    }
}
