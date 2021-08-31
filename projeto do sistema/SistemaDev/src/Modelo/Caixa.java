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
public class Caixa {
    private int id_caixa;
    private String Mes;
    private float Entradas;
    private float Saidas;
    private float lucro;
    private String Dia;
    private String Hora;
    

    public int getId_caixa() {
        return id_caixa;
    }

    public void setId_caixa(int id_caixa) {
        this.id_caixa = id_caixa;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public float getEntradas() {
        return Entradas;
    }

    public void setEntradas(float Entradas) {
        this.Entradas = Entradas;
    }

    public float getSaidas() {
        return Saidas;
    }

    public void setSaidas(float Saidas) {
        this.Saidas = Saidas;
    }

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }
    
    
    
}
