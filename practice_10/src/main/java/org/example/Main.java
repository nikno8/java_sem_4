package org.example;

import org.example.components.Senior;
import org.example.configuration.ProgrammerConfiguration;
import org.example.interfaces.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProgrammerConfiguration.class);
        Programmer junior = (Programmer) applicationContext.getBean("Junior");
        Programmer middle = (Programmer) applicationContext.getBean("Middle");
        Programmer senior = applicationContext.getBean(Senior.class);

        junior.doCoding();
        middle.doCoding();
        senior.doCoding();

    }
}