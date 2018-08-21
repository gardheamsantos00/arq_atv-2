/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arq_atv_2.model;

import java.io.Serializable;

/**
 *
 * @author gardh
 */
public class Pais implements Serializable{
    
    private int idPais;
    private String nome;
    private String sigla;

    public Pais() {
    }
    
    

    public int getId() {
        return idPais;
    }

    public void setId(int id) {
        this.idPais = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.idPais;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (this.idPais != other.idPais) {
            return false;
        }
        return true;
    }
    
}
