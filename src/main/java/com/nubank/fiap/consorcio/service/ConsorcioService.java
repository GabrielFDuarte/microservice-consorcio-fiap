/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nubank.fiap.consorcio.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Gabriel Duarte
 */
@Service
public class ConsorcioService {
    
    private double CalculaFundoComum(double valorConsorcio, Integer parcelas) {
        return valorConsorcio/parcelas;
    }
    
    private double CalculaTaxaAdministracao(double taxaAdministracao, double valorConsorcio, Integer parcelas) {
        return ((taxaAdministracao/100) * valorConsorcio) / parcelas;
    }
    
    private double CalculaFundoDeReserva(double valorConsorcio, Integer parcelas) {
        return (0.02 * valorConsorcio) / parcelas;
    }
    
    public double CalculaParcelaComTaxas(double taxaAdministracao, double valorConsorcio, Integer parcelas) {
        return CalculaFundoComum(valorConsorcio, parcelas)
                + CalculaTaxaAdministracao(taxaAdministracao, valorConsorcio, parcelas)
                + CalculaFundoDeReserva(valorConsorcio, parcelas);
    }
}
