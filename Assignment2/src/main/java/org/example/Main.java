package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        PythonLanguage p = new PythonWorld();
        JavaLanguage j = new JavaWorld(p);
        System.out.println("Called by Object: "+j.learningJava());
        System.out.println("Called by Object: "+j.learningPython()+"\n");

        ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");
        JavaLanguage jb = context.getBean("Framework", JavaLanguage.class);
        System.out.println("Called by Bean: "+jb.learningJava());
        System.out.println("Called by Bean: "+jb.learningPython());
    }
}