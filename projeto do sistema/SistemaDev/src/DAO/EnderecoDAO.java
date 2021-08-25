/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDDC.fabricaconecao;
import Modelo.Endereco;
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
public class EnderecoDAO {
    
    private Connection conecta;
    
    public EnderecoDAO(){
    this.conecta = new fabricaconecao().conecta();
    }
    
    public void cadEndereco(Endereco e){
    //-----------------------------------------------------
        try {
          
            
            // 1Âº passo Criar Comando SQL
            String cmsql = "insert endereco(Pais,Estado,Cidade,Bairro,Rua,Numero,Complemento,CEP)values(?,?,?,?,?,?,?,?)";
             // 1Âº Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsql);
             stmt.setString(1, e.getPais());
              stmt.setString(2, e.getEstado());
               stmt.setString(3, e.getCidade());
                stmt.setString(4, e.getBairro());
                 stmt.setString(5, e.getRua());
                  stmt.setString(6, e.getNumero());
                   stmt.setString(7, e.getComplemento());
                    stmt.setString(8, e.getCEP());
                     
                    
                  
                  
         
         
             // 1Âº Executar Comando SQL
             stmt.execute();
             
             // 1Âº Fechar ConeÃ§Ã£o
             stmt.close();
             
             
             
        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar Endereço"+erro);
            throw new RuntimeException(erro);
            
        }
        
        //-------------------------------------------------
    
    

}
    
    public java.util.List<Endereco> buscaridendereco(){
   
     java.util.List<Endereco> lista = new ArrayList<Endereco>();
     
         try {
              String cmsqlb = "select max(id_endereco) from endereco";
             // 1º Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Endereco End = new Endereco();
                 End.setId_endereco(rs.getInt("max(id_endereco)"));
                 
         
                 lista.add(End);
                 
               
                 
                 
             }
        
             
         }catch (SQLException e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
     
     }
    
    public void Atualizar(Endereco e){
    System.out.println(e.getPais());
    System.out.println(e.getEstado());
    System.out.println(e.getCidade());
    System.out.println(e.getBairro());
    System.out.println(e.getRua());
    System.out.println(e.getNumero());
    System.out.println(e.getComplemento());
    System.out.println(e.getCEP());
    }
    
    public void Excluir(Endereco e){
    System.out.println(e.getPais());
    System.out.println(e.getEstado());
    System.out.println(e.getCidade());
    System.out.println(e.getBairro());
    System.out.println(e.getRua());
    System.out.println(e.getNumero());
    System.out.println(e.getComplemento());
    System.out.println(e.getCEP());
    }
}
