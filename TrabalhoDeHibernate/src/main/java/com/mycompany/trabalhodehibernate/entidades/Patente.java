/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhodehibernate.entidades;

/**
 *
 * @author aluno
 */

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table (name = "Patente") 
public class Patente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "pat_sigla", unique = true, nullable = false)
    private String sigla;
    
    @Column(name = "pat_descricao", unique = true, nullable = false)
    private String descricao;
    
    private Set<Bombeiro> bombeiro = new HashSet<Bombeiro>();
    

    public Patente(){
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Patente) {
            Patente aux = (Patente) obj;

            if (aux.getId().equals(this.id) && (aux.getDescricao().equals(this.descricao))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
