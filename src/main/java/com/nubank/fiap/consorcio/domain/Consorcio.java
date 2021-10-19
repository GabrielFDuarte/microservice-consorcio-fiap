/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nubank.fiap.consorcio.domain;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Gabriel Duarte
 */
@Entity
public class Consorcio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private String categoria;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer dt_vencimento;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private double taxa_admin;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private String tipo_grupo;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private double credito;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer qtd_parcelas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getDt_vencimento() {
        return dt_vencimento;
    }

    public void setDt_vencimento(Integer dt_vencimento) {
        this.dt_vencimento = dt_vencimento;
    }

    public double getTaxa_admin() {
        return taxa_admin;
    }

    public void setTaxa_admin(double taxa_admin) {
        this.taxa_admin = taxa_admin;
    }

    public String getTipo_grupo() {
        return tipo_grupo;
    }

    public void setTipo_grupo(String tipo_grupo) {
        this.tipo_grupo = tipo_grupo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    public Integer getQtd_parcelas() {
        return qtd_parcelas;
    }

    public void setQtd_parcelas(Integer qtd_parcelas) {
        this.qtd_parcelas = qtd_parcelas;
    }
    
    public Consorcio() {
        
    }

    public Consorcio(String categoria, Integer dt_vencimento, double taxa_admin, String tipo_grupo, double credito, Integer qtd_parcelas) {
        this.categoria = categoria;
        this.dt_vencimento = dt_vencimento;
        this.taxa_admin = taxa_admin;
        this.tipo_grupo = tipo_grupo;
        this.credito = credito;
        this.qtd_parcelas = qtd_parcelas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final Consorcio other = (Consorcio) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
