/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDDC.fabricaconecao;
import Modelo.Login;
import Visao.JLogin;
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
public class LoginDAO {
private Connection conecta;
    
    public LoginDAO(){
    this.conecta = new fabricaconecao().conecta();
    }
public void cadLogin(Login l){
    //-----------------------------------------------------
        try {
             // 1Âº passo Criar Comando SQL
            String cmsql = "insert login(Usuario,Senha,Email,PergSeguranca,RespSeguranca)values(?,?,?,?,?)";
             // 1Âº Organizar o Comando SQL
            try (PreparedStatement stmt = conecta.prepareStatement(cmsql)) {
                stmt.setString(1, l.getUsuario());
                stmt.setString(2, l.getSenha());
                stmt.setString(3, l.getEmail());
                stmt.setString(4, l.getPergunta());
                stmt.setString(5, l.getResposta());
                // 1Âº Executar Comando SQL
                stmt.execute();
                // 1Âº Fechar ConeÃ§Ã£o
            }
        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar Informações de login"+erro);
            throw new RuntimeException(erro);
        }
        
        //-------------------------------------------------
}


public void AtualizarSenha(Login l){
    //-----------------------------------------------------
        try {
            // 1Âº passo Criar Comando SQL
            String cmsql = "UPDATE login SET Senha = ? WHERE RespSeguranca = ?";
             // 1Âº Organizar o Comando SQL
            try (PreparedStatement stmt = conecta.prepareStatement(cmsql)) {
                
                stmt.setString(1, l.getSenha());
                stmt.setString(2, l.getResposta());
                
                // 1Âº Executar Comando SQL
                stmt.executeUpdate();
                // 1Âº Fechar ConeÃ§Ã£o
            }
        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Erro ao Atualizar Senha " +erro);
            throw new RuntimeException(erro);
        }
        //-------------------------------------------------
    }

public java.util.List<Login> buscaridlogin(){
   
     java.util.List<Login> lista = new ArrayList<>();
     
         try {
              String cmsqlb = "select max(id_login) from login";
             // 1º Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Login Log = new Login();
                 Log.setId_login(rs.getInt("max(id_login)"));
                 
         
                 lista.add(Log);
                 
               
                 
                 
             }
        
             
         }catch (SQLException e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
     
     }

public boolean FazerLogin(String Usua,String Senha){
     
         try {
             
               // 1º passo Criar Comando SQL
            String cmsql = "select * from login where Usuario =? and Senha=?";
             // 1º Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsql);
             stmt.setString(1, Usua);
             stmt.setString(2, Senha);
             
             ResultSet rs = stmt.executeQuery();
             
            
            
             
          
             
             if (rs.first()) {

                
                 //fez login
               
                 return true;
             } 
             
   
         } catch (SQLException e) {
             
             
         }
     
         
           return false;
     }







public void Excluir(Login l){
System.out.println(l.getUsuario());
System.out.println(l.getSenha());
System.out.println(l.getEmail());
System.out.println(l.getPergunta());
System.out.println(l.getResposta());
}

public java.util.List<Login> buscarLogin(String Email){
     java.util.List<Login> lista = new ArrayList<>();
     
         try {
              String cmsqlb = "SELECT * from login WHERE Email LIKE ?";
             // 1º Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             
             stmt.setString(1, "%"+Email+"%");
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Login l = new Login();
                 l.setId_login(rs.getInt("id_login"));
                 l.setUsuario(rs.getString("Usuario"));
                 l.setSenha(rs.getString("Senha"));
                 l.setEmail(rs.getString("Email"));
                 l.setPergunta(rs.getString("PergSeguranca"));
                 l.setResposta(rs.getString("RespSeguranca"));
                 lista.add(l);
             }
        
             
         }catch (Exception e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
     
     }

}