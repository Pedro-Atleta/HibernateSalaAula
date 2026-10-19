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
import java.time.LocalDate;


@Entity
@Table (name = "Bombeiro_has_Patente") 
public class BombeiroHasPatente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name ="data", unique = true, nullable = false)
    private LocalDate data;
    
    @ManyToOne
    @JoinColumn(name = "bom_id", unique = true)
    private Bombeiro bombeiro;
    
    public BombeiroHasPatente(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Bombeiro getBombeiro() {
        return bombeiro;
    }

    public void setBombeiro(Bombeiro bombeiro) {
        this.bombeiro = bombeiro;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BombeiroHasPatente) {
            BombeiroHasPatente aux = (BombeiroHasPatente) obj;

            if (aux.getId().equals(this.id) && (aux.getData().equals(this.data))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
