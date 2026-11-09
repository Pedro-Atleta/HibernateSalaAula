/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhodehibernate.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author aluno
 */
@PrimaryKeyJoinColumn(name = "id")
public class UnidadeDeResgate extends Viatura{
    @Id
    @Column(name = "uni_id")
    private Integer id;
    @Column(name = "uni_capacidade", unique = false, nullable = false)
    private Integer capacidade;
    
    
    public UnidadeDeResgate(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UnidadeDeResgate) {
            UnidadeDeResgate aux = (UnidadeDeResgate) obj;

            if (aux.getId().equals(this.id) && (aux.getCapacidade().equals(this.capacidade))) {
                return true;
            }else{
                return false;
            }
        } else {
            return false;
        }
    }


    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
