/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhodehibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateUtil {
    private static final SessionFactory factory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory(){
        return new Configuration().configure().buildSessionFactory();
    } catch(Throwable erro){
    throw new ExceptionInInitializerError(erro);
}
}