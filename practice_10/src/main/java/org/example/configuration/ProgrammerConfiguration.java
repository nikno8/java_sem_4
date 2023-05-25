package org.example.configuration;

import org.example.components.Junior;
import org.example.components.Middle;
import org.example.components.Senior;
import org.example.interfaces.Programmer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProgrammerConfiguration {
    @Bean("Junior")
    public Programmer junior(){
        return new Junior();
    }

    @Bean("Middle")
    public Programmer middle(){
        return new Middle();
    }

    @Bean("Senior")
    public Programmer senior(){
        return new Senior();
    }
}
