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
import java.sql.SQLException;
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
            String cmsql = "insert into caixa(Mes,Entradas,Saidas,Lucros)values(?,?,?,?)";
             // 1Âº Organizar o Comando SQL
            try (PreparedStatement stmt = conecta.prepareStatement(cmsql)) {
                stmt.setString(1, c.getMes());
                stmt.setFloat(2, c.getEntradas());
                stmt.setFloat(3, c.getSaidas());
                stmt.setFloat(4, c.getLucro());
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
    
    
    
}
