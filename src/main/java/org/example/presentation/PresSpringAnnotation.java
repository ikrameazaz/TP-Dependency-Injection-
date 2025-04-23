package org.example.presentation;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.DAO", "org.example.metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("RES"+ metier.calcul());



    }
}
