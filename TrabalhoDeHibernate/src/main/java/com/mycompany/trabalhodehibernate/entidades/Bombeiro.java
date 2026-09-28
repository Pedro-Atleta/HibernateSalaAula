/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhodehibernate.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;


@Entity
@Table (name = "Bombeiro")
public class Bombeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name ="bom_cpf", length = 11, unique = true, nullable = false)
    private String cpf;
    @Column(name ="bom_data_nascimento", nullable = false)
    private LocalDate data_nascimento;
    @Column(name ="bom_completo", nullable = false, length = 45)
    private String nome_completo;
    @Column(name ="bom_nome_guerra", unique = true, nullable = false, length = 45)
    private String nome_guerra;

    public Bombeiro() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getNome_guerra() {
        return nome_guerra;
    }

    public void setNome_guerra(String nome_guerra) {
        this.nome_guerra = nome_guerra;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bombeiro) {
            Bombeiro aux = (Bombeiro) obj;

            if (aux.getId().equals(this.id) && (aux.getCpf().equals(this.cpf))) {
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