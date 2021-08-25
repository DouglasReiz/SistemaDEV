/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jorge
 */
public class Fornecedor {
    private int id_fornecedor;
    private String NomeFnt;
    private String RazaoSocial;
    private String CNPJ;
    private String contato;
    private String Entrega;
    private int id_contato;
    private int id_endereco;

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getNomeFnt() {
        return NomeFnt;
    }

    public void setNomeFnt(String NomeFnt) {
        this.NomeFnt = NomeFnt;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEntrega() {
        return Entrega;
    }

    public void setEntrega(String Entrega) {
        this.Entrega = Entrega;
    }

    public int getId_contato() {
        return id_contato;
    }

    public void setId_contato(int id_contato) {
        this.id_contato = id_contato;
    }

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    @Override
    public String toString() {
        return getNomeFnt(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
