/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.apirest.entity;

/**
 *
 * @author vicec
 */
public class MaximosSemana {
    
    int id;
    float muestra;

    public MaximosSemana() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMuestra() {
        return muestra;
    }

    public void setMuestra(float muestra) {
        this.muestra = muestra;
    }

    @Override
    public String toString() {
        return "MaximosSemana{" + "id=" + id + ", muestra=" + muestra + '}';
    }
    
    
    
}
