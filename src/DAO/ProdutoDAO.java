/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDDC.fabricaconecao;
import Modelo.Produto;
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
public class ProdutoDAO {
    private Connection conecta;
    
    public ProdutoDAO(){
    this.conecta = new fabricaconecao().conecta();
    }
public void cadProduto(Produto p){
    //-----------------------------------------------------
        try {
             // 1Âº passo Criar Comando SQL
            String cmsql = "insert produto(Nome,Lote,Validade,Fabricante,Classificacao,Codbarras,DataEntrega,ValorCompra,ValorVenda,Quant,id_fornecedor)values(?,?,?,?,?,?,?,?,?,?,?)";
             // 1Âº Organizar o Comando SQL
            try (PreparedStatement stmt = conecta.prepareStatement(cmsql)) {
                stmt.setString(1, p.getNome());
                stmt.setString(2, p.getLote());
                stmt.setString(3, p.getValidade());
                stmt.setString(4, p.getFabricante());
                stmt.setString(5, p.getClassificacao());
                stmt.setString(6, p.getCodBarras());
                stmt.setString(7, p.getDataentrega());
                stmt.setFloat(8, p.getValordCompra());
                stmt.setFloat(9, p.getValordvenda());
                stmt.setFloat(10, p.getQuantidade());
                stmt.setInt(11, p.getId_fornecedor());
                // 1Âº Executar Comando SQL
                stmt.execute();
                // 1Âº Fechar ConeÃ§Ã£o
            }
        } catch (Exception erro) {
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar roduto " +erro);
            throw new RuntimeException(erro);
        }
        //-------------------------------------------------
    }
    
    public void AtualizarProduto(Produto p){
    //-----------------------------------------------------
        try {
            // 1Âº passo Criar Comando SQL
            String cmsql = "UPDATE produto SET Nome = ?,Codbarras = ?,ValorVenda = ? WHERE id_produto = ?";
             // 1Âº Organizar o Comando SQL
            try (PreparedStatement stmt = conecta.prepareStatement(cmsql)) {
                stmt.setString(1, p.getNome());
                stmt.setString(2, p.getCodBarras());
                stmt.setFloat(3, p.getValordvenda());
                stmt.setInt(4, p.getId_produto());
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
    public void Excluir(Produto p){
    //-----------------------------------------------------
        try {
            // 1Âº passo Criar Comando SQL
            String cmsql = "DELETE FROM Produto WHERE id_produto = ?";
             // 1Âº Organizar o Comando SQL
            try (PreparedStatement stmt = conecta.prepareStatement(cmsql)) {
                stmt.setInt(1, p.getId_produto());
                // 1Âº Executar Comando SQL
                stmt.executeUpdate();
                // 1Âº Fechar ConeÃ§Ã£o
            }
        } catch (SQLException erro) {
             JOptionPane.showMessageDialog(null, "Erro ao Excluir Produto " +erro);
            throw new RuntimeException(erro);
        }
        //-------------------------------------------------
    }
    
    public void Eliminar(Produto p){
    //-----------------------------------------------------
        try {
            // 1Âº passo Criar Comando SQL
            String cmsql = "UPDATE FROM Produto WHERE Codbarras = ?";
             // 1Âº Organizar o Comando SQL
            try (PreparedStatement stmt = conecta.prepareStatement(cmsql)) {
                stmt.setString(1, p.getCodBarras());
                stmt.setFloat(2, p.getQuantidade());
                // 1Âº Executar Comando SQL
                stmt.executeUpdate();
                // 1Âº Fechar ConeÃ§Ã£o
            }
        } catch (SQLException erro) {
             JOptionPane.showMessageDialog(null, "Erro ao Excluir Produto " +erro);
            throw new RuntimeException(erro);
        }
        //-------------------------------------------------
    }
    

    public java.util.List<Produto> buscaridproduto(){
     java.util.List<Produto> lista = new ArrayList<>();
         try {
              String cmsqlb = "select max(id_produto) from produto";
             // 1º Organizar o Comando SQL
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Produto P = new Produto();
                 P.setId_produto(rs.getInt("max(id_produto)"));
                 lista.add(P);
             }
         }catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
    }

public java.util.List<Produto> buscarProdutos(){
     java.util.List<Produto> lista = new ArrayList<>();
         try {
              String cmsqlb = "select * from produto";
             // 1º Organizar o Comando SQL
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Produto P = new Produto();
                 P.setId_produto(rs.getInt("id_produto"));
                 P.setNome(rs.getString("Nome"));
                 P.setCodBarras(rs.getString("Codbarras"));
                 P.setValordvenda(rs.getFloat("ValorVenda"));
                 P.setClassificacao(rs.getString("Classificacao"));
                 lista.add(P);
             }
        
             
         }catch (Exception e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
     }



    
    public java.util.List<Produto> buscarproduto(String Nome){
     java.util.List<Produto> lista = new ArrayList<>();
     
         try {
              String cmsqlb = "SELECT * from produto WHERE Nome LIKE ?";
             // 1º Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             
             stmt.setString(1, "%"+Nome+"%");
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Produto pro = new Produto();
                 pro.setId_produto(rs.getInt("id_produto"));
                 pro.setNome(rs.getString("Nome"));
                 pro.setFabricante(rs.getString("Fabricante"));
                 pro.setClassificacao(rs.getString("Classificacao"));
                 pro.setCodBarras(rs.getString("Codbarras"));
                 pro.setValordvenda(rs.getFloat("ValorVenda"));
                 lista.add(pro);
             }
        
             
         }catch (Exception e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
     
     }
    
    
    public java.util.List<Produto> BuscarProduto(String COD){
     java.util.List<Produto> lista = new ArrayList<>();
     
     
     
         try {
              String cmsqlb = "select * from produto Where Codbarras LIKE ?";
             // 1º Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             stmt.setString(1, "%"+COD+"%");
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Produto pro = new Produto();
                 pro.setId_produto(rs.getInt("id_produto"));
                 pro.setNome(rs.getString("Nome"));
                 pro.setFabricante(rs.getString("Fabricante"));
                 pro.setClassificacao(rs.getString("Classificacao"));
                 pro.setCodBarras(rs.getString("Codbarras"));
                 pro.setValordvenda(rs.getFloat("ValorVenda"));
                 pro.setQuantidade(rs.getFloat("Quant"));
                 lista.add(pro);
                 
                
             }
        
             
         }catch (Exception e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
     
     }
    
    
}
