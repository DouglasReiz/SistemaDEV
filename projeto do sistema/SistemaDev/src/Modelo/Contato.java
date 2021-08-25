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
public class Contato {
    private int id_contato;
    private String Celular;
    private String Fixo;
    private String Whatsapp;
    private String email;
    private String Instagram;

    public int getId_contato() {
        return id_contato;
    }

    public void setId_contato(int id_contato) {
        this.id_contato = id_contato;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getFixo() {
        return Fixo;
    }

    public void setFixo(String Fixo) {
        this.Fixo = Fixo;
    }

    public String getWhatsapp() {
        return Whatsapp;
    }

    public void setWhatsapp(String Whatsapp) {
        this.Whatsapp = Whatsapp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstagram() {
        return Instagram;
    }

    public void setInstagram(String Instagram) {
        this.Instagram = Instagram;
    }
    
    
    
    
}
