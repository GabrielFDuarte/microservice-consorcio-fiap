/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nubank.fiap.consorcio.domain;

/**
 *
 * @author Gabriel Duarte
 */
public class ConsorcioResponse {
    
    private Long id;
    private Integer dt_vencimento;
    private double taxa_admin;
    private String tipo_grupo;
    private double credito;
    private Integer qtd_parcelas;
    private double valor_parcela;
    
    public ConsorcioResponse() {
        
    }

    public ConsorcioResponse(Long id, Integer dt_vencimento, double taxa_admin, String tipo_grupo, double credito, Integer qtd_parcelas, double valor_parcela) {
        this.id = id;
        this.dt_vencimento = dt_vencimento;
        this.taxa_admin = taxa_admin;
        this.tipo_grupo = tipo_grupo;
        this.credito = credito;
        this.qtd_parcelas = qtd_parcelas;
        this.valor_parcela = valor_parcela;
    }

    public Long getId() {
        return id;
    }
    
    public Integer getDt_vencimento() {
        return dt_vencimento;
    }

    public double getTaxa_admin() {
        return taxa_admin;
    }

    public String getTipo_grupo() {
        return tipo_grupo;
    }

    public double getCredito() {
        return credito;
    }

    public Integer getQtd_parcelas() {
        return qtd_parcelas;
    }

    public double getValor_parcela() {
        return valor_parcela;
    }
    
}
