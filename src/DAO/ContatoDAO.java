/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDDC.fabricaconecao;
import Modelo.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class ContatoDAO {
    private Connection conecta;
    
    public ContatoDAO(){
    this.conecta = new fabricaconecao().conecta();
    }
public void cadContato(Contato c){
    //-----------------------------------------------------
        try {
          
            
            // 1Âº passo Criar Comando SQL
            String cmsql = "insert contato(Celular,Fixo,Email,Whatsapp,Instagram)values(?,?,?,?,?)";
             // 1Âº Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsql);
             stmt.setString(1, c.getCelular());
              stmt.setString(2, c.getFixo());
               stmt.setString(3, c.getEmail());
                stmt.setString(4, c.getWhatsapp());
                 stmt.setString(5, c.getInstagram());
                  
                  
                  
         
         
             // 1Âº Executar Comando SQL
             stmt.execute();
             
             // 1Âº Fechar ConeÃ§Ã£o
             stmt.close();
             
             
             
        } catch (Exception erro) {
            
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar Contato" +erro);
            throw new RuntimeException(erro);
            
        }
        
        //-------------------------------------------------
    
    }
    
    public java.util.List<Contato> buscaridcontato(){
   
     java.util.List<Contato> lista = new ArrayList<Contato>();
     
         try {
              String cmsqlb = "select max(id_contato) from contato";
             // 1º Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Contato con = new Contato();
                 con.setId_contato(rs.getInt("max(id_contato)"));
                 
         
                 lista.add(con);
                 
               
                 
                 
             }
        
             
         }catch (Exception e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
     
     }
    
    public void Atualizar(Contato c){
    System.out.println(c.getCelular());
    System.out.println(c.getEmail());
    System.out.println(c.getFixo());
    System.out.println(c.getInstagram());
    System.out.println(c.getWhatsapp());
    }
    
    public void Excluir(Contato c){
    System.out.println(c.getCelular());
    System.out.println(c.getEmail());
    System.out.println(c.getFixo());
    System.out.println(c.getInstagram());
    System.out.println(c.getWhatsapp());
    }
}
