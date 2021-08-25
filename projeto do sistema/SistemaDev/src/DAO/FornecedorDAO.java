/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;



import JDDC.fabricaconecao;
import Modelo.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Jorge
 */
public class FornecedorDAO {
    private Connection conecta;
    
    public FornecedorDAO(){
    this.conecta = new fabricaconecao().conecta();
    }
    
    public void cadFornecedor(Fornecedor F){
    //-----------------------------------------------------
        try {
             // 1Âº passo Criar Comando SQL
            String cmsql = "insert fornecedor(NomeFant,RazaoSocial,CNPJ,Contato,Dia,id_contato,id_endereco)values(?,?,?,?,?,?,?)";
             // 1Âº Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsql);
             stmt.setString(1, F.getNomeFnt());
              stmt.setString(2, F.getRazaoSocial());
               stmt.setString(3, F.getCNPJ());
                stmt.setString(4, F.getContato());
                 stmt.setString(5, F.getEntrega());
                  stmt.setInt(6, F.getId_contato());
                   stmt.setInt(7, F.getId_endereco());
             // 1Âº Executar Comando SQL
             stmt.execute();
             
             // 1Âº Fechar ConeÃ§Ã£o
             stmt.close();
            
        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar Forncedor"+ erro);
            throw new RuntimeException(erro);
            
        }
        
        //-------------------------------------------------
    }
    
    public java.util.List<Fornecedor> buscaridfornecedor(){
   
     java.util.List<Fornecedor> lista = new ArrayList<>();
     
         try {
              String cmsqlb = "select max(id_fornecedor) from fornecedor";
             // 1º Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Fornecedor fo = new Fornecedor();
                 fo.setId_fornecedor(rs.getInt("max(id_fornecedor)"));
                 
                 lista.add(fo);
            }
         }catch (SQLException e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
     
     }
    
    
    public java.util.List<Fornecedor> buscarFornecedor(){
   
     java.util.List<Fornecedor> lista = new ArrayList<>();
     
         try {
              String cmsqlb = "select * from fornecedor";
             // 1º Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Fornecedor f = new Fornecedor();
                 f.setId_fornecedor(rs.getInt("id_fornecedor"));
                 f.setNomeFnt(rs.getString("NomeFant"));
                 f.setCNPJ(rs.getString("CNPJ"));
                 f.setRazaoSocial(rs.getString("Razaosocial"));
                 lista.add(f);
                 }
         }catch (SQLException e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
     }
    
    
    public java.util.List<Fornecedor> buscarfornecedor(String Nome){
   
     java.util.List<Fornecedor> lista = new ArrayList<>();
     
         try {
              String cmsqlb = "select * from fornecedor Where NomeFant = ?";
              
             // 1º Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             stmt.setString(1, "%"+Nome+"%");
             
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Fornecedor f = new Fornecedor();
                 f.setId_fornecedor(rs.getInt("id_fornecedor"));
                 f.setNomeFnt(rs.getString("NomeFant"));
                 f.setRazaoSocial(rs.getString("Razaosocial"));
                 f.setCNPJ(rs.getString("CNPJ"));
                 f.setContato(rs.getString("Contato"));
                 f.setEntrega(rs.getString("Dia"));
                 lista.add(f);
             }
         }catch (SQLException e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
     
     }
    
    
    
    public void AtualizarFornecedor(Fornecedor f){
    //-----------------------------------------------------
        try {
            // 1Âº passo Criar Comando SQL
            String cmsql = "UPDATE fornecedor SET NomeFant = ?,Razaosocial = ?,CNPJ = ? WHERE id_fornecedor = ?";
             // 1Âº Organizar o Comando SQL
            try (PreparedStatement stmt = conecta.prepareStatement(cmsql)) {
                stmt.setString(1, f.getNomeFnt());
                stmt.setString(2, f.getRazaoSocial());
                stmt.setString(3, f.getCNPJ());
                stmt.setInt(4, f.getId_fornecedor());
                // 1Âº Executar Comando SQL
                stmt.executeUpdate();
                // 1Âº Fechar ConeÃ§Ã£o
            }
        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Erro ao Atualizar Produto " +erro);
            throw new RuntimeException(erro);
            
        }
        
        //-------------------------------------------------
    
    }
    
    public void Excluir(Fornecedor f){
    //-----------------------------------------------------
        try {
            // 1Âº passo Criar Comando SQL
            String cmsql = "DELETE FROM Produto WHERE id_produto = ?";
             // 1Âº Organizar o Comando SQL
            try (PreparedStatement stmt = conecta.prepareStatement(cmsql)) {
                stmt.setInt(1, f.getId_fornecedor());
                // 1Âº Executar Comando SQL
                stmt.executeUpdate();
                // 1Âº Fechar ConeÃ§Ã£o
            }
        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Erro ao Excluir Fornecedor " +erro);
            throw new RuntimeException(erro);
            
        }
        
        //-------------------------------------------------
    
    }
}