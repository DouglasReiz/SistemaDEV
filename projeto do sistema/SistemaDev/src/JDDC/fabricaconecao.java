/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDDC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class fabricaconecao {
    
    public Connection conecta(){
    
        try {
            //return DriverManager.getConnection("jdbc:mysql://12.168.88.253/auroclin","master","qwe123");
            //return DriverManager.getConnection("jdbc:mysql://localhost/escolafutura","root","");
            return DriverManager.getConnection("jdbc:mysql://localhost/sistema","root","");
                    } catch (SQLException ex) {
                        
              JOptionPane.showMessageDialog(null, "Ligue o Servidor ou Conecte-se a Rede!");          
            throw new RuntimeException(ex);
            
        }

     }
    
}
