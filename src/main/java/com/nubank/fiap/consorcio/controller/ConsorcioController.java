/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nubank.fiap.consorcio.controller;

import com.nubank.fiap.consorcio.domain.Consorcio;
import com.nubank.fiap.consorcio.domain.ConsorcioResponse;
import com.nubank.fiap.consorcio.repository.ConsorcioRepository;
import com.nubank.fiap.consorcio.service.ConsorcioService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gabriel Duarte
 */
@RestController
@RequestMapping("/consorcio")
public class ConsorcioController {

    @Autowired
    private ConsorcioRepository consorcioRepository;

    @Autowired
    private ConsorcioService consorcioService;

    @EventListener
    public void appReady(ApplicationReadyEvent event) {
//        CARROS
        consorcioRepository.save(new Consorcio("CARROS", 5, 7.50, "ANDAMENTO", 30445.80, 23));
        consorcioRepository.save(new Consorcio("CARROS", 15, 7.50, "ANDAMENTO", 47990.00, 13));
        consorcioRepository.save(new Consorcio("CARROS", 15, 7.50, "ANDAMENTO", 48371.80, 15));
        consorcioRepository.save(new Consorcio("CARROS", 20, 7.50, "FORMACAO", 100990.00, 69));
//        MOTOS
        consorcioRepository.save(new Consorcio("MOTOS", 5, 22.00, "ANDAMENTO", 14445.00, 71));
        consorcioRepository.save(new Consorcio("MOTOS", 5, 22.00, "ANDAMENTO", 18608.00, 71));
        consorcioRepository.save(new Consorcio("MOTOS", 15, 22.00, "ANDAMENTO", 25457.00, 71));
        consorcioRepository.save(new Consorcio("MOTOS", 20, 22.00, "ANDAMENTO", 29990.00, 74));
//        PESADOS
        consorcioRepository.save(new Consorcio("PESADOS", 10, 15.50, "ANDAMENTO", 580916.00, 65));
        consorcioRepository.save(new Consorcio("PESADOS", 10, 15.50, "FORMACAO", 499000.00, 60));
        consorcioRepository.save(new Consorcio("PESADOS", 20, 15.50, "FORMACAO", 630197.67, 71));
        consorcioRepository.save(new Consorcio("PESADOS", 25, 16.50, "ANDAMENTO", 550100.00, 60));
//        IMOVEIS
        consorcioRepository.save(new Consorcio("IMOVEIS", 20, 16.80, "ANDAMENTO", 191053.16, 102));
        consorcioRepository.save(new Consorcio("IMOVEIS", 10, 14.30, "ANDAMENTO", 293657.44, 55));
        consorcioRepository.save(new Consorcio("IMOVEIS", 10, 14.30, "FORMACAO", 313234.58, 55));
        consorcioRepository.save(new Consorcio("IMOVEIS", 15, 14.30, "ANDAMENTO", 501820.47, 66));
    }

    @GetMapping
    public ArrayList<ConsorcioResponse> listar(@RequestParam(value = "categoria") String categoria) {

        ArrayList<ConsorcioResponse> consorcioResponse = new ArrayList<ConsorcioResponse>();

        for (Consorcio consorcio : consorcioRepository.findAllByCategory(categoria)) {
            consorcioResponse.add(
                    new ConsorcioResponse(
                            consorcio.getId(),
                            consorcio.getDt_vencimento(), 
                            consorcio.getTaxa_admin(), 
                            consorcio.getTipo_grupo(), 
                            consorcio.getCredito(), 
                            consorcio.getQtd_parcelas(), 
                            consorcioService.CalculaParcelaComTaxas(
                                    consorcio.getTaxa_admin(), 
                                    consorcio.getCredito(), 
                                    consorcio.getQtd_parcelas())));
        }
        return consorcioResponse;
    }

}
