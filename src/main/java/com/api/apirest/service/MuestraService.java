/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.apirest.service;

import com.api.apirest.entity.Semana1;
import java.util.List;


public interface MuestraService {
    public List<Semana1> getMuestras();
    public float getMax();
    public float getMin();
    public List getMinPorSemana();
    public List getMaxPorSemana();
}
