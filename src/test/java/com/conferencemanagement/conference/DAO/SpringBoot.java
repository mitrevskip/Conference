/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conferencemanagement.conference.DAO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;

/**
 *
 * @author Mario HP
 */
@SpringBootApplication
@ComponentScan("com.conferencemanagement.conference.DAO")
@TestPropertySource(locations="classpath:applicationTest.properties")
class SpringBoot {
    
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBoot.class, args);
        
    }
}
