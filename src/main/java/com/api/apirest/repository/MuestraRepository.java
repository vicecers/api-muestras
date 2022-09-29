/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.apirest.repository;

import com.api.apirest.entity.Semana1;
import java.util.List;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vicec
 */
@Repository
public interface MuestraRepository extends JpaRepository<Semana1, Long> {

    @Query(value = "select Max(GREATEST(m1,m2,m3,m4,m5,m6,m7,m8)) from semana1", nativeQuery = true)
    float maximo();

    @Query(value = "select MIN(LEAST(m1,m2,m3,m4,m5,m6,m7,m8)) from semana1;", nativeQuery = true)
    float minimo();
    
    @Query(value = " select id, (LEAST(m1,m2,m3,m4,m5,m6,m7,m8)) from semana1", nativeQuery = true)
    List minimoPorSemana();
   
    @Query(value = " select id, (GREATEST(m1,m2,m3,m4,m5,m6,m7,m8)) from semana1", nativeQuery = true)
    List maximoPorSemana();
   
}
