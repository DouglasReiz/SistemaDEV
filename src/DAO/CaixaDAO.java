/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDDC.fabricaconecao;
import Modelo.Caixa;
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
public class CaixaDAO {
    
    private Connection conecta;
    
    public CaixaDAO(){
    this.conecta = new fabricaconecao().conecta();
    }
    
    public void cadFluxo(Caixa c){
    //-----------------------------------------------------
        try {
          
            
            // 1Âº passo Criar Comando SQL
            String cmsql = "insert caixa(Mes,Entradas,Saidas,Lucros,Dia,Hora)values(?,?,?,?,?,?)";
             // 1Âº Organizar o Comando SQL
            try (PreparedStatement stmt = conecta.prepareStatement(cmsql)) {
                stmt.setString(1, c.getMes());
                stmt.setFloat(2, c.getEntradas());
                stmt.setFloat(3, c.getSaidas());
                stmt.setFloat(4, c.getLucro());
                stmt.setString(5, c.getDia());
                stmt.setString(6, c.getHora());
                // 1Âº Executar Comando SQL
                stmt.execute();
                // 1Âº Fechar ConeÃ§Ã£o
            }
             
             
             
        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar Endereço"+erro);
            throw new RuntimeException(erro);
            
        }
        
        //-------------------------------------------------
    
    

}
    
    
public java.util.List<Caixa> buscarFluxo(){
     java.util.List<Caixa> lista = new ArrayList<>();
         try {
              String cmsqlb = "select * from caixa";
             // 1º Organizar o Comando SQL
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Caixa F = new Caixa();
                 F.setId_caixa(rs.getInt("id_caixa"));
                 F.setMes(rs.getString("Mes"));
                 F.setSaidas(rs.getFloat("Saidas"));
                 F.setEntradas(rs.getFloat("Entradas"));
                 F.setLucro(rs.getFloat("Lucros"));
                 F.setDia(rs.getString("Dia"));
                 F.setHora(rs.getString("Hora"));
                 lista.add(F);
             }
        
             
         }catch (SQLException e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
     }

    public java.util.List<Caixa> buscarPorFLuxo(String Mes){
     java.util.List<Caixa> lista = new ArrayList<>();
     
         try {
              String cmsqlb = "SELECT * from caixa WHERE Mes LIKE ?";
             // 1º Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             
             stmt.setString(1, "%"+Mes+"%");
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Caixa ca = new Caixa();
                 ca.setId_caixa(rs.getInt("id_caixa"));
                 ca.setMes(rs.getString("Mes"));
                 ca.setEntradas(rs.getFloat("Entradas"));
                 ca.setSaidas(rs.getFloat("Saidas"));
                 ca.setLucro(rs.getFloat("Lucros"));
                 ca.setDia(rs.getString("Dia"));
                 ca.setHora(rs.getString("Hora"));
                 lista.add(ca);
             }
        
             
         }catch (SQLException e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
     
     }
    
    public java.util.List<Caixa> buscarLucro(String Dia){
     java.util.List<Caixa> lista = new ArrayList<>();
     
         try {
              String cmsqlb = "SELECT * from caixa WHERE Dia LIKE ?";
             // 1º Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             
             stmt.setString(1, "%"+Dia+"%");
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Caixa ca = new Caixa();
                 ca.setId_caixa(rs.getInt("id_caixa"));
                 ca.setMes(rs.getString("Mes"));
                 ca.setEntradas(rs.getFloat("Entradas"));
                 ca.setSaidas(rs.getFloat("Saidas"));
                 ca.setLucro(rs.getFloat("Lucros"));
                 ca.setDia(rs.getString("Dia"));
                 ca.setHora(rs.getString("Hora"));
                 lista.add(ca);
             }
        
             
         }catch (SQLException e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
     
     }
    
    public void AtualizarFluxo(Caixa c){
    //-----------------------------------------------------
        try {
            // 1Âº passo Criar Comando SQL
            String cmsql = "UPDATE caixa SET Mes = ?,Entradas = ?,Saidas = ?,Lucros = ? WHERE id_caixa = ?";
             // 1Âº Organizar o Comando SQL
            try (PreparedStatement stmt = conecta.prepareStatement(cmsql)) {
                stmt.setString(1, c.getMes());
                stmt.setFloat(2, c.getEntradas());
                stmt.setFloat(3, c.getSaidas());
                stmt.setFloat(4, c.getLucro());
                stmt.setInt(5, c.getId_caixa());
                // 1Âº Executar Comando SQL
                stmt.executeUpdate();
                // 1Âº Fechar ConeÃ§Ã£o
            }
        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Erro ao Atualizar Fluxo do Caixa " +erro);
            throw new RuntimeException(erro);
        }
        //-------------------------------------------------
    }
    
    public void Excluir(Caixa c){
    //-----------------------------------------------------
        try {
            // 1Âº passo Criar Comando SQL
            String cmsql = "DELETE FROM caixa WHERE id_caixa = ?";
             // 1Âº Organizar o Comando SQL
            try (PreparedStatement stmt = conecta.prepareStatement(cmsql)) {
                stmt.setInt(1, c.getId_caixa());
                // 1Âº Executar Comando SQL
                stmt.executeUpdate();
                // 1Âº Fechar ConeÃ§Ã£o
            }
        } catch (SQLException erro) {
             JOptionPane.showMessageDialog(null, "Erro ao Excluir Fluxo do Caixa " +erro);
            throw new RuntimeException(erro);
        }
        //-------------------------------------------------
    }
    
}
