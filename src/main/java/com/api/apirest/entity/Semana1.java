/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.apirest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author vicec
 */
@Entity
@Table(name = "semana1")
@NoArgsConstructor  
@AllArgsConstructor  
@ToString  

public class Semana1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter Long id;
    @Getter @Setter float m1;
    @Getter @Setter float m2;
    @Getter @Setter float m3;
    @Getter @Setter float m4;
    @Getter @Setter float m5;
    @Getter @Setter float m6;
    @Getter @Setter float m7;
    @Getter @Setter float m8;
    
}
