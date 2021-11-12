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
public class Produto {
    private int id_produto;
    private String Nome;
    private String lote;
    private String Validade;
    private String Fabricante;
    private String Classificacao;
    private String CodBarras;
    private String Dataentrega;
    private float ValordCompra;
    private float valordvenda;
    private float quantidade;
    private int id_fornecedor;

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getValidade() {
        return Validade;
    }

    public void setValidade(String Validade) {
        this.Validade = Validade;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getClassificacao() {
        return Classificacao;
    }

    public void setClassificacao(String Classificacao) {
        this.Classificacao = Classificacao;
    }

    public String getCodBarras() {
        return CodBarras;
    }

    public void setCodBarras(String CodBarras) {
        this.CodBarras = CodBarras;
    }

    public String getDataentrega() {
        return Dataentrega;
    }

    public void setDataentrega(String Dataentrega) {
        this.Dataentrega = Dataentrega;
    }

   

    public void setValordvenda(int valordvenda) {
        this.valordvenda = valordvenda;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    

    public float getValordCompra() {
        return ValordCompra;
    }

    public void setValordCompra(float ValordCompra) {
        this.ValordCompra = ValordCompra;
    }

    public float getValordvenda() {
        return valordvenda;
    }

    public void setValordvenda(float valordvenda) {
        this.valordvenda = valordvenda;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

   

    
    
    
    
}
