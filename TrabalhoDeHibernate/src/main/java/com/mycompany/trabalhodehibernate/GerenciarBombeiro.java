/*******************************************************************************
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *//////////////////////////////////////////////////////////////////////////////
package com.mycompany.trabalhodehibernate;

import com.mycompany.trabalhodehibernate.entidades.Bombeiro;
import com.mycompany.trabalhodehibernate.util.hibernateUtil;
import java.time.LocalDate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aluno
 */
public class GerenciarBombeiro {
    public static void main(String[] args) {
        Session sessao = hibernateUtil.getSessionFactory().openSession();
        
        System.out.println("Sessão estabelecida");
        Transaction transacao = null;
            
        Bombeiro bombeiro = new Bombeiro();
        bombeiro.setCpf("12345678");
        bombeiro.setData_nascimento(LocalDate.of(2000, 5, 16));
        bombeiro.setNome_completo("Ciclano Pinto");
        bombeiro.setNome_guerra("Pinto");
        
        try{
            transacao = sessao.beginTransaction();
            
            sessao.persist(bombeiro);
            
            transacao.commit();
            System.out.println("Bombeiro 'salvo' ");
            sessao.close();
        }catch (Exception e){
            if (transacao != null) {
                transacao.rollback();
            }
        }
        
        hibernateUtil.shutdonw();
    }
}
