package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");
        JavaLanguage jb = context.getBean("Java", JavaLanguage.class);
        System.out.println("Called by Bean: "+jb.learningJava());
        System.out.println("Called by Bean: "+jb.learningPython());

    }
}