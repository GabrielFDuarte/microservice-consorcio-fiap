/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nubank.fiap.consorcio.repository;

import com.nubank.fiap.consorcio.domain.Consorcio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Gabriel Duarte
 */
@Repository
public interface ConsorcioRepository extends JpaRepository<Consorcio, Long> {

    @Query(
            value = "SELECT * FROM CONSORCIO WHERE CATEGORIA=:categoria",
            nativeQuery = true)
    List<Consorcio> findAllByCategory(
            @Param("categoria") String categoria);
}
