package com.codingninja.kzr.Intro.IntroDemo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "deploy.env", havingValue = "development")
public class DevDB implements DB{

    public void getDB(){
        System.out.println("DevDB");
    }
}
