/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import JDDC.fabricaconecao;
import Modelo.Funcionario;
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
public class FuncionarioDAO {
    private Connection conecta;
    
    public FuncionarioDAO(){
    this.conecta = new fabricaconecao().conecta();
    }
public void cadFuncionario(Funcionario f){
    //-----------------------------------------------------
        try {
            // 1Âº passo Criar Comando SQL
            String cmsql = "insert funcionario(Nome,CPF,RG,DataNasc,Sexo,CNH,Raca,Funcao,Hinicio,HFim,Salario,Comissao,id_endereco,id_login,id_contato)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
             // 1Âº Organizar o Comando SQL
             PreparedStatement stmt = conecta.prepareStatement(cmsql);
             stmt.setString(1, f.getNome());
              stmt.setString(2, f.getCPF());
               stmt.setString(3, f.getRG());
                stmt.setString(4, f.getDataNasc());
                 stmt.setString(5, f.getSexo());
                  stmt.setString(6, f.getCNH());
                   stmt.setString(7, f.getRaca());
                    stmt.setString(8, f.getFuncao());
                     stmt.setString(9, f.getHinicio());
                      stmt.setString(10, f.getHfim());
                       stmt.setString(11, f.getSalario());
                        stmt.setString(12, f.getComissao());
                         stmt.setInt(13, f.getId_endereco());
                          stmt.setInt(14, f.getId_login());
                           stmt.setInt(15, f.getId_contato());
             // 1Âº Executar Comando SQL
             stmt.execute();
             
             // 1Âº Fechar ConeÃ§Ã£o
             stmt.close();
        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Erro ao cadastrar Funcionario"+erro);
            throw new RuntimeException(erro);
        }
        //-------------------------------------------------
    }
    
    public java.util.List<Funcionario> buscaridfuncionario(){
   
     java.util.List<Funcionario> lista = new ArrayList<Funcionario>();
     
         try {
              String cmsqlb = "select max(id_funcionario) from funcionario";
             // 1º Organizar o Comando SQL
             
             PreparedStatement stmt = conecta.prepareStatement(cmsqlb);
             
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Funcionario fun = new Funcionario();
                 fun.setId_funcionario(rs.getInt("max(id_funcionario)"));
                 lista.add(fun);
             }
         }catch (SQLException e) {
             
             JOptionPane.showMessageDialog(null, e);
         }
              return  lista;
     }
    
    public void Atualizar(Funcionario f) {
    System.out.println(f.getNome());
    System.out.println(f.getRG());
    System.out.println(f.getCPF());
    System.out.println(f.getSexo());
    System.out.println(f.getDataNasc());
    System.out.println(f.getFuncao());
    System.out.println(f.getCNH());
    System.out.println(f.getRaca());
    System.out.println(f.getHinicio());
    System.out.println(f.getSalario());
    }
    
    public void Excluir(Funcionario f) {
    System.out.println(f.getNome());
    System.out.println(f.getRG());
    System.out.println(f.getCPF());
    System.out.println(f.getSexo());
    System.out.println(f.getDataNasc());
    System.out.println(f.getFuncao());
    System.out.println(f.getCNH());
    System.out.println(f.getRaca());
    System.out.println(f.getHinicio());
    System.out.println(f.getSalario());
    }
    
    }
