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
public class AutoEscala extends Viatura{
    @Id
    @Column(name = "esc_id")
    private Integer id;
    @Column(name = "esc_alturaMax", unique = false, nullable = false)
    private Integer alturaMax;
    
    public AutoEscala(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(Integer alturaMax) {
        this.alturaMax = alturaMax;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AutoEscala) {
            AutoEscala aux = (AutoEscala) obj;

            if (aux.getId().equals(this.id) && (aux.getAlturaMax().equals(this.alturaMax))) {
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
