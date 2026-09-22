/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhodehibernate.entidades;

import java.time.LocalDate;

public class Bombeiro {

    private Integer id;
    private String cpf;
    private LocalDateDate data_nascimento;
    private String nome_completo;
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

    public LocalDateDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDateDate data_nascimento) {
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
            Bombeiro aux = (Bombeiro)obj;
            
            if (aux.getId().equals(this.id)) && (aux.getCpf().equals(this.cpf)) }{
                
            }
        } else {
            return false;
        }
    }
}
